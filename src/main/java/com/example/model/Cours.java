package com.example.model;

public class Cours {
    private int idCours;
    private String nomCours;
    private String codeCours;
    private int credits;

    // Getters
    public int getIdCours() { return idCours; }
    public String getNomCours() { return nomCours; }
    public String getCodeCours() { return codeCours; }
    public int getCredits() { return credits; }

    // Setters
    public void setIdCours(int idCours) { this.idCours = idCours; }
    public void setNomCours(String nomCours) { this.nomCours = nomCours; }
    public void setCodeCours(String codeCours) { this.codeCours = codeCours; }
    public void setCredits(int credits) { this.credits = credits; }
}
