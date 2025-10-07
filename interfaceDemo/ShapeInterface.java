package interfaceDemo;

public interface ShapeInterface {
	
	public void area();

}

 class Rectangle implements ShapeInterface{

	@Override
	public void area() {
		
		System.out.println("Area of rectangle is - " + "length * breadth ");
		
	}
	
}
 
 class Triangle implements ShapeInterface{

	@Override
	public void area() {
		System.out.println("Area of Triangle is :- " + "1/2 * Base * height");
		
	}
	 
 }