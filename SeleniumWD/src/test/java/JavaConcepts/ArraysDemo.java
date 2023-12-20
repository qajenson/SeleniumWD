package JavaConcepts;

//Concept - Single dimensional Array

public class ArraysDemo {

	public static void main(String[] args) {

// Arrays -- Arrays can store multiple values in one single variable.
// [] -- denotes it is not storing one integer, it is storing multiple integer values ; 
// new --  will actually create memory for those many values what you are going to store in this variable.
// 5 -- denotes you want to store 5 integers in this variable

// Declared an array and have allocated memory for storing 5 elements.but we did not assign values here.

		int[] arr1 = new int[5];

// Initialize arrays with values; Arrays values will be stored from Zero index

		arr1[0] = 2;
		arr1[1] = 4;
		arr1[2] = 6;
		arr1[3] = 8;
		arr1[4] = 10;
		System.out.println(arr1[2]);

		// Another way or shortcut array
		int[] arr2 = { 5, 10, 15, 16, 20 }; // directly assigning values to variable

		// To access any item in array
		System.out.println(arr2[2]); // Array name with index value;,index starts from zero; to access value 15

// for loop -- I need to print array values from arr1 variable.
// -- can iterate over each and every element of this array and print values of it.

		System.out.println("--------For Loop1------To Print arr1 array values-------------------");
		for (int i = 0; i < arr1.length; i++) { // you need to first create one variable which look in to that array
			System.out.println(arr1[i]);
		}

		System.out.println("-------- For Loop2 ------ To Print arr1 array values -------------------");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println("------ Enhanced For Loop1 ----To Print arr2 array values ----------");
		// Enhanced for loop -- Simple for loop
		for (int s : arr2) {
			System.out.println(s);
		}

		System.out.println("---------------------- String Array -----------------------------------");

		// Declare String Array
		String[] StrName = { "Apple", "Mango", "Orange", "Kiwi", "Grapes" };
		System.out.println(StrName[0]);

		System.out.println("-------- For Loop3 ------ To Print arr1 array values -------------------");

		for (int i = 0; i < StrName.length; i++) {
			System.out.println(StrName[i]);
		}

		System.out.println("------ Enhanced For Loop2 ----To Print StrName array values ----------");
		// Enhanced for loop -- Simple for loop
		for (String s1 : StrName) {
			System.out.println(s1);
		}

	}

}
