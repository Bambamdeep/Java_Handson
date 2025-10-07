package seralizationDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StudentRunner2 {

	public static void main(String[] args) {
	 // FileInputStream
		Student student  = new Student(2,"Kumar Deepak","xyz");
		try {
			FileInputStream fileInputStram = new FileInputStream("student.txt");
			int ch;
			while((ch = fileInputStram.read())!= -1) { // char can not store -1 so we use int to store .
				System.out.print((char)ch + "  ");
				System.out.print(ch + "  "); // will print byte code .
				
			}
		} catch (IOException e) {
		
			e.printStackTrace();
			System.out.println("error" + e.getMessage());
		}

	}

}
