package arralist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(1);
		list.add(4);
		list.add(3);
		list.stream().map(l-> (l+2) ).forEach(System.out::println);
	//list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//	System.out.println(list.stream().sorted());
//  int [] arr = new int[8];
  int [] arr1 = {1,2,3,4,5};
	}

}
