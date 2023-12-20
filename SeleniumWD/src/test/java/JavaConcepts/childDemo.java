package JavaConcepts;

// Usage of super keyword - When there is ,

// - Common variable name in child class and parent class
// - Common Method name in child class and parent class
// - And also Constructors in child & parent classes

// Super keyword will actually refers to the Parent class. ie parentDemo
// To differentiate between parent variable and child variable we could use super keyword.
// When you say super.variable name - It refers to the parent class variable. 
// If we use local variable - It refers to the child class variable (Both child & parent class has the same variable name)

// Now in childDemo class. I'm actually inheriting the properties of parentDemo class
// To inherit we can use extends keyword.
// Here childDemo taking properties from parentDemo
// childDemo  & parentDemo classes we have duplicate or same variable name called "name"

public class childDemo extends parentDemo { // Inheritance concept we have used by using extends keyword

	String name = "QA child class variable"; // During execution this local variable has the preference

	public void getStringData() {
		System.out.println(name);

// If i want to call the name variable from parent class.  We have to use super.variablename
		System.out.println(super.name); // variable 'name' value comes from parent class

	}

	public void getData() { // Same method name present in parentDemo class

		System.out.println("I am in child class method");

// To access parentDemo class method name (if child & parent class has the same method name) We can use super keyword
		super.getData();

	}

// We can use the super keyword for constructor as well

	public childDemo() { // In Child Class constructor is created

// If I want to use my parent class constructor into child class. I can simply call by using super method super();
// One rule : Whenever you use a super constructor in child constructor - It should always be the first line in the child constructor.
// Constructor : When we instantiate an object automatically constructor will be invoked.

		super(); // This should be always be at the first line.

		System.out.println("Child class constructor");

	}

	public static void main(String[] args) {
		childDemo cd = new childDemo();
		cd.getStringData();
		cd.getData();

	}

}
// If there is any same or duplicate variable name present in child or parent class. 
// During execution local variable has the preference.
