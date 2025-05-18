package com.example.model;

public class Notes {
    private int id;
    private int etudiantId;
    private String matiere;
    private double note;

    public Notes() {
    }

    public Notes(int id, int etudiantId, String matiere, double note) {
        this.id = id;
        this.etudiantId = etudiantId;
        this.matiere = matiere;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEtudiantId() {
        return etudiantId;
    }

    public void setEtudiantId(int etudiantId) {
        this.etudiantId = etudiantId;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
}
