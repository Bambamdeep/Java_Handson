package inheritanceDemo;

public class DemoRunner {

	public static void main(String[] args) {
		Demo math = new Calculation1();
		math.sum();
		System.out.println("Parent class static called :-" ); // it will hide the static methos from child classs because we are referring
					// parent class but creating object of child class and it is resolved at compiled time based on reference type.
	//	Calculation1 cal = new Calculation1();
	//	cal.sum();

	}

}
