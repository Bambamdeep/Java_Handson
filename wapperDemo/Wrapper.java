package wapperDemo;

import java.util.ArrayList;
import java.util.List;
// wrapper class extends Number class except (char and boolean)
public class Wrapper {

	public static void main(String[] args) {
		// Integer
		List<Integer> list = new ArrayList<>();
		list.add(1); // autoboxing .
		list.add(2);
		list.get(0);// unboxing
		System.out.println(list.get(0)); // unboxing

		// Double
		List<Double> list1 = new ArrayList<>();
		list1.add(2.12); // Autoboxing
		list1.add(3.12);
		list1.add(4.12);
		System.out.println(list1.get(2)); // unboxing
		// Long
		List<Long> list2 = new ArrayList<>();
		list2.add(100000L);
		list2.add(200000L);
		System.out.println(list2.get(1)); // unboxing
		// float
		List<Float> list3 = new ArrayList<>();
		list3.add(3.14f);
		list3.add(1.21f);

		System.out.println(list3.get(1)); // unboxing
		// Boolean
		List<Boolean> list4 = new ArrayList<>();
		list4.add(true);
		list4.add(false);
		System.out.println(list4.get(1)); // unboxing
		// byte
		List<Byte> list5 = new ArrayList<>();
		list5.add((byte) 1);
		System.out.println(list5.get(0)); // unboxing

		// short
		List<Short> list6 = new ArrayList<>();
		list6.add((short) 23);
		System.out.println(list6.get(0)); // unboxing
		// char

		List<Character> list7 = new ArrayList<>();
		list7.add('A');
		list7.add('B');
        System.out.println(list7.get(0)); // unboxing
        
        //int to String;
        int a = 1234;
        String str = Integer.toString(a);
        System.out.println("String : " + str);
        System.out.println(str + "43");
        // Primitive to vice versa
        int b = 23;
        Integer c = Integer.valueOf(b); // boxing
        
        int d = c.intValue();//unboxing

	}

}
