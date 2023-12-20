package JavaConcepts;

public class StaticVariable {

	String name; // These are Instance variables
	String address; // Instance variables; Bcoz when you create new objects the values will be
					// updated.
	static String city; // Class variables ie: All static variables are called class variables, this
						// variables are shared

	static int i; // 2nd obj1 run this i value = 1
	// int i=0; // No static keyword which means no sharing . always i=0 for all
	// object runs

	// Static Block - we can initialize all your static variables = To understand
	// code easily
	static {
		city = "Banglore";
		i = 0;
	}

	StaticVariable(String name, String address) // Parameterized constructor
	{
		this.name = name; // Local variables; variables comes under constructor are called local variables
		this.address = address;

		i++;
		System.out.println(i);

	}

	public void getAddress() {
		System.out.println(address + "-" + city);
	}

	// Static Method ; Keyword = Static - then this method will be automatically
	// become Static method.
	// Static Method will accept only static variables; only static variable should
	// use inside.
	// To call this method we need use classname.methodname();

	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) { // Main method block only will executed
		StaticVariable obj = new StaticVariable("Jen", "123 Company"); // Object creation obj & Obj1
		StaticVariable obj1 = new StaticVariable("Bob", "ABC Company");
		obj.getAddress();
		obj1.getAddress();
		StaticVariable.getCity();
	}

}
