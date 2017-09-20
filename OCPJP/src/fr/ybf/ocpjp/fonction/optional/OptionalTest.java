package fr.ybf.ocpjp.fonction.optional;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		Optional<Double> optional = average(12, 34, 43);
		Optional<Double> emptyOptional = average();
		// if (optional.isPresent()) {
		// System.out.println(optional.get());
		// }
		optional.ifPresent(System.out::println);

		System.out.println(optional.orElse(Double.NaN));
		System.out.println(optional.orElseGet(() -> Math.random()));
		System.out.println(optional.orElseThrow(() -> new IllegalStateException()));

		// test When Optional Is Empty
		System.out.println(emptyOptional.orElse(Double.NaN));
		System.out.println(emptyOptional.orElseGet(() -> Math.random()));
		System.out.println(emptyOptional.orElseThrow(() -> new IllegalStateException()));
	}

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);
	}
}
