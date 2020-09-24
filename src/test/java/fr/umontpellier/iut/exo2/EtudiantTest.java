package fr.umontpellier.iut.exo2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EtudiantTest {
    Etudiant lolo;
    Professeur prof_math;
    Professeur prof_compta;

    @BeforeEach
    void Initialisation(){
        lolo = new Etudiant("Bichon","Lolie","lolibichon@gmail.com","Rue de la paix",1998,11,24);
        prof_math = new Professeur("Bouh", "Bob");
        prof_compta = new Professeur("Salute", "Jean");
    }


    @Test
    void test_calculer_moyenne_retourne_0_Quand_Pas_De_Note(){
        assertEquals(lolo.calculerMoyenne(), 0);
    }

    @Test
    void test_calculer_moyenne_retourne_valeur_note_quand_une_seule_note(){
        Matiere matiere_informatique = new Matiere("Math", 1, prof_math);
        lolo.noter(matiere_informatique, 10);
        assertEquals(lolo.calculerMoyenne(), 10);
    }

    @Test
    void  test_calculer_moyenne_retourne_valeur_note_ponderee_quand_une_seule_note_avec_coefficient(){
        lolo.noter(new Matiere("Math", 2, prof_math), 14);
        lolo.noter(new Matiere("Comptabilite", 2, prof_compta), 10);
        assertEquals((double)(lolo.calculerMoyenne()), (double)(((14*2+10*2)/4)));
    }

    @Test
    void test_calculer_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients(){
        lolo.noter(new Matiere("Math", 2, prof_math), 14);
        lolo.noter(new Matiere("Comptabilite", 4, prof_compta), 10);
        assertEquals((double)(((14.0*2.0+10.0*4.0)/6.0)),(double)(lolo.calculerMoyenne()));

        /*On oblige le test a faire des calculs avec des doubles en ajoutant un ".0" sinon il ferra un calcul en int (soit (14*2+10*4)/6 = 11
        qu'il convertira en double, ce qui donne 11.0 et donc fausse le test*/

    }
}