package com.example.dao;

import com.example.model.Etudiant;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object pour les opérations sur les étudiants.
 */
public class EtudiantDAO {

    private String jdbcURL = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "root";

    /**
     * Récupère un étudiant par son ID.
     *
     * @param id L'ID de l'étudiant.
     * @return L'étudiant correspondant à l'ID, ou null si non trouvé.
     */
    public Etudiant getEtudiantById(int id) {
        Etudiant etudiant = null;
        String sql = "SELECT * FROM etudiant WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                etudiant = new Etudiant();
                etudiant.setId(rs.getInt("id"));
                etudiant.setNom(rs.getString("nom"));
                etudiant.setPrenom(rs.getString("prenom"));
                etudiant.setEmail(rs.getString("email"));
                etudiant.setDateNaissance(
                        rs.getDate("date_naissance") != null ? rs.getDate("date_naissance").toLocalDate() : null);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return etudiant;
    }

    /**
     * Récupère tous les étudiants.
     *
     * @return La liste de tous les étudiants.
     */
    public List<Etudiant> getAll() {
        List<Etudiant> etudiants = new ArrayList<>();
        String sql = "SELECT * FROM etudiant";
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Etudiant etudiant = new Etudiant();
                etudiant.setId(rs.getInt("id"));
                etudiant.setNom(rs.getString("nom"));
                etudiant.setPrenom(rs.getString("prenom"));
                etudiant.setEmail(rs.getString("email"));
                etudiant.setDateNaissance(
                        rs.getDate("date_naissance") != null ? rs.getDate("date_naissance").toLocalDate() : null);
                etudiants.add(etudiant);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return etudiants;
    }

    /**
     * Ajoute un nouvel étudiant.
     *
     * @param etudiant L'étudiant à ajouter.
     */
    public void ajouterEtudiant(Etudiant etudiant) {
        String sql = "INSERT INTO etudiant (nom, prenom, email, date_naissance) VALUES (?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, etudiant.getNom());
            stmt.setString(2, etudiant.getPrenom());
            stmt.setString(3, etudiant.getEmail());
            stmt.setObject(4, etudiant.getDateNaissance() != null ? Date.valueOf(etudiant.getDateNaissance()) : null);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Modifie les informations d'un étudiant existant.
     *
     * @param etudiant L'étudiant avec les informations mises à jour.
     */
    public void modifierEtudiant(Etudiant etudiant) {
        String sql = "UPDATE etudiant SET nom = ?, prenom = ?, email = ?, date_naissance = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, etudiant.getNom());
            stmt.setString(2, etudiant.getPrenom());
            stmt.setString(3, etudiant.getEmail());
            stmt.setObject(4, etudiant.getDateNaissance() != null ? Date.valueOf(etudiant.getDateNaissance()) : null);
            stmt.setInt(5, etudiant.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Supprime un étudiant par son ID.
     *
     * @param id L'ID de l'étudiant à supprimer.
     */
    public void supprimerEtudiant(int id) {
        String sql = "DELETE FROM etudiant WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}