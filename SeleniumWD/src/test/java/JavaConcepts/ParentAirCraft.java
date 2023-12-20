package JavaConcepts;

//Concept of Abstract Class & Abstract methods

//Here we add keyword abstract because below method bodyColor() is abstract method
// Because there is no body so we have to add this class as abstract

public abstract class ParentAirCraft {
	// This method should follow some rules and regulations.
	// So all other aircrafts will inherit this class and use this method to create
	// engine for their aircrafts

	// This method have the implementation - because we have something in your
	// braces{} ie. this is non-abstract method - engine(), safteyGuidelines()

	public void engine() {

		System.out.println("Follow engine Guidelines");
	}

// Note: We can have Access modifier like Public or Protected or default
// But you cannot have private - private is not allowed as access modifier for the methods defined in abstract class. why?
// so the goal of abstract is that someone has to use this right?	
// Point of abstracting? - Because every abstract class have to be inherited. 

	public void safteyGuidelines() {

		System.out.println("Follow saftey guidelines");
	}

// If you are not adding any body to this method then this method is abstract method.
// So you have to use abstract keyword.
// Because ParentAirCraft is not able to suggest color. 
	public abstract void bodyColor(); // Duty of child aircraft to decide which body color

}
