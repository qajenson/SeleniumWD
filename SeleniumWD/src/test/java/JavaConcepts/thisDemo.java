package JavaConcepts;

// Importance of this keyword

public class thisDemo {

	// Declare variable name a and its value is 2 - for entire class

	int a = 2; // Declared variable name a in class -- Global variable

	// Defining a method
	public void getData() {

// Inside method variable a should be 3, this is my requirement.
// In one method, you want that variable a = 3 specific to this method only. Applicable to that particular block

		int a = 3;
// I need local variable a =3 and class variable a =2 - My requirement
// How do you bring a =2 value in to your block ? ie inside method getData()

//below line 22 : Expected result = 3, bcoz this specific block has requirement of having a value of 3		
		System.out.println("This is local variable(From Inside Method): " + a);

//below line 27: this keyword - which ties to the current object. Current object means class object.
// So class object scope will be on the class level not method level
// So this refer to current object and this object scope lies in the class level. so class level variable a
		System.out.println("This is Class/Global variable(Class Level): " + this.a);

// To get sum of local variable and class variable
// a is method variable , this.a is class variable and it's sum is stored into variable c
		int c = a + this.a;
		System.out.println("Sum of Class variable & Method variable is: " + c);
	}

	public static void main(String[] args) {
		thisDemo td = new thisDemo();
		td.getData();
	}

}

// Note: 1
// this keyword refers to the global variable. not your local variable which is present in your methods.
// Super keyword actually brings us the value from the parent class & this keyword brings us value from object level/class level
