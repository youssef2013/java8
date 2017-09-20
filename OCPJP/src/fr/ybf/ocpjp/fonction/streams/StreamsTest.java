package fr.ybf.ocpjp.fonction.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(3, 5, 6);
		stream.reduce((t, u) -> t * u).ifPresent(System.out::println);
		// System.out.println(stream.reduce((t, u) -> t * u));

		Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
		infinite.limit(100).filter(x -> x%10 == 0).collect(Collectors.toList()).forEach(System.out::println);
		Integer cc = Stream.iterate(1, x -> x + 1).filter(x -> x%10 == 0).limit(100).reduce(10, (a,b)  -> a+b);
		System.out.println(cc);
		
		IntStream intStream = IntStream.of(1, 3, 6, 8, 9);
		System.out.println(intStream.average().getAsDouble());
		Collection<String> strings = Arrays.asList("A","Z","E");
		
//		Stream<String> strStream = strings.stream().flatMap(x -> Stream.of(x));
		Stream<String> strStream = strings.stream();
//		strStream.peek(System.out::println).filter(x -> x.equals("A")).forEach(System.out::println);
		
		Stream<String> strStream2 = strStream.flatMap(x -> Stream.of(x));
//		strings = strStream.collect(Collectors.toCollection(ArrayList::new));
//		System.out.println(strings);
//		strStream2.forEach(System.out::println);
		
		IntStream intStream2 = new Random().ints(22);
//		intStream2.forEach(System.out::println);
		
		
		List<String> cats = new ArrayList<>();
		cats.add("Annie");
		cats.add("Ripley");
		Stream<String> strm = cats.stream();
		cats.add("KC");
		System.out.println(strm.count());
	}
	
}
