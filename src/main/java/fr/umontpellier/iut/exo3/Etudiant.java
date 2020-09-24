package fr.umontpellier.iut.exo3;
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

    public Etudiant(String nom, String prenom, String adressemail, String adressepostal, LocalDate datenaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressemail = adressemail;
        this.adressepostal = adressepostal;
        this.datenaissance = datenaissance;
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

    public static class EtudiantBuilder{
        private String nom, prenom, adressemail, adressepostal;
        private LocalDate datenaissance;

        public Etudiant build(){
            return new Etudiant(nom,prenom,adressemail,adressepostal,datenaissance);
        }

        public EtudiantBuilder ajouterNom(String nom) {
            this.nom = nom;
            return this;
        }

        public EtudiantBuilder ajouterPrenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public EtudiantBuilder ajouterMail(String adressemail) {
            this.adressemail = adressemail;
            return this;
        }

        public EtudiantBuilder ajouterAdresse(String adressepostal) {
            this.adressepostal = adressepostal;
            return this;
        }

        public EtudiantBuilder ajouterDateNaissance(int uneannenaissance, int uunmoisnaissance, int unjournaissance) {
            this.datenaissance = LocalDate.of(uneannenaissance, uunmoisnaissance, unjournaissance);
            return this;
        }
    }
}