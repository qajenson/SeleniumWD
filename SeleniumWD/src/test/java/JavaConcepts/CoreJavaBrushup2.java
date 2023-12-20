package JavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {

		System.out.println("--------1. Array - For Loop------------");

		// Another way or shortcut array
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122 }; // directly assigning values to variable

		// To check if array has multiple of 2 i.e: Expecting out values 2, 4, 6, 8, 10,
		// 122
		// To filter our logic to get your extracted results we can use if else
		// conditions:

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) { // to compare two integers in java we have to put ==
				System.out.println(arr2[i]);
				// break; // break is a keyword which simply exit the for loop. It will exit
				// whenever we found the goal ie 2
			} else {
				System.out.println(arr2[i] + " is not multiple of *2");
			}
		}

		System.out.println("---------2. Dynamic ArrayList-----------");

		// Dynamic array list [Today 5 products, tomorrow it may be 30 - real time
		// scenario, so we cannot set the size of the array intially so we use this
		// concept
		// ArrayList is a class; Import package ; because ArrayList class comes from
		// this package.
		// a -- is an object name
		// new -- Operator will allocate memory.
		ArrayList<String> a = new ArrayList<String>();
		// To access any methods in the class we have to create a object of that class.
		// Then you can access the methods of the class by calling object of that class.
		// eg: object.method

		a.add("Jenson"); // you can dynamically add values any time in your test.
		a.add("Rahul");
		a.add("Academy");
		a.add("Selenium");
		a.remove(2); // "Academy" value will be removed' from the list because "Academy" index value
						// is [2]

		// To extract the value in ArrayList; Syntax a.get(index number]) ; where 'a' is
		// object name. get() is a method.
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2)); // Here "Academy" array index value removed.

		System.out.println("--------3. Dynamic ArrayList - Normal For Loop------------");

		// To get the size of the ArrayList we have use .size() method or Returns the
		// number of elements in this list.
		// If its is normal Array we have to use .length()method

		// -- This is normal for loop
		for (int i = 0; i < a.size(); i++) {
			System.out.println("By using Array List Concept: " + a.get(i));
		}

		System.out.println("--------4. Dynamic ArrayList - Enhanced For Loop------------");
		// Enhanced for loop
		for (String val : a) {
			System.out.println("By using Array List Concept: " + val);
		}

		System.out.println("--------5. ArrayList Check - Returns boolean value------------");

		// Item is present in Array List ie, Selenium ; It returns Boolean value true or
		// false

		// .contains(); this method will tell you that text what you are searching is
		// present in the array list or not?
		// .contains(); is supported only for ArrayLists

		// CoreJavaBrushup2 kite = new CoreJavaBrushup2(); this is used for Access
		// modifiers usage - I wrote myself

		System.out.println(a.contains("Academy"));
		System.out.println(a.contains("Selenium"));
		// System.out.println(a.getClass());

		System.out.println("--------6. Convert Normal Array to ArrayList------------");
		// To convert normal array to ArrayList
		String[] name = { "Kapil", "Azzar", "Ganguli", "Dhoni", "Kohli", "Rohit" }; // Normal Array
		List<String> nameArrayList = Arrays.asList(name); // Arrays.asList(); method is used to convert Normal Array in
															// to ArrayList and the value stored is into variable called
															// nameArrayList; DataType is mandatory
		System.out.println(nameArrayList); //

		System.out.println("--------7. Converted ArrayList - Check Array Length & Values present------------");
		System.out.println(name.length);
		System.out.println(nameArrayList.contains("Rohit"));
	}

}
