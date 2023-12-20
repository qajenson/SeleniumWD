package JavaConcepts;

//This class is created for Access Modifier concept --

// By extends parent class name 
public class ClassA extends public_access_modifiers { // Inheritance
	public static void main(String[] args) {
		Addition();
		Multiplication();
		System.out.println("To Print Parent class variable name x1 is : " + x1);
		System.out.println("To Print Parent class variable name x1 is : " + Total1);

		// Add(); // // We cannot access private methods
		Sub(); // to access parent class method - it should be static
	}

}
