package seralizationDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class RectangleRunner {

	public static void main(String[] args) throws IOException {
	FileOutputStream fileOutputStream = new FileOutputStream("rectangle.ser");
	
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	
Rectangle rectangle = new Rectangle(2,3);
objectOutputStream.writeObject(rectangle);

objectOutputStream.close();
System.out.println("Rectangle Seri");
	

	}

}
