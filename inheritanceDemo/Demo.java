package inheritanceDemo;

class Demo {

	public static int a = 10;

	public static void sum() {
		System.out.println("Parent class sum is Called :- " + 20);
	}
}

class Calculation1 extends Demo {

	static int a = 10;
	public static void sum() {
		System.out.println("Child class sum is Called :- " + 30);
	}

}

