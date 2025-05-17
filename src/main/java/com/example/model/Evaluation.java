package com.example.model;

public class Evaluation {
    private int id;
    private String matiere;
    private String dateEval;
    private int idEtud;

    public Evaluation() {}
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMatiere() { return matiere; }
    public void setMatiere(String matiere) { this.matiere = matiere; }

    public String getDateEval() { return dateEval; }
    public void setDateEval(String dateEval) { this.dateEval = dateEval; }

    public int getIdEtud() { return idEtud; }
    public void setIdEtud(int idEtud) { this.idEtud = idEtud; }
}
