package fr.mediametrie.exercice.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import fr.mediametrie.exercice.model.Foyer;
import fr.mediametrie.exercice.model.Individu;
import fr.mediametrie.exercice.model.LienParenteEnum;

public class FoyerHelperTest {

    @Test
    public void testChercherChefListe() {
        Set<Foyer> foyers = new HashSet<Foyer>();
        Foyer f1 = new Foyer(1);
        Individu individu11 = new Individu(11);
        individu11.setLien(LienParenteEnum.CHEF);
        f1.addIndividu(individu11);
        foyers.add(f1);

        Individu individu12 = new Individu(12);
        individu12.setLien(LienParenteEnum.CONJOINT);
        f1.addIndividu(individu12);
        foyers.add(f1);

        Foyer f2 = new Foyer(2);
        Individu individu21 = new Individu(21);
        individu21.setLien(LienParenteEnum.CONJOINT);
        f2.addIndividu(individu21);
        foyers.add(f2);

        Foyer f3 = new Foyer(3);
        Individu individu31 = new Individu(31);
        individu31.setLien(LienParenteEnum.CONJOINT);
        f3.addIndividu(individu31);
        Individu individu32 = new Individu(32);
        individu32.setLien(LienParenteEnum.CHEF);
        f3.addIndividu(individu32);
        Individu individu33 = new Individu(33);
        individu33.setLien(LienParenteEnum.ENFANT);
        f3.addIndividu(individu33);
        foyers.add(f3);

        Set<Individu> chefsExpected = new HashSet<Individu>();
        chefsExpected.add(individu32);
        chefsExpected.add(individu11);

        Collection<Individu> chefs = FoyerHelper.findChefs(foyers);
        Assert.assertEquals(2, chefs.size());
        Assert.assertTrue(chefsExpected.containsAll(chefs));
        Assert.assertTrue(chefs.containsAll(chefsExpected));

    }

    @Test
    public void testfoyer1ChefIndividu() {
        Foyer f1 = new Foyer(1);
        Individu individu11 = new Individu(11);
        individu11.setLien(LienParenteEnum.CHEF);
        f1.addIndividu(individu11);
        Assert.assertEquals(individu11, FoyerHelper.findChef(f1));
    }

    @Test
    public void testfoyerSansChefIndividu() {
        Foyer f1 = new Foyer(1);
        Individu individu11 = new Individu(11);
        individu11.setLien(LienParenteEnum.CONJOINT);
        f1.addIndividu(individu11);
        Assert.assertNull(FoyerHelper.findChef(f1));
    }

    @Test
    public void testfoyerChefEtConjointIndividu() {
        Foyer f1 = new Foyer(1);
        Individu individu11 = new Individu(11);
        individu11.setLien(LienParenteEnum.CONJOINT);
        f1.addIndividu(individu11);
        Individu individu12 = new Individu(12);
        individu12.setLien(LienParenteEnum.CHEF);
        f1.addIndividu(individu12);
        Assert.assertEquals(individu12, FoyerHelper.findChef(f1));
    }

    @Test(expected = DoublonChefDansFoyerException.class)
    public void testfoyer2Chef() {
        Foyer f1 = new Foyer(1);
        Individu individu11 = new Individu(11);
        individu11.setLien(LienParenteEnum.CHEF);
        f1.addIndividu(individu11);
        Individu individu12 = new Individu(12);
        individu12.setLien(LienParenteEnum.CHEF);
        f1.addIndividu(individu12);
        FoyerHelper.findChef(f1);
        Assert.fail();
    }

    @Test
    public void testChercherChefListeTriee() {
        Set<Foyer> foyers = new HashSet<Foyer>();
        Foyer f1 = new Foyer(1);
        Individu individu11 = new Individu(111);
        individu11.setLien(LienParenteEnum.CHEF);
        f1.addIndividu(individu11);
        foyers.add(f1);

        Individu individu12 = new Individu(12);
        individu12.setLien(LienParenteEnum.CONJOINT);
        f1.addIndividu(individu12);
        foyers.add(f1);

        Foyer f2 = new Foyer(2);
        Individu individu21 = new Individu(21);
        individu21.setLien(LienParenteEnum.CONJOINT);
        f2.addIndividu(individu21);
        foyers.add(f2);

        Foyer f3 = new Foyer(3);
        Individu individu31 = new Individu(31);
        individu31.setLien(LienParenteEnum.CONJOINT);
        f3.addIndividu(individu31);
        Individu individu32 = new Individu(32);
        individu32.setLien(LienParenteEnum.CHEF);
        f3.addIndividu(individu32);
        Individu individu33 = new Individu(33);
        individu33.setLien(LienParenteEnum.ENFANT);
        f3.addIndividu(individu33);
        foyers.add(f3);

        Collection<Individu> chefs = FoyerHelper.findChefsOrderByFoyerId(foyers);
        Assert.assertEquals(2, chefs.size());
        Iterator<Individu> chefIterator = chefs.iterator();
        Assert.assertEquals(individu11, chefIterator.next());
        Assert.assertEquals(individu32, chefIterator.next());

    }

    @Test
    public void testTrierFoyerNbIndividuDecroissantEtIdFoyer() {
        List<Foyer> foyers = new ArrayList<Foyer>();
        Foyer f1 = new Foyer(1);
        Individu individu11 = new Individu(11);
        individu11.setLien(LienParenteEnum.CHEF);
        f1.addIndividu(individu11);
        foyers.add(f1);

        Individu individu12 = new Individu(12);
        individu12.setLien(LienParenteEnum.CONJOINT);
        f1.addIndividu(individu12);
        foyers.add(f1);

        Foyer f2 = new Foyer(2);
        Individu individu21 = new Individu(21);
        individu21.setLien(LienParenteEnum.CONJOINT);
        f2.addIndividu(individu21);
        foyers.add(f2);
        Individu individu22 = new Individu(22);
        individu22.setLien(LienParenteEnum.CONJOINT);
        f2.addIndividu(individu22);
        foyers.add(f2);

        Foyer f3 = new Foyer(3);
        Individu individu31 = new Individu(31);
        individu31.setLien(LienParenteEnum.CONJOINT);
        f3.addIndividu(individu31);
        Individu individu32 = new Individu(32);
        individu32.setLien(LienParenteEnum.CHEF);
        f3.addIndividu(individu32);
        Individu individu33 = new Individu(33);
        individu33.setLien(LienParenteEnum.ENFANT);
        f3.addIndividu(individu33);
        foyers.add(f3);

        Collection<Foyer> foyersOrder = FoyerHelper.orderFoyerBySize(foyers);
        Assert.assertEquals(3, foyersOrder.size());
        Iterator<Foyer> chefIterator = foyersOrder.iterator();
        Assert.assertEquals(f3, chefIterator.next());
        Assert.assertEquals(f1, chefIterator.next());
        Assert.assertEquals(f2, chefIterator.next());

    }

    @Test
    public void testMapFoyer() {

        Map<Individu, Foyer> individuMap = new HashMap<Individu, Foyer>();
        individuMap.put(new Individu(5), new Foyer(6));
        individuMap.put(new Individu(6), new Foyer(8));
        individuMap.put(new Individu(1), new Foyer(1));
        individuMap.put(new Individu(2), new Foyer(2));
        individuMap.put(new Individu(1), new Foyer(2));
        individuMap.put(new Individu(4), new Foyer(8));
        individuMap.put(new Individu(7), new Foyer(8));
        individuMap.put(new Individu(8), new Foyer(6));
        individuMap.put(new Individu(9), new Foyer(3));
        individuMap.put(new Individu(7), new Foyer(8));

        Map<Foyer, Collection<Individu>> foyerMap = FoyerHelper.reverseIndividuMap(individuMap);
        Assert.assertEquals(4, foyerMap.size());

        Collection<Individu> individuFoyer8 = foyerMap.get(new Foyer(8));
        Assert.assertEquals(3, individuFoyer8.size());
        Collection<Individu> individuFoyer8Expeccted = new ArrayList<Individu>();
        individuFoyer8Expeccted.add(new Individu(4));
        individuFoyer8Expeccted.add(new Individu(6));
        individuFoyer8Expeccted.add(new Individu(7));
        Assert.assertTrue(individuFoyer8Expeccted.containsAll(individuFoyer8));

        Collection<Individu> individuFoyer3 = foyerMap.get(new Foyer(3));
        Assert.assertEquals(1, individuFoyer3.size());
        Assert.assertEquals(new Individu(9), individuFoyer3.iterator().next());

    }
}
