package statments;

import java.io.PrintStream;
import java.util.Scanner;

public class Staments {
	public static int sum (int a , int b) {
		return a+b;
	}
	public static int multiply (int x , int y) {
		return x*y;
	}
	public static int subtract (int w , int x) {
		return w-x;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		int marks = scanner.nextInt();
		if (marks >= 90) {
			System.out.println("Grade A");
		} else if (marks >= 75) {
			System.out.println("GradeB");
		} else {
			System.out.println("Grade C");
		}
		// switch
		
		String days = scanner.nextLine();
		switch (days.toLowerCase()) {

		case "monday":
			System.out.println("First day of week ");
			break;
		case "tuesday":
			System.out.println(" Second day of week ");
			break;
		case "wednesday":
			System.out.println("Third day of week");
			break;
		case "Thursday":
			System.out.println("Fourth day of week");
			break;
		case "Friday":
			System.out.println("Fifth day of week");
			break;
		case "Saturday":
			System.out.println("Sixth day of week");
			break;
		case "Sunday":
			System.out.println("Seventh day of week");
			break;
		default:
			System.out.println("Invalid");
			break;

		}
		*/
		// loop Statement ;
		int i = 1;
		int number = 2;
		while (i<=10) {
	         int  multiple = number *i;
	         System.out.println( multiple);
	         i++;
		}
		System.out.println("doWhile\n");
		int number1 = 6;
		int j = 6;
		do {
			System.out.println(j);
			int sum = number1 + j;
			
			System.out.println(sum);
			j--;
		}while(j >1);
		
		System.out.println("forloop");
		for (int k =10 ; k >= 1 ;k--) {
			
			System.out.println(k);
			System.out.println("Break and Continue");
			//Continue and break
		}
		for (int x = 1; x<=10 ;x++) {
			//if (x ==2 )continue;
			//else if(x==5)continue;//it means it will skip the give iteration;
			if (x == 6)break; // it will stop iterating after the condtion which we provide ;
			System.out.println(x);
			
		}
		System.out.println("return");
		//Return 
		
		
		//Staments st = new Staments();
	      // System.out.println (   st.sum(2,3));
	       
	     //  sum(2,3)
	       System.out.println( sum(2,3));
	       System.out.println(  multiply(2,3));
	       System.out.println( subtract (2,3));
	}
   
	
}
