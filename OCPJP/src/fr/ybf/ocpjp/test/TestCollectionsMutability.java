package fr.ybf.ocpjp.test;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionsMutability {

	public static void main(String[] args) {
		Collection<String> strings = new ArrayList<>();
		strings.add("Hello");
		strings.add(" world");
		strings.add("! I'm Youssef");
		
		System.out.println(strings);
		removeElement(strings);
		System.out.println(strings);
	}
	
	public static void removeElement(Collection<String> strings) {
		strings.removeIf(s -> s.length() == 6);
	}
}
