package fr.umontpellier.iut.exo2;

public class Note {

    private Matiere Matiere;
    private double Note;

    public Note(Matiere matiere, double note) {
        Matiere = matiere;
        Note = note;
    }

    public Matiere getMatiere(){
        return Matiere;
    }

    public double getNote(){
        return Note;
    }
}
