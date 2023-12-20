package JavaConcepts;

// -- Concept of Inheritance 

public class parentClassDemo {

	String colour = "Red";

	public void gear() {

		System.out.println("Gear code is implemented");

	}

	public void breaks() {

		System.out.println("Break code is implemented");

	}

	public void audiosystem() {

		System.out.println("Audiosysten code is implemented");

	}

	public static void main(String[] args) {

	}

}

// Note: 1

// If you change class access modifier as final: ex:  final class parentClassDemo { } 

// childClassDemo - throws error - Remove 'final' modifier of 'parentClassDemo' 
