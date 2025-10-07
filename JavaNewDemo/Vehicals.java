package JavaNewDemo;

public sealed  class Vehicals permits Bike{
	
	String name;
	
	
	public Vehicals(String name) {
		super();
		this.name = name;
	}


	public  void drive() {
		System.out.println("Vehicals");
	}
		
	}
	
	


