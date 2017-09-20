package fr.ybf.ocpjp.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

import fr.ybf.ocpjp.generics.Youssef;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1 = new Personne(22, "Yassine");
		Personne p2 = new Personne(33, "Amine");
		Personne p3 = new Personne(12, "Imad");
		Personne p4 = new Personne(66, "Hajar");
		List<Personne> personnes = new ArrayList<>();
		personnes.add(p1);
		personnes.add(p2);
		personnes.add(p3);
		personnes.add(p4);
		
		System.out.println(personnes);
		Collections.sort(personnes);
		System.out.println(personnes);
		
		Set<Youssef> set = new TreeSet<>((o1, o2) ->  o1.getAge() - o2.getAge());
//		set.add(new Youssef(3));
//		set.add(new Youssef(2));
//		set.add(new Youssef(5));
//		set.add(new Youssef(1));
//		set.add(new Youssef(9));
//		set.add(new Youssef(22));
		
		System.out.println(set);
		
	}

}
