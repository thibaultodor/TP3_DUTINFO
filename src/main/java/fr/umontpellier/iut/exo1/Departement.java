package fr.umontpellier.iut.exo1;
import java.util.ArrayList;
import java.util.List;

public class Departement {
    private String Spécialité;
    private String adresse;
    private List<Etudiant> tabEtudiant = new ArrayList<>();

    public Departement(String spécialité, String Adresse) {
        Spécialité = spécialité;
        adresse = Adresse;
    }

    public String toString(){
        return tabEtudiant.toString();
    }

    public void inscrire (Etudiant unetudiant){
        tabEtudiant.add(unetudiant);
    }

    public void desinscrire (Etudiant unetudiant){
        tabEtudiant.remove(unetudiant);
    }
}