package fr.mediametrie.exercice.model;

public class Individu {

    private final Integer id;

    public Individu(final Integer id) {
        super();
        this.id = id;
    }

    private LienParenteEnum lien;

    public LienParenteEnum getLien() {
        return lien;
    }

    public void setLien(final LienParenteEnum lien) {
        this.lien = lien;
    }

}
