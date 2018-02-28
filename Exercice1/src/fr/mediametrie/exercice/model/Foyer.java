package fr.mediametrie.exercice.model;

import java.util.ArrayList;
import java.util.List;

public class Foyer {

    private final List<Individu> individus = new ArrayList<Individu>();

    private final Integer id;

    public Foyer(final Integer id) {
        super();
        this.id = id;
    }

    public List<Individu> getIndividus() {
        return individus;
    }

    public void addIndividu(final Individu individu) {
        individus.add(individu);
    }

}
