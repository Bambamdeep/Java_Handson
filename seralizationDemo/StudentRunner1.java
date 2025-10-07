package seralizationDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentRunner1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		try {
			Student student = new Student(1, "deepak kumar", "xyz");
			FileInputStream fileInputStream = new FileInputStream("student.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			student = (Student) objectInputStream.readObject();
			fileInputStream.close();
			objectInputStream.close();
		//	System.out.println("Deserailzed :" + student.toString());

			student.display();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
