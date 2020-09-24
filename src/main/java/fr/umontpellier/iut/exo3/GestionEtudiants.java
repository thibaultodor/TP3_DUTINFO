package fr.umontpellier.iut.exo3;

public class GestionEtudiants {
    public static void main(String[] args) {
        //EtudiantTelescopique
        EtudiantTelescopique lolo,toto,titi,tata;

        lolo = new EtudiantTelescopique("Bichon","Lolie");
        toto = new EtudiantTelescopique("BN","Jorge",1998,12,21);
        titi = new EtudiantTelescopique("Louf","Seb","looouf@gmail.com");

        System.out.println(lolo.toString());
        System.out.println(toto.toString());
        System.out.println(titi.toString());

        //JavaBeans
        EtudiantJavaBeans jorge = new EtudiantJavaBeans();
        jorge.setNom("Dupont");
        jorge.setPrenom("Jean");

        jorge.setDatenaissance(1998,12,21);
        jorge.setAdressemail("Zouf@gmail.com");
        jorge.setAdressepostal("5 rue de la paix");

        /*Inconvenients :
        * 1 : Les sets doivent obligatoirement etre à la suite pour éviter les erreurs contrairement au Etudiant telescopique qui est un "bloc"
        *     Ca peut donc créer des érreurs plus tard.
        * 2 : Probleme de sécurité : Si il est demandé de ne pas pouvoir modifier certaines valeurs cette methode permet de tout modifier.
        * Avantage :
        * On peut créer un objet avec comme vu pour EtudiantTelescopique de seulement prenom (ce qui n'est pas possible avec EtudiantTelescopique)*/

        Etudiant Mike = new Etudiant.EtudiantBuilder()
                .ajouterNom("Dupont")
                .ajouterPrenom("Philippe")
                .ajouterDateNaissance(1998,12,21)
                .ajouterMail("dupont@etu.umontpellier.fr")
                .ajouterAdresse("1, av. des Champs-Elysées, 75008 Paris")
                .build();

        System.out.println(Mike.toString());
    }
}
