package fr.umontpellier.iut.exo1;

public class GestionEtudiants {
    public static void main(String[] args) {
        Departement monDepInfo;
        monDepInfo = new Departement("Info","3 rue au loup");

        Etudiant lolo,toto,titi,tata;
        lolo = new Etudiant("Bichon","Lolie","lolibichon@gmail.com","Rue de la paix",1998,11,24);
        toto = new Etudiant("BN","Jorge","jorgebn@gmail.com","Rue de la foix",1998,12,21);
        titi = new Etudiant("Louf","Seb","looouf@gmail.com","Rue de la saucisse",1999,8,10);
        tata = new Etudiant("Crocs","Nathan","jCroc@gmail.com","Rue de la france",1998,7,8);

        toto.setNom(lolo.getNom());

        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(titi);
        monDepInfo.inscrire(tata);

        System.out.println(monDepInfo);

        monDepInfo.desinscrire(toto);

        System.out.println("\ntoto est desinscrit\n");

        System.out.println(monDepInfo);

        System.out.println(toto); //On voit que le fait de désinscrire toto supprime juste la référence dans la liste et non l'objet en lui meme.
    }
}
