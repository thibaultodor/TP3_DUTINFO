package fr.umontpellier.iut.exo3;

import java.time.LocalDate;

public class EtudiantTelescopique {

    private String nom, prenom, adressemail, adressepostal;
    private LocalDate datenaissance;

    public EtudiantTelescopique(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public EtudiantTelescopique(String nom, String prenom,int uneannenaissance, int uunmoisnaissance, int unjournaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = LocalDate.of(uneannenaissance, uunmoisnaissance, unjournaissance);
    }

    public EtudiantTelescopique(String nom, String prenom, String adressemail) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressemail = adressemail;
    }

/*
        Réponse exo 3 question 2 : Il n'est pas possible de créer un constructeur avec nom, prenom, adressepostal
        car il est de la meme forme que nom prenom adressemail ( String String String )
*/

    public String toString() {
        return ("\nNom : "+nom+"\nPrenom :"+
                prenom+"\nDate de naissance :"+
                datenaissance+"\nAdresse email :"+
                adressemail+"\nAdresse postal :"+
                adressepostal+"\n");
    }
}
