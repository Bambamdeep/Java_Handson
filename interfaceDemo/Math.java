package interfaceDemo;

public interface Math {

	public int sum (int a,int b); // we can not make this private .
	 
	// we can not make constructor in interface
	
	public int subtract(int a,int b);
	
	public int multiply (int a, int b);
	
	public double divide (int a,int b);
	
	public double area (int a,int b) ;
	
	// default method 
	 default void add () {
		
		System.out.println("Sum is :-"  +25);
	}
	
	// static method.
	static void square () {
		System.out.println("Square of 4 is :- "+ 16);
	}

}
