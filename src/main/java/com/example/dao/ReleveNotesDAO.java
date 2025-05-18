package com.example.dao;

import com.example.model.ReleveNotes;
import java.sql.*;
import java.util.*;

public class ReleveNotesDAO {
    private String jdbcURL = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "";

    public List<ReleveNotes> getAll() {
        List<ReleveNotes> liste = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM releve_notes")) {

            while (rs.next()) {
                ReleveNotes r = new ReleveNotes();
                r.setId(rs.getInt("id"));
                r.setNomEtudiant(rs.getString("nom_etudiant"));
                r.setMatiere(rs.getString("matiere"));
                r.setNote(rs.getDouble("note"));
                liste.add(r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }
}
