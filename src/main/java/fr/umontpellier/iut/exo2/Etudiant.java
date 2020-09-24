package fr.umontpellier.iut.exo2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Etudiant {

    private String nom, prenom, adressemail, adressepostal;
    private LocalDate datenaissance;
    private List<Note> LNote = new ArrayList<>();

    public Etudiant(String unnom, String unprenom, String uneadressemail, String uneadressepostal, int uneannenaissance, int uunmoisnaissance, int unjournaissance){
        nom = unnom;
        prenom = unprenom;
        adressemail = uneadressemail;
        adressepostal = uneadressepostal;
        datenaissance = LocalDate.of(uneannenaissance, uunmoisnaissance, unjournaissance);
    }

    public String toString() {
        return ("\nNom : "+nom+"\nPrenom :"+
                prenom+"\nDate de naissance :"+
                datenaissance+"\nAdresse email :"+
                adressemail+"\nAdresse postal :"+
                adressepostal+"\n");
    }

    public void setNom(String unnom){
        nom = unnom;
    }

    public String getNom(){
        return nom;
    }

    public void noter(Matiere MatiereNote, double laNote){
        LNote.add(new Note(MatiereNote,laNote));
    }

    public double calculerMoyenne(){
        if(LNote.isEmpty()){
            return 0;
        }
        double sum = 0;
        double div = 0;
        for (Note noteCourante: LNote) {
            sum += (noteCourante.getNote()*noteCourante.getMatiere().getCoefficient());
            div += (1*noteCourante.getMatiere().getCoefficient());
        }
        return sum/div;
    }
}