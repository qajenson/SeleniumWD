package JavaConcepts;

//Concept of Abstract Class & Abstract methods -  This is Child AirCraft class 

// To inherit properties from parent class(ParentAirCraft). we have to use keyword 'extends'
// Hence you should be able to access all the methods and variables defined in this ParentAirCraft class
// Add unimplemented methods (Mandatory to add these methods) - It is forcing us to add one method which is not implemented or abstract in ParentAirCraft.

public class ChildEmirates extends ParentAirCraft {

	public static void main(String[] args) {
		ChildEmirates c = new ChildEmirates();
		c.engine(); // Parent related methods we can access - it is because of inheritance
		c.safteyGuidelines();
		c.bodyColor(); // we can call local implemented class

// Now can you create an object for ParentAirCraft class?
// If any class, if defined as an abstract then it will not allow you to instantiate that class.
// So basically you cannot create an object for the class which is marked as abstract
// If you create object you will get error "Cannot instantiate the type ParentAirCraft" why?
		// ParentAirCraft p= new ParentAirCraft(); -
	}

	@Override
	public void bodyColor() {
		System.out.println("Child Class: Aircraft body color should display Emirates Logo");

	}

}
