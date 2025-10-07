package exceptionDemo;

public class ThrowDemo {

	public static void main(String[] args) throws Exception{
		int age = 12;
		if (age <18) {
			throw new RuntimeException("You are  not eligible to vote");
		}

	}

}
