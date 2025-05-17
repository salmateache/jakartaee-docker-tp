package com.example.dao;

import com.example.model.Evaluation;
import java.sql.*;
import java.util.*;

public class EvaluationDAO {
    private String jdbcURL = "jdbc:mysql://mysql:3306/evaluations_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "";

    public List<Evaluation> getAll() {
        List<Evaluation> liste = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM evaluation")) {

            while (rs.next()) {
                Evaluation e = new Evaluation();
                e.setId(rs.getInt("id"));
                e.setMatiere(rs.getString("matiere"));
                e.setDateEval(rs.getString("date_eval"));
                e.setIdEtud(rs.getInt("id_etud"));
                liste.add(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }
}
