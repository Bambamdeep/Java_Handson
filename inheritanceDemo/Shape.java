package inheritanceDemo;

class Shape {
	
	public void area() {
		System.out.println("Area of shape");

	}
}

// Rectangle extend shape
class Rectangle extends Shape {

	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void area() {
		int areaOfRectangle = length * breadth;
		System.out.println("Area of Rectangle :- "+areaOfRectangle);
	}
}

// circle extend shape
class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public void area() {
		double areaOfCircle = 3.14 * radius * radius;
		System.out.println("Area of Circle :- " + areaOfCircle);
	}
	
}






















