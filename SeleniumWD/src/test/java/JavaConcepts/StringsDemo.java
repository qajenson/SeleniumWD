package JavaConcepts;

public class StringsDemo {

	public static void main(String[] args) {

		// create String object: By string literal

		System.out.println("----- One way of creating String----");
		String str1 = "Sachin Indian Batsman"; // One way of creating string.
		String str2 = "Sachin Indian Batsman";
		System.out.println(str1);

		// create String object: By new keyword

		System.out.println("----- Another way of creating String with 'new keyword/memory operator----");
		String str3 = new String("Lara WI Batsman");
		String str4 = new String("Lara WI Batsman");
		System.out.println(str3 + " , " + str4);

		System.out.println("----- To break strings by using white spaces----");
		String s1 = "India is my country";

// To split String s with white spaces, After splitting string will be array so we are using String[]

		// String[] splitString = s1.split(" ");
		String[] splitString = s1.split("my");
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);
		// System.out.println(splitString[2]);
		System.out.println(splitString[1].trim()); // It removes beginning and ending spaces of this string.

		// To know the String[] splitString array length
		System.out.println(splitString.length);
		System.out.println(splitString[1].length());

		// To print all characters in the array
		System.out.println("-----Print all characters in the array----------");

		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}

		// To print the string in reverse order
		System.out.println("-----Print String Reverse Order----------");

		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.println(s1.charAt(i));
		}
	}
}
