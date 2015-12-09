package wardrobe;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ConsoleMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// User user1 = new User();

		/*
		 * Calendar currentDay = new GregorianCalendar(); Date testDay = new
		 * Date();
		 * 
		 * currentDay.add(Calendar.DATE, 2);
		 * 
		 * testDay = currentDay.getTime();
		 * 
		 * // System.out.println(Calendar.DAY_OF_WEEK); //
		 * System.out.println(currentDay.get(Calendar.d)); //String day1 = new
		 * SimpleDateFormat("EEEE").format(currentDay); String day2 = new
		 * SimpleDateFormat("EEEE").format(testDay);
		 * 
		 * //System.out.println(day1); System.out.println(day2);
		 */
		
		
		
		
		
		Date date = new Date();
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(date));
		// применение
		sdf = new SimpleDateFormat("dd mm yyyy hh:mm:ss zzz ");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("E mm dd yyyy");
		System.out.println(sdf.format(date));
		
		//testgit
		//testgit
		//testgiteclipse
	}

}
