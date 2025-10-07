package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
		List<Student<Integer, String>> list = new ArrayList<>();

		Student<Integer, String> s1 = new Student<Integer, String>(1, "Deepak");
		list.add(s1);
		list.add(new Student<>(2, "kumar"));
		System.out.println(list);

		Iterator<Student<Integer, String>> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("Iterator :- " + iterator.next());
		}

		List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);
		Iterator<Integer> iterator1 = list1.iterator();
		while (iterator1.hasNext()) {
			System.out.println("Iterator1 : -" + iterator1.next());
		}
	}

}
