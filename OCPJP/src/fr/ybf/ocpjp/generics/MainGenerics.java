package fr.ybf.ocpjp.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPerson<Youssef> youssef = new GenericPerson<>();
		
		youssef.setName("my name is : " + youssef.getClass());
		System.out.println(youssef.getName());
		String[] a = {"dqsdq","dqsqs"};
		Integer[] b = {1, 2, 4};
		List l = new ArrayList();
		Collection c = new ArrayList();
		Collection[] lists = {new ArrayList<>(), l, c};
		unboundedWildcards(Arrays.asList(a));
		upperBoundedWildcards(Arrays.asList(b));
		lowerBounded(Arrays.asList(lists));
	}

	
	private static void unboundedWildcards(List<?> l) {
		for (Object object : l) {
			System.out.println(object);
		}
		
	}
	private static void upperBoundedWildcards(Collection<? extends Number> collection){
		for (Number number : collection) {
			System.out.println(number);
		}
	}
	
	private static void lowerBounded(Collection<? super ArrayList> lists) {
		for (Object object : lists) {
			System.out.println(object.getClass());
		}
	}
}
