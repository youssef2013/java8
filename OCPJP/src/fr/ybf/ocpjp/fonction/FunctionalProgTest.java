/**
 * 
 */
package fr.ybf.ocpjp.fonction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import fr.ybf.ocpjp.generics.Youssef;

/**
 * @author youssef
 *
 */
public class FunctionalProgTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Supplier<LocalDate> sup = LocalDate::now;
		System.out.println(sup.get());
		
		Supplier<ArrayList<String>> supAL = ArrayList<String>::new;
		ArrayList<String> al = supAL.get();
		System.out.println(al);
		System.out.println(supAL);
		Supplier<Boolean> b = FunctionalProgTest::isTrue;
		
		testConsumerWithMap();
	}

	
	private static boolean isTrue(){
		return true;
	}
	
	private static void testConsumerWithMap(){
		Collection<Youssef> str = new ArrayList<>();
		str.add(new Youssef(24, "couscous"));
		str.add(new Youssef(28, "pizza"));
		str.add(new Youssef(12, "tea"));
		str.add(new Youssef(88, "tajine"));
		System.out.println(str);
		
		Map<String, Integer> map = str.stream().collect(Collectors.toMap(u -> u.getFood(), u -> u.getAge()));
		System.out.println("stream" + map);
		
//		insert every item from the list to the map
		str.forEach(t -> map.put(t.getFood(), t.getAge()));
		System.out.println(map);
		
		//another way to do that by using BiConsumer
		BiConsumer<String,	Integer> b1	= map::put;
		for (Youssef youssef : str) {
			b1.accept(youssef.getFood(), youssef.getAge());
		}
		System.out.println(map);
		Collection<String> foods = new ArrayList<>();
		//  consuer that add check if map contains a string, if yes add it to a list
		Consumer<Youssef> consumer = new Consumer<Youssef>() {
			@Override
			public void accept(Youssef y) {
				if (map.containsKey(y.getFood())  ) {
					foods.add(y.getFood()) ;	
				}
			}
		};
		str.forEach(consumer);
		System.out.println(foods);
		
	}
}
