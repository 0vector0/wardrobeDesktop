package wardrobe;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Day {
	
	private Product product;

	Calendar currentDay = new GregorianCalendar();
	
	//SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
	SimpleDateFormat sdf = new SimpleDateFormat("EEEE d MMMM yyyy");
	
	Date date = new Date();


	public void NextDay() {
		this.currentDay.add(Calendar.DAY_OF_MONTH, 1);

	}

	//SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	

	void TestMethod() {

		
		date = currentDay.getTime();
		System.out.println(sdf.format(date));
		
		NextDay();
		date = currentDay.getTime();
		System.out.println(sdf.format(date));
		

	}
}


/*
 * Calendar currentDay = new GregorianCalendar();
 * 
 * Date testDay = new Date();
 * 
 * currentDay.add(Calendar.DATE, 2);
 * 
 * 
 * 
 * // System.out.println(Calendar.DAY_OF_WEEK); //
 * System.out.println(currentDay.get(Calendar.d)); //String day1 = new
 * String day2 = new
 *
 * 
 * //System.out.println(day1); System.out.println(day2);
 */