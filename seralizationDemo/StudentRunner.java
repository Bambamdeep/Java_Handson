package seralizationDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentRunner {

	public static void main(String[] args) {
	
		try {
			Student student = new Student(1, "Deepak kumar","abc");

			FileOutputStream fileOutputStream = new FileOutputStream("student.ser");// it will create the file and give
																					// the path to write the into it;
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);// it will convert object
																								// to byte code
			objectOutputStream.writeObject(student);
			System.out.println("Student has seralized");
			//System.out.println(objectOutputStream.toString());
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
