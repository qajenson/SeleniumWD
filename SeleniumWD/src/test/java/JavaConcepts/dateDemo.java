package JavaConcepts;

//Date class concepts

import java.text.SimpleDateFormat; //SimpleDateFormat class is used to customized way to get date
import java.util.Date; // util - is a package; Date - is a class

public class dateDemo {

    public static void main(String[] args) {

// If you want to print current date, current time you need to use date class in java

	Date d = new Date();
	// How to print it? - You cannot print it directly
	// To convert it to readable text you need to use object.toString();

	System.out.println(d.toString()); // This is default Date given by java

	// If you have requirement MM/dd/yyy HH:MM:SS - Customized way to get result
	// To achieve this java guys implemented one more class - Class name =
	// SimpleDateFormat

	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyy"); // Here am expecting this format - Argument is in ("")

	System.out.println(sdf.format(d)); // Here am formating d object value.
	// so I will get the expected result(based on myargument)

	// Google it - pattern of Simple DateFormat Format Codes
	// https://www.tutorialspoint.com/java/java_date_time.htm

	// SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss a zzz");
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	System.out.println(sdf1.format(d));
    }

}
//Note : In this class we have used a Date instance to actually get the system date and time
