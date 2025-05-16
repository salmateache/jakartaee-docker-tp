package com.example.dao;

import com.example.model.Etudiant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object pour les opérations sur les étudiants.
 * (Ceci est une implémentation simplifiée qui utilise une liste en mémoire.
 * Dans une application réelle, ceci interagirait avec une base de données.)
 */
public class EtudiantDAO {

    private static List<Etudiant> etudiants = new ArrayList<>();

    // Initialisation (remplacez par une requête à la base de données)
    static {
        etudiants.add(new Etudiant(1, "Daaif", "Achraf", "ad@univ.ma", LocalDate.of(2000, 1, 1)));
        etudiants.add(new Etudiant(2, "Marimi", "Jamila", "jam@univ.ma", LocalDate.of(1999, 5, 10)));
        etudiants.add(new Etudiant(3, "Bodan", "Lahcen", "luc@univ.ma", LocalDate.of(2001, 11, 20)));
    }

    /**
     * Récupère un étudiant par son ID.
     *
     * @param id L'ID de l'étudiant.
     * @return L'étudiant correspondant à l'ID, ou null si non trouvé.
     */
    public Etudiant getEtudiantById(int id) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getId() == id) {
                return etudiant;
            }
        }
        return null;
    }

    /**
     * Récupère tous les étudiants.
     *
     * @return La liste de tous les étudiants.
     */
    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }

    /**
     * Ajoute un nouvel étudiant.
     *
     * @param etudiant L'étudiant à ajouter.
     */
    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    /**
     * Modifie les informations d'un étudiant existant.
     *
     * @param etudiant L'étudiant avec les informations mises à jour.
     */
    public void modifierEtudiant(Etudiant etudiant) {
        for (int i = 0; i < etudiants.size(); i++) {
            if (etudiants.get(i).getId() == etudiant.getId()) {
                etudiants.set(i, etudiant);
                return;
            }
        }
    }

    /**
     * Supprime un étudiant par son ID.
     *
     * @param id L'ID de l'étudiant à supprimer.
     */
    public void supprimerEtudiant(int id) {
        etudiants.removeIf(etudiant -> etudiant.getId() == id);
    }

    public List<Etudiant> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
}