package seralizationDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		/*
		try (FileReader fileReader = new FileReader("student.txt")) {
			int data; // it will read character not byte;
			while ((data = fileReader.read()) != -1) {
				System.out.println("Data  reading " + (char) data);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
*/
		
	try (BufferedReader bufferReader = new BufferedReader(new FileReader("student.txt"))) {
		String line; 
		while((line = bufferReader.readLine() )!= null) {// it will read line by line/
			System.out.println(line);}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
