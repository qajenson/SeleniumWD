package JavaConcepts;

//This class is created for Access Modifier concept --

// By using object reference we access parent class 
public class ClassB {

	public static void main(String[] args) {
		public_access_modifiers robo = new public_access_modifiers(); // Parent class name we need to enter.
		robo.Addition(); // Public
		// robo.Add(); // We cannot access private methods
		robo.Sub(); // Protected.

		/*
		 * // To access class CoreJavaBrushup2
		 * 
		 * CoreJavaBrushup2 bob = new CoreJavaBrushup2(); bob.ArrayList();
		 */

	}

}
