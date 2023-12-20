package JavaConcepts;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {

// Whole execution will be happen inside this main block.If you write outside of this block it won't be executed

		int myNum = 5; // Declared variables by using proper data types.
		String website = "https://www.google.com/";
		char letter = 'r';
		double dec = 19.89;
		boolean myCard = true;

		// To Print
		System.out.println(myNum);

		// To print custom text-- To concatenate string & variable use + operator

		System.out.println("This is the myNum value: " + myNum);
		System.out.println(website);

// Arrays -- Arrays can store multiple values in one single variable.
// [] denotes it is not storing one integer, it is storing multiple integer values ; new will actually create memory for those many values what you are going to store in this variable.
// 5 denotes - you want to store 5 integers in this variable

		int[] arr = new int[5];
// Declared an array and have allocated memory for storing 5 elements.but we did not assign values here.

		arr[0] = 2;
// Initialize arrays with values; Arrays values will be stored from Zero index

		arr[1] = 4;
		arr[2] = 5;
		arr[3] = 8;
		arr[4] = 9;

		// Another way or shortcut array
		int[] arr2 = { 5, 10, 15, 16, 20 }; // directly assigning values to variable

		// TO access any item in array
		System.out.println(arr2[4]); // Array name with index value; index starts from zero; to access value 15

// for loop -- I need to print array values from arr variable. -- can iterate
// over each and every element of this array and print values of it.
		System.out.println("--------For Loop 1-----------");
		for (int i = 0; i < arr.length; i++) // you need to first create one variable which look in to that array
		{
			System.out.println(arr[i]);
		}

		System.out.println("--------For Loop 2-----------");

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println("--------String Array-----------");

		// Declare String Array
		String[] name = { "Apple", "Grapes", "Pineapple", "Plum" };

		System.out.println("Display second array item: " + name[1]);

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		// Enhanced for loop -- Simple for loop
		for (String s : name) {
			System.out.println("Simple for loop: " + s);
		}

	}

}
