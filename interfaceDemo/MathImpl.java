package interfaceDemo;

public class MathImpl implements Math{

	@Override
	public int sum(int a, int b) {
	   
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {

		return a-b;
	}

	@Override
	public int multiply(int a, int b) {

		return a*b;
	}

	@Override
	public double divide(int a, int b) {
		
			if (b==0) {
			  throw new ArithmeticException("Error we can not divide by zero");
				//throw new RuntimeException("Error we can not divide by zero");
			  // program has stop working that why area method not invoked;
			}
		
	
		return a/b;
	}

	@Override
	public double area(int a, int b) {
		
		return a*b;
	}

}
