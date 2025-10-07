package collectionDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		/*
		 * //List follow insertion order and allow duplicate; List<Integer> list = new
		 * ArrayList<Integer>();
		 * 
		 * list.add(10); list.add(20); list.add(1); list.add(4); list.add(3);
		 * list.stream().map(l -> (l + 2)).forEach(System.out::println);
		 * list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		 * System.out.println();
		 */
		
		
		// set does not allow duplicate and unordered;

		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(12);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.remove(4);
		set.add(12);// it will remove
		System.out.println(set);
		set.stream().map(s -> (s * 2)).forEach(System.out::println);
		System.out.println(" ");
		//set.stream().sorted(Comparator.reverseOrder()).forEach((s) -> System.out.println(s));
		
		//Hashmap;
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1, "Deepak");
		hashMap.put(2, "Pratik");
		hashMap.put(3,"sujal");
		hashMap.put(3, "Ankit"); // it will override the duplicate
		hashMap.put(4, "Kumar");
		hashMap.remove(4);
		System.out.println(hashMap);
		for (Map.Entry<Integer, String> key : hashMap.entrySet()) {
			System.out.println("key :-" + key.getKey() +"\n" + "Value :- " + key.getValue());
			
		}
		for (Integer  key : hashMap.keySet()) {
			System.out.println("key :- " + key);
		}
		for (String  value : hashMap.values()) {
			System.out.println("value :- " + value);
		}
	}

}
