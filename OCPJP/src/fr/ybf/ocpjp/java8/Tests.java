package fr.ybf.ocpjp.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import fr.ybf.ocpjp.generics.Youssef;

public class Tests {

	public static void main(String[] args) {

		/** Consumer */
//		Consumer<List<Youssef>>	lambdaA = l -> Collections.sort(l, (o1, o2) -> o1.getAge() - o2.getAge());
		Consumer<List<Integer>>	lambda = l -> Collections.sort(l);	
		Consumer<List<Integer>>	methodRef1 = Collections::sort;
		
		System.out.println(Arrays.asList(11,92,43,33));

		methodRef1.accept(Arrays.asList(11,92,43,33));
		System.out.println(Arrays.asList(11,92,43,33));
		
		/** Predicate */
		String str = "ABC";
		Predicate<String> lambdaPredicate = s -> str.startsWith(s);
		Predicate<String> methodRefPredicate = str::startsWith;
		 
		boolean b = methodRefPredicate.test("A");
		boolean a = lambdaPredicate.test("A");
		 
		Predicate<String> lambdaPredicate2 = s -> s.isEmpty();
		Predicate<String> methodRefPredicate2 = String::isEmpty;
		
		boolean bb = lambdaPredicate2.test("ttter");
		boolean aa = methodRefPredicate2.test("ttter");
		
//		Predicate<Youssef> lambdaYsf = y -> y.isTrue();
//		Predicate<Youssef> methodRefYsf = Youssef::isTrue;
//		
//		boolean ysf = methodRefYsf.test(new Youssef(28));
//		System.out.println(ysf);
		
		/** Supplier */
		Supplier<String> lambdaSupplier1 = () -> new String("sdq");
		Supplier<ArrayList> methpdRefSupplier1 = ArrayList::new;
		
		System.out.println(methpdRefSupplier1.get());
		System.out.println(lambdaSupplier1.get());
		
		removeFromLists();
	}	
	
	private static void removeFromLists(){
		System.out.println("removeFromLists meth\n");
		List<String> str1 = new ArrayList<>();
		str1.add("azerty");
		str1.add("qsdfgh");
		str1.add("wxcva");
		str1.add("ytreza");
		str1.add("gfdsq");
		
		System.out.println(str1);
		str1.removeIf(s -> s.startsWith("a"));
		System.out.println(str1);
		str1.replaceAll(s -> s.concat(" => "));
		System.out.println(str1);

		
		Queue<Integer>	q	=	new	LinkedList<>(); 
		q.add(10); 
		q.add(12); 
		q.remove(12);
		System.out.print(q);
	}
	
}



