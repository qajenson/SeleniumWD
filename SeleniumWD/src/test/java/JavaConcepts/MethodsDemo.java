package JavaConcepts;

public class MethodsDemo {

	public static void main(String[] args) {

		MethodsDemo d = new MethodsDemo(); // Creating object of MethodsDemo class

// calling method name by using object name and it is assigned to a variable "name" it is string type		
		String name = d.getData();
		System.out.println(name);

// if you want to access MethodsDemo2 class methods you have to create object first
		MethodsDemo2 d1 = new MethodsDemo2(); // Create object of MethodsDemo2 class
		d1.getUserData();

// Without using object we can call method in the same class, but method should be static
		getData2();

	}

	public String getData() { // Method returns string so we use String
		System.out.println("Hello World1");
		return "Jenson"; // return is a return type
	}

// Method returns string so we use String, we are using static keyword so we can call without using object in the same class
	public static String getData2() {
		System.out.println("Hello World3");
		return "Varghese"; // return is a return type
	}
}
