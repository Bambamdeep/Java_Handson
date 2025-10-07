package JavaNewDemo;

public record  Person(int id,String name) {
	
	public void getName() {
		System.out.println("Name:- " + name);
	}
	public void getId() {
	System.out.println("Id:- "+id );
	}

}


