package com.example.dao;

import com.example.model.Notes;
import java.sql.*;
import java.util.*;

public class NotesDAO {
    private String jdbcURL = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "";

    public List<Notes> getAll() {
        List<Notes> notesList = new ArrayList<>();
        String sql = "SELECT * FROM notes";

        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Notes n = new Notes();
                n.setId(rs.getInt("id"));
                n.setEtudiantId(rs.getInt("etudiant_id"));
                n.setMatiere(rs.getString("matiere"));
                n.setNote(rs.getDouble("note"));
                notesList.add(n);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return notesList;
    }
}
