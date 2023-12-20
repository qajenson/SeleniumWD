package JavaConcepts;

public class CoreJavaBrushup3 {

//Declare Strings & Important string methods

	public static void main(String[] args) {
// String Literal
// One way of creating string
// Java terminology string is an object.
// So String is an object that represents a sequence of characters.
// If text is same no matter how many string variables you created in the back end.		
// Only one object will be created.		
// If both values are same only one object will be created.		
// If you have same multiple values with same name. then it won't create new object. It will  refer to the existing.
// Automation we use this simple way.

		// String s = "Jenson varghese";
		// String s1 = "Jenson varghese";
		String s5 = "Hello";

// Another way of creating String
// String with new keyword or new memory operator
// Every time it creates object because explicitly saying by giving the new operator that go and create a space for my object in java memory.

		String s2 = new String("Welcome");
		String s3 = new String("Welcome");

// I need to break string in to pieces with white spaces -- Split method we can use in java
		String s = "Jenz var Robo";
		// String[] splittedString = s.split(" "); // Split with white spaces
		String[] splittedString = s.split("var"); // Then this will be an array; so we use String[]
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		// System.out.println(splittedString[2]);
		System.out.println(splittedString[1].length());
		System.out.println(splittedString[1].trim()); // To Trim white spaces left & Right

		// To print all characters in the array
		System.out.println("-----Print all characters in the array----------");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		// To print the string in reverse order
		System.out.println("-----Print String Reverse Order----------");
//		System.out.println(s.length()); 	//-- To know the length of the string
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));

		}

	}

}
