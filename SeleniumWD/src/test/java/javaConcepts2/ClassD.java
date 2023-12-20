package javaConcepts2;

//This class is created for Access Modifier concept --

import JavaConcepts.public_access_modifiers;

public class ClassD extends public_access_modifiers {

	public static void main(String[] args) {
		Addition(); // Public
		// Add(); //Private method we cannot access to other packages
		Sub(); // Protected
	}

}
