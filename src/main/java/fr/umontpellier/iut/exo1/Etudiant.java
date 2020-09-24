package fr.umontpellier.iut.exo1;
import java.time.LocalDate;

public class Etudiant {

    private String nom, prenom, adressemail, adressepostal;
    private LocalDate datenaissance;

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
}