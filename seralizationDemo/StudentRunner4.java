package seralizationDemo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentRunner4 {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * FileOutputStream fileOutPutStream =new FileOutputStream("student.txt");
		 * String text = "Hello java input + Output"; // it will convert String to
		 * bytes. try { fileOutPutStream.write(text.getBytes()); } catch (IOException e)
		 * {
		 * 
		 * e.printStackTrace(); } System.out.println("Data written sucessful");
		 */

		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("student.txt"));
		String text1 = "Hello java buffered output";
		try {
			bufferedOutputStream.write(text1.getBytes());
			bufferedOutputStream.flush();
			System.out.println("buffed output is successful");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
