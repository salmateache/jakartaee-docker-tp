package com.example.model;

public class ReleveNotes {
    private int id;
    private String nomEtudiant;
    private String matiere;
    private double note;

    // Constructeur vide
    public ReleveNotes() {}

    // Getters
    public int getId() {
        return id;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public String getMatiere() {
        return matiere;
    }

    public double getNote() {
        return note;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public void setNote(double note) {
        this.note = note;
    }
}

