package interfaceDemo;

public class OperationRunner{
	
	public static void main(String[] args) {
		
		
		Operation add =  (a,b) -> a+b;
		Operation subtract =(a,b) -> a-b;
		
		System.out.println("Sum is : - " + add.operation(2, 4) + "\nSubtract is : - " + subtract.operation(3, 1));
		

	}

	

}
