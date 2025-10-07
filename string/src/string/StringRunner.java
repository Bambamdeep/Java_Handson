package string;

import java.util.Scanner;

public class StringRunner {

	public static void main(String[] args) {
	
		String str = "hey";
		
		
		StringBuilder sb = new StringBuilder("deepak");
		sb.append("kumar");
		
		StringBuffer sb1 = new StringBuffer("kumar");
		
		
		System.out.println(str.hashCode());
		System.out.println(sb.hashCode());
		System.out.println(sb1.hashCode());
		
		
		Scanner sc = new Scanner (System.in);
	
		String day = sc.nextLine();
		 
		String result = switch(day.toLowerCase()){
		
		case "monday","tuesday","wednesday" -> "workday";
		
		default -> "holiday";
			
	};
	System.out.println(result);
}
		
		
		
		
	
}
		
	
		
	
