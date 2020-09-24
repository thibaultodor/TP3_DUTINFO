package fr.umontpellier.iut.exo2;

public class GestionEtudiants {
    public static void main(String[] args) {
        Professeur prof_math = new Professeur("Bouh", "Bob");
        Professeur prof_compta = new Professeur("Salute", "Jean");

        Etudiant lolo = new Etudiant("Bichon","Lolie","lolibichon@gmail.com","Rue de la paix",1998,11,24);
        Etudiant toto = new Etudiant("BN","Jorge","jorgebn@gmail.com","Rue de la foix",1998,12,21);
        Etudiant titi = new Etudiant("Louf","Seb","looouf@gmail.com","Rue de la saucisse",1999,8,10);
        Etudiant tata = new Etudiant("Crocs","Nathan","jCroc@gmail.com","Rue de la france",1998,7,8);

        Matiere Math = new Matiere("Math", 2, prof_math);
        Matiere Compta = new Matiere("Comptabilite", 5, prof_compta);

        lolo.noter(Math,14);    //Si Note rentré n'est pas de la forme (14.5) la classe Note fait automatiquement conversion Int en Double.
        toto.noter(Math,10.5);
        titi.noter(Math,17);
        tata.noter(Math,18);

        lolo.noter(Compta,20);
        toto.noter(Compta,8);
        titi.noter(Compta,11.5);
        tata.noter(Compta,4);

        System.out.println("Monsieur/Madame "+lolo.getNom()+" possede une moyenne de : "+lolo.calculerMoyenne());
        System.out.println("Monsieur/Madame "+toto.getNom()+" possede une moyenne de : "+toto.calculerMoyenne());
        System.out.println("Monsieur/Madame "+titi.getNom()+" possede une moyenne de : "+titi.calculerMoyenne());
        System.out.println("Monsieur/Madame "+tata.getNom()+" possede une moyenne de : "+tata.calculerMoyenne());
    }
}
