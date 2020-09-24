package fr.umontpellier.iut.exo3;

import java.time.LocalDate;

public class EtudiantJavaBeans {

    private String nom, prenom, adressemail, adressepostal;
    private LocalDate datenaissance;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdressemail(String adressemail) {
        this.adressemail = adressemail;
    }


    public void setAdressepostal(String adressepostal) {
        this.adressepostal = adressepostal;
    }

    public void setDatenaissance(int uneannenaissance, int uunmoisnaissance, int unjournaissance) {
        this.datenaissance = LocalDate.of(uneannenaissance, uunmoisnaissance, unjournaissance);
    }
}