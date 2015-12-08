package wardrobe;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDay {

	
	GregorianCalendar testDay = new GregorianCalendar();
	
	TestDay(){
	}
	
	public void NextDay(){
		this.testDay.add(Calendar.DAY_OF_MONTH, 1);
	}
	
	@Override
	public String toString() {
		//String str = testDay.getTime();
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
