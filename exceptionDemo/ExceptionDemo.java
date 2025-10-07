package exceptionDemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a =10 , b= 0 ;
		String string = null;
		/*
	
	
	try {
		int c = a/b;
		System.out.println(c);
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	String string = null;
	try {
		int len = string.length();
		System.out.println(len);
	}catch (NullPointerException e) {
		System.out.println("String is Empty : - " + e.getMessage());
	}
     int [] arr = new int[3];
     try {
    	 System.out.println(arr[6]);
     }catch(ArrayIndexOutOfBoundsException e) {
    	 System.out.println("Error : - " + e.getMessage());
    	 
     }finally {
    	 System.out.println("It will  always excuate wheater the exception is handle or not.");
     }
     System.out.println("program continues");
     */
     
    // MultiCatch
    /* 
     try {
 		int c = a/b;
 	   System.out.println(c);
 		int len = string.length();
		System.out.println(len);
 	}catch(ArithmeticException e) {
 		System.out.println(e.getMessage());
 	}catch(NumberFormatException e) {
 		System.out.println("Number format exception");
 	}catch (NullPointerException e) {
		System.out.println("String is Empty : - " + e.getMessage());
	}
     catch (Exception e) {
 		System.out.println("Main exception");
 	}
     */
     // Nested Try block
     
     try {
    	 int len = string.length();
 		System.out.println(len);
 		try {
 			int c = a/b;
 	 	   System.out.println(c);
 		}catch(ArithmeticException e) {
 			System.out.println("Inner Try block");
 			e.printStackTrace(); 
 		}
     }catch(NullPointerException e) {
    	 System.out.println("Outer Try block");
    	 e.printStackTrace(); 
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
