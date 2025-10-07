package seralizationDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilwWriterDemo {

	public static void main(String[] args) {
	/*
		try {
			FileWriter fileWriter = new FileWriter("student.txt");
			String text = "Hello FilerWriter 1";
			fileWriter.write("Hello FileWriter" + text);
			System.out.println("Data written successful");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
   */
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("student.txt"));
			String text1 = "Hello Buffered Writer";
			String text2 = "next Line";
			bufferedWriter.write(text1);
			bufferedWriter.newLine();// it will tell compiler to write in next line;
			bufferedWriter.write(text2);
			bufferedWriter.flush();// it done the pending work
			System.out.println("Buffered writing done !");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
