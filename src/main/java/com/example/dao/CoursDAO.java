package com.example.dao;

import com.example.model.Cours;
import java.sql.*;
import java.util.*;

public class CoursDAO {
    private String jdbcURL = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "";

    public List<Cours> getAll() {
        List<Cours> liste = new ArrayList<>();
        String sql = "SELECT * FROM cours";

        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Cours c = new Cours();
                c.setIdCours(rs.getInt("idCours"));
                c.setNomCours(rs.getString("nomCours"));
                c.setCodeCours(rs.getString("codeCours"));
                c.setCredits(rs.getInt("credits"));
                liste.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return liste;
    }
}
