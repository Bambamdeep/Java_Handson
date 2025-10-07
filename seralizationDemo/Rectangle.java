package seralizationDemo;

import java.io.Serializable;

public class Rectangle implements Serializable{
	
	int length;
	int breadth;
	int area;
	public Rectangle(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
		this.area = length*breadth;
	}

}
