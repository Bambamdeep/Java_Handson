package inheritanceDemo;

public class DeviceRunner {

	public static void main(String[] args) {
		Device device = new Laptop();// Implicit casting
		Device d = new Device();

		device.powerOn();
		// device.code(); // not allowed
		// Try to downcast to laptop
		try {
			// Laptop lt = (Laptop) device; // explicit casting
			Laptop d1 = (Laptop) d; // this will thrwo casting error exception.
			// lt.code();// it will call the method from child class.
			 d1.code();
		} catch (ClassCastException e) {
			System.out.println("Casting error :" + e.getMessage());
		}

		Laptop lapTop = new Laptop();
		lapTop.code();
		lapTop.powerOn();

		Car engine = new Car();
		engine.carEngine();
		// engine.start();
		
		
		// Instanceof will retuen true or false it will check wheater it will object of classs or sub class 
		
		Device d2 = new Laptop();
		Device d3 = new Mobile();
		boolean  check = d2 instanceof Laptop;
		boolean  check1 =	d2 instanceof Device;
		
		boolean  check2 = d3 instanceof Laptop; // it will check of the object wheater it is present in class or subclass;
		
		System.out.println(check);
		System.out.println(check1);
		System.out.println(check2);

	}

}
