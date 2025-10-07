package DemoFibonaci;

import java.util.Arrays;
import java.util.Comparator;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		String string = "deepak";
		char[] ch = string.toCharArray();

		Map<Character, Integer> count = new LinkedHashMap<>();
		for (char i : ch) {

			if (count.containsKey(i)) {
				count.put(i, count.get(i) + 1);
			} else {
				count.put(i, 1);
			}

		}
		for (Map.Entry<Character, Integer> map : count.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
		// Java 8
		Map<Character, Long> result = string.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		result.forEach((i, j) -> System.out.println("Character :- " + i + " " + "Count :- " + j));

		// First non repeating character
		System.out.println("\nFirst non repeating char");
		Entry<Character, Long> chars = string.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).findFirst().orElseThrow();
		System.out.println(chars);

		// Longest word in a String
		String string1 = "Deepak Narendra Bhardwaj";
		String[] word = string1.split(" ");
		List<String> word1 = Arrays.asList(word);

		int wordLength = word1.stream().mapToInt(String::length).max().orElse(-1);

		System.out.println(wordLength);

		List<StringBuilder> longestWord = word1.stream().map(words -> new StringBuilder(words).reverse())
				.filter(words -> words.length() == wordLength).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(longestWord);

		word1.stream().max(Comparator.comparingInt(String::length));

		// vowel count;
		System.out.println("\nvowel Count");
		String string4 = "DeepaK Kumar";
		long vowelCount = string4.chars().filter(i -> "aeiou".indexOf(i) != -1).count();
		System.out.println(vowelCount);
		// String to map
		System.out.println("\nString with length");
		List<String> String5 = List.of("Deepak", "Kumar", "Narendra", "Bhardwaj");
		Map<String, Integer> mapOfString = String5.stream().collect(Collectors.toMap(s -> s, String::length));
		System.out.println(mapOfString);

		System.out.println("\ngrouping");
		Map<Integer, List<String>> group = String5.stream().collect(Collectors.groupingBy(String::length));
		group.forEach((length, word4) -> System.out.println(length + ":-" + word4));
		
		System.out.println("\nPolindrome");
		String string5 = "level";
		boolean isPolidrome = IntStream.range(0, string5.toLowerCase().length() / 2)
				.allMatch(i -> string5.charAt(i) == string5.charAt(string5.length() - 1 - i));

		System.out.print(isPolidrome);

	}
}
