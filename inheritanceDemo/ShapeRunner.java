package inheritanceDemo;

public class ShapeRunner {

	public static void main(String[] args) {
		Shape sape = new Rectangle(5,2);
		sape.area();
		Shape shape = new Circle(2); // runtime polymorphism
		shape.area();
	}

}
