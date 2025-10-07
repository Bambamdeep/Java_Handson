package exceptionDemo;

public class CustomeExceptionRunner {

	public static void main(String[] args) {
	
		int age = 13;
		try {
		if (age < 18) {
			throw new CustomException("Custom Exception is Thrown : - You are not eligible to vote" );
		}
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
