package JavaConcepts;

//-- Concept of Inheritance 

// To get the properties of parent class to child class - I can do that by writing a keyword called extends
// This keyword which helps us to inherit the properties from parent
// Here my parent class name is parentClassDemo
// Note: Java doesn't allow multiple inheritances 

public class childClassDemo extends parentClassDemo { // this line says that I've successfully derived the
														// properties and methods from my parent class

	public void engine() {
		System.out.println("New Generation Engine ");
	}

// Now I need to get the 'colour' from parent class - This "colour" already present in my parent class.
// As I'm using the properties of my parent class 

	public void Colour() {
		System.out.println("This value comes from Parent class variable name colour=" + colour); // How this colour is
																									// accessing?

		// Because you see in parent class i have defined a colour.
		// I can happily use it in my child class even without defining
		// Automatically Parent class colour value "Red" value comes into this output.

	}

	public static void main(String[] args) {
		childClassDemo cd = new childClassDemo();
		cd.Colour();
		cd.breaks();
		cd.audiosystem(); // we can call breaks() method from parent class - objectname.method()
							// Because I have access because am extending
// So thats how you bring the objects, methods, variables from parent class by using extends keyword in the inheritance concept

		cd.engine(); // Calling the same class method
	}

}
