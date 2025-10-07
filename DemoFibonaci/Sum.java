package DemoFibonaci;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sum {

	public static void main(String[] args) {
		int result = IntStream.range(1, 2).sum();
		int result1 = IntStream.rangeClosed(1, 2).sum();
		double result2 = IntStream.rangeClosed(1, 2).average().getAsDouble();
		System.out.println(result2);
		System.out.println("\nString operation");

		List<String> str = List.of("deepak", "kumar", "rita", "kumari");
		str.stream().map(String::toUpperCase).filter(name -> name.startsWith("D") || name.startsWith("R"))
				.forEach(System.out::println);

		List<Integer> evenOdd = List.of(1, 2, 3, 4, 5, 6, 8);
		System.out.println("\nEVEN ODD");
		Set<Integer> result3 = evenOdd.stream().filter(i -> i % 2 == 0 ? true : false).collect(Collectors.toSet());

		System.out.println(result3);

		List<Integer> greaterThan10 = List.of(1, 2, 2, 3, 4, 2, 3, 4, 5);
		System.out.println("\nThe value greater than 10 from list");
		int result4 = (int) greaterThan10.stream().filter(i -> i >= 10).count();
		System.out.println(result4);
		System.out.println("\nSum of list value");
		int result5 = greaterThan10.stream().mapToInt(Integer::intValue).sum();
		System.out.println(result5);
		System.out.println("\nMax Value from List");
		int result6 = greaterThan10.stream().max(Integer::compareTo).orElseThrow();
		System.out.println(result6);
		System.out.println("\n" + "Remove Duplicates");
		greaterThan10.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		;
		System.out.println("\nAscending order list");
		List<Integer> list = List.of(8, 7, 6, 5, 4, 3, 2, 1);
		list.stream().sorted().forEach(System.out::println);
		System.out.println("\nDescending order list");
		List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("\n2nd largest from list");
		list1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
		System.out.println("\nlist of number in map to from square of a number ");

		Map<Object, Object> map = list1.stream().collect(Collectors.toMap(i -> i, i -> i * i));
		System.out.println(map);
		System.out.println("\nCheck for sorted");
		boolean isSorted = IntStream.range(0, list.size() - 1).allMatch(i -> list1.get(i) >= list1.get(i + 1));
		System.out.println(isSorted);

		System.out.println("\nmerge two list");
		List<Integer> list2 = List.of(0,1, 2, 3, 4, 5);
		List<Integer> list3 = List.of(6, 7, 8, 9, 10, 2, 3, 4);
		List<Integer> mergeList = Stream.concat(list2.stream(), list3.stream()).distinct().collect(Collectors.toList());
		System.out.println(mergeList);
		System.out.println("\nCommon Elemet from the list");
		list2.stream().filter(list3::contains).collect(Collectors.toList()).forEach(System.out::println);
		;
		System.out.println("\nSumOfEven");
		int sum = mergeList.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		System.out.println("\nOddEven");
		Map<Boolean, List<Integer>> oddEven = mergeList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println("Even: -> " + oddEven.get(true) + "\n" + "odd:-> " + oddEven.get(false));
		System.out.println("\nRemovezeroFromList");
		list2.stream().filter(i-> i!=0).collect(Collectors.toList()).forEach(System.out::println);
		
	}
}
