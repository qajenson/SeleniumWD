package javaConcepts2;

//This class is created for Access Modifier concept --

import JavaConcepts.public_access_modifiers;

public class ClassC {

	public static void main(String[] args) {
		public_access_modifiers rbt = new public_access_modifiers();
		rbt.Addition(); // Other package - We can access public parent classes
		// robo.Add(); // Parent class - If method is private we cannot access those
		// methods in another pkgs.

		// robo.Sub(); // Parent class - If method is protected we cannot access those
		// methods in another pkgs.
	}

}
