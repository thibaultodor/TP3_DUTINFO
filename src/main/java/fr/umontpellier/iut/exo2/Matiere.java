package fr.umontpellier.iut.exo2;

public class Matiere {

    private String Intitulé;
    private float Coefficient;
    private Professeur Prof;

    public Matiere(String intitulé, float coefficient, Professeur prof) {
        Intitulé = intitulé;
        Coefficient = coefficient;
        Prof = prof;
    }

    public float getCoefficient(){
        return Coefficient;
    }
}
