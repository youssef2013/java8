package fr.mediametrie.exercice.service;

import java.util.Collection;
import java.util.Map;

import fr.mediametrie.exercice.model.Foyer;
import fr.mediametrie.exercice.model.Individu;

public class FoyerHelper {

    /**
     * Determine l'individu d'un foyer ayant le lien qui vaut <tt>LienParenteEnum.CHEF</tt>.
     * @param foyer Foyer dans lequel l'on recherche le chef
     * @return l'<tt>Individu</tt> qui a le lien chef s'il existe, <tt>null</tt> sinon
     * @throws DoublonChefDansFoyerException s'il y a plusieurs individus dans ce foyer ayant le lien qui vaut
     *             <tt>LienParenteEnum.CHEF</tt>
     */
    public static Individu findChef(final Foyer foyer) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Determine l'ensemble des individus ayant le lien qui vaut <tt>LienParenteEnum.CHEF</tt> au sein d'une liste de
     * foyer.
     * @param foyers Ensemble de <tt>Foyer</tt>
     * @return une liste d'<tt>Individu</tt> qui ont le lien chef
     */
    public static Collection<Individu> findChefs(final Collection<Foyer> foyers) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Determine l'ensemble des individus ayant le lien qui vaut <tt>LienParenteEnum.CHEF</tt> au sein d'une liste de
     * foyer dans l'ordre des identifiants de leur foyer.
     * @param foyers Ensemble de <tt>Foyer</tt>
     * @return une liste d'<tt>Individu</tt>
     */
    public static Collection<Individu> findChefsOrderByFoyerId(final Collection<Foyer> foyers) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Trie une liste de foyers en fonction du nomnbre d'individu décroissant et de leur identifiant.
     * @param foyers Ensemble de <tt>Foyer</tt>
     * @return une liste de <tt>Foyer</tt>
     */
    public static Collection<Foyer> orderFoyerBySize(final Collection<Foyer> foyers) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Regroupe les individus par le foyer auquel ils sont relies
     * @param individuMap <tt>Map</tt> indiquant pour chaque <tt>Individu</tt> le <tt>Foyer</tt> auquel il est lie
     * @return <tt>Map</tt> indiquant pour chaque <tt>Foyer</tt> la liste des <tt>Individu</tt> qui lui sont lies.
     */
    public static Map<Foyer, Collection<Individu>> reverseIndividuMap(final Map<Individu, Foyer> individuMap) {
        // TODO Auto-generated method stub
        return null;
    }

}
