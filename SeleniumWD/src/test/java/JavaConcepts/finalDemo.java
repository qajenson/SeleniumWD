package JavaConcepts;

// Final keyword in Java
// Final => Restricting access.

// We can use final keyword  in 
// Method level - To make sure that method is not overriden
// variable level - To make sure you are not changing it.
// Class level - To make sure that you are not inheriting that parent class.

//If you declare any variable as final - That means you cannot change this value again
//So here i have declared already i = 4 -That means i cannot change this value again to another number.
//Whenever you feel that something should be always constant. 
//You could simply say constant value which any of your class should not alter that variable value.
//Then please go ahead and use final keyword before that variable.
//So that if someone tries to change that variable number  it will not be changed and it will throw an error.
//Basically people say it has a constant variables

//Entire class can be marked as final. If any inheritance concept ie extends any class (mark that parent class as final- in the child class you will get an error! 
//Why you got error? When i change access modifer as final what happened? 
//Child Class - throws error - Remove 'final' modifier of 'Parent Class'
//Class name as final - You cannot extends that class (ie inheritance)

//Also we make methods as final - If method is marked as final - Then you cannot override this method again

//final class finalDemo { // we cannot extends final marked classed (ie inheirtance)

public class finalDemo {
	final void getData() { // If method is marked as final - Then you cannot override this method again
	}

	public static void main(String[] args) {

		final int i = 4;
		// i = 5; // If you hover varible name - you can see an error
// if you tries to change the variable name - throws an error (remove 'final' modifier of 'i' )
	}

}

// Note 1:
// final & finally keywords are different
// Final => Restricting access.
// finally => is something related to try catch exception. 
// ie Once you execute try or catch block and if you face any error control will still comes to this block and execute code.
// No matter script is passed or failed. 

// Note 2
// Interview major topics
// this, super, try, catch, finally, final, public private protected default access modifiers
// packages, import, inheritance, interface, runtime polymorphisim, strings
// 