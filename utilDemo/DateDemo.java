package utilDemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		Date currentDate = new Date();
		Date backDate = new Date(currentDate.getDate() - 12);
		//Display today time and day with day 
		System.out.println(currentDate);
		System.out.println(backDate);
		
		Calendar calendar = Calendar.getInstance(); // getInstance is static factory method to get the new object of calendar.
		
		System.out.println("year :"+ calendar.get(Calendar.YEAR)); 
		
		System.out.println("year :"+ calendar.get(Calendar.MONTH)); 
		System.out.println("day of week"
				+ " :"+ calendar.get(Calendar.DAY_OF_WEEK));
		// Date format
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD/MM/YYY");
		String date = simpleDateFormat.format(currentDate);
		System.out.println(date);
		// String to date
		
		String datestr = "08/08/2025";
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("DD/MM/YYY");
		try {
		Date date1 = simpleDateFormat1.parse(datestr);
		}catch (Exception e) {
			System.out.println("Error parsing");
		}

	}

}
