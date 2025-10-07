package interfaceDemo;

public class InterfaceRunner {
	public static void main(String[] args) {

		Math math = new MathImpl();
 /*
		int add = math.sum(1, 3);
		System.out.println("The sum is : " + add);
		int subtract = math.subtract(3, 1);
		System.out.println("The subtract is : " + subtract);
		int multiply = math.multiply(3, 2);
		System.out.println("The multiply is: " + multiply);
		double divide = math.divide(10, 2);
		System.out.println("The divide is : " + divide);
		double area = math.area(3, 4);
		System.out.println("Area of Rectangle : " + area);
		*/
		
		math.add();
		Math.square();

	}
}
