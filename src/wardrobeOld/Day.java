package wardrobeOld;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Day {

	private Product[] massDayProduct = new Product[5];

	// Куда одевать?
	// private String [] placeOfProduct = new String[5];

	Calendar currentDay = new GregorianCalendar();
	// DateFormat formatter = new SimpleDateFormat("MM-DD-YY");

	// String message = formatter.format(calendar.getTime());

	// SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss
	// Z");
	SimpleDateFormat sdf = new SimpleDateFormat("EEEE d MMMM yyyy");

	// Date date = new Date();

	public Day() {
		currentDay.getTime();
		// TODO Auto-generated constructor stub
	}

	public void NextDay() {
		this.currentDay.add(Calendar.DAY_OF_MONTH, 1);

	}

	public void setCurrentDay(int dayOfWeek) {
		this.currentDay.set(Calendar.DAY_OF_MONTH, dayOfWeek);
	}

	@Override
	public String toString() {
		String result = sdf.format(currentDay.getTime());
		return result;
	}

	public void setMassDayProduct(Product product) {
		this.massDayProduct[0] = product;
	}
	
	public Product getMassDayProduct(){
		return massDayProduct[0];
	}

}
// SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
/*
 * void TestMethod() { date = currentDay.getTime();
 * System.out.println(sdf.format(date)); NextDay(); date = currentDay.getTime();
 * System.out.println(sdf.format(date)); }
 */

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
 * System.out.println(currentDay.get(Calendar.d)); //String day1 = new String
 * day2 = new
 *
 * 
 * //System.out.println(day1); System.out.println(day2);
 */