package com.example.model;

public class GestionNotes {
    private int id;
    private int idEtudiant;
    private int idEvaluation;
    private double valeurNote;

    // Constructeurs
    public GestionNotes() {}

    public GestionNotes(int idEtudiant, int idEvaluation, double valeurNote) {
        this.idEtudiant = idEtudiant;
        this.idEvaluation = idEvaluation;
        this.valeurNote = valeurNote;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public double getValeurNote() {
        return valeurNote;
    }

    public void setValeurNote(double valeurNote) {
        this.valeurNote = valeurNote;
    }
}
