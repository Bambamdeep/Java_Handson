package DemoFibonaci;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 1 1 2 3 5 8 13

		// System.out.println("\n");

		int[] fibonacci = { 0, 1 };
		System.out.println("fibonacci :- " + fibonacci[0]);
		System.out.println("fibonacci :- " + fibonacci[1]);
		IntStream.range(2, 10).forEach((i) -> {

			int next = fibonacci[0] + fibonacci[1];

			fibonacci[0] = fibonacci[1];
			fibonacci[1] = next;
			System.out.println("fibonacci :-" + next);

		});

		Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] }).map(a -> a[0]).limit(9)
				.forEach(System.out::println);
	}

}
