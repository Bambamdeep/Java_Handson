package seralizationDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class StudentRunner3 {

	public static void main(String[] args) {
		try {
		BufferedInputStream bufferedInputStream = new BufferedInputStream (new FileInputStream("student.txt"));
		int data ;
		while((data = bufferedInputStream.read())!= -1) {
			System.out.print((char)data + " ");
			
			System.out.print(data + " ");
			
		}
		}catch (Exception e) {
			System.out.println("error" + e.getMessage());
		}

	}

}
