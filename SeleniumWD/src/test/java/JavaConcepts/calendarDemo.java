package JavaConcepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// Calendar Concepts

public class calendarDemo {

	public static void main(String[] args) {

		// If you want to create calendar object. so you need to say getInstance()
		// getInstance() - This will create an instance for the Calendar

		Calendar cal = Calendar.getInstance();
// Now Calendar object has some more unique features where Date() doesn't support them

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyy hh:mm:ss a zzz");

		// sdf.format(cal.getTime());

		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
	}

}

// Note: In this class we have used a calendar instance to actually get the system date and time
// Why Calendar class instead of Date class ?
// There are some unique features where calendar provides us
// For example -- if I want to know what is the day today Calendar.DAY_OF_MONTH, 
// Similary we can use this method Calendar.DAY_OF_WEEK_IN_MONTH & so on - we have may methods in calendar class

// You won't get these methods in Date class , SO we can use calander class if required
