package JavaConcepts;

//Interface concept - Refer CentralTraffic

//To implement an interface in your own class, use keyword "implements" then write the interface name - Refer below class name
// hover class name - shows info The type AustralianTraffic must implement the inherited abstract method CentralTraffic.greenGo()
// hover class name - select 'Add unimplemented methods() -- Automatically methods will be added/displayed below automatically
// To can see these methods are created outside of public static void main

// Note: One class can 'implements' multiple interfaces - Just use comma separator in-beteween interface names

public class AustralianTraffic implements CentralTraffic, ContinentTraffic {

	public static void main(String[] args) {
		// AustralianTraffic a = new AustralianTraffic(); // Invalid usage

		// Because Here I have created object for AustralianTraffic class.
		// But here this object 'a' is referring to the methods in AustralianTraffic

		// But we are actually referring to the methods present in CentralTraffic
		// In that case if you are implementing an interface and you are writing
		// the methods related to that interface method. You could say CentralTraffic
		// instead of AustralianTraffic. Please see below how it is used

		CentralTraffic a = new AustralianTraffic(); // valid usage

		// calling methods by using object.method()
		a.redStop();
		a.greenGo();
		a.FlashYellow();

		// We need to create a new object specific to this AustralianTraffic class to
		// call this class method name - walkonSymbol()

		AustralianTraffic at = new AustralianTraffic();
		at.walkonSymbol();

		// To Call method present in ContinentTraffic we need to create an object
		ContinentTraffic ct = new AustralianTraffic();
		ct.TrainSymbol();
	}

	@Override
	public void greenGo() {
		// Enter your code here
		System.out.println("Interface1: greenGo Implementation");
	}

	@Override
	public void redStop() {
		// Enter your code here
		System.out.println("Interface1: redStop Implementation");

	}

	@Override
	public void FlashYellow() {
		// Enter your code here
		System.out.println("Interface1: FlashYellow Implementation");

	}

	// This method is for Australian country traffic rules -
	// You could define own methods here which is specific to AustralianTraffic
	// rules
	public void walkonSymbol() {
		System.out.println("Inside class Method: Australia walking traffic rules ");
	}

	@Override
	public void TrainSymbol() {
		// Enter your code here - This is for second interface(ContinentTraffic) method
		System.out.println("Interface2: Continental Traffic Train symbol ");
	}
}
