package stringDemo;

import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {

		String str = "Ram is a boy ";
		String str3 = "Shaym ";
		int length = str.length();
		String subString = str.substring(0, 3);
		char charAt = str.charAt(1);
		String upperCase = str.toUpperCase();
		boolean contain = str.contains("ram");
		String concat = str3.concat(str);

		char[] ch = str.toCharArray();

		char[] ch1 = { 'A', 'B' };

		String str1 = new String("Deepak kumar"); // constructor using String literal
		String str2 = new String(ch1); // using character

		System.out.println(str + "\n" + length + "\n" + str1 + "\n" + str2);

		System.out.println("Sub String : - " + subString);
		System.out.println("CharAt :- " + charAt);
		System.out.println("Uppercase :- " + upperCase);
		System.out.println("Contain :- " + contain);
		System.out.println("Concat :- " + concat);

		// StringBuffer

		StringBuffer stringBuffer = new StringBuffer("ram");

		stringBuffer.append("is");
		stringBuffer.insert(5, "boy");
		stringBuffer.replace(1, 2, "shyam");
		stringBuffer.delete(1, 1);
		 stringBuffer.reverse();

		System.out.println(stringBuffer);

		// StringBuilder

		StringBuilder stringBuilder = new StringBuilder("ram");

		stringBuilder.append("is");
		stringBuilder.insert(5, "boy");
		stringBuilder.replace(1, 2, "shyam");
		stringBuilder.delete(1, 1);
		// stringBuilder.reverse();

		System.out.println(stringBuilder);
		
		//StringTokenizer
		 
		String toekn = "Hello world";
		
		StringTokenizer st = new StringTokenizer(toekn,",");
            
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		// equal and hascode;
		String s1 = "java";
		String s2 = "c++";
		String s3 = "java";
	 	String s4 = new String ("Deepak");
		
		
		System.out.println("S1 equals S2 ? : "+ s1.equals(s2));
		System.out.println("S1 equals S3 ? : "+ s1.equals(s3));
		System.out.println("S1 equals S4 : "+ s1.equals(s4));
		System.out.println("S1 hascode ? : "+ s1.hashCode());
		System.out.println("S2 equals ? : "+ s2.hashCode());
		System.out.println("S3 equals ? : "+ s3.hashCode());
		System.out.println("S4 equals ? : "+ s4.hashCode());
		
	}

}
