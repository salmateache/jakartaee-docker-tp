package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.model.DatabaseConnection;
import com.example.model.GestionNotes;

public class GestionNotesDAO {

    public void ajouterNote(GestionNotes note) {
        String sql = "INSERT INTO gestionnotes (idEtudiant, idEvaluation, valeur) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, note.getIdEtudiant());
            stmt.setInt(2, note.getIdEvaluation());
            stmt.setDouble(3, note.getValeurNote());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public List<GestionNotes> getAllNotes() {
        List<GestionNotes> notes = new ArrayList<>();
        String sql = "SELECT * FROM gestionnotes";

        try (Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                GestionNotes note = new GestionNotes();
                note.setId(rs.getInt("id"));
                note.setIdEtudiant(rs.getInt("idEtudiant"));
                note.setIdEvaluation(rs.getInt("idEvaluation"));
                note.setValeurNote(rs.getDouble("valeur"));
                notes.add(note);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return notes;
    }

}
