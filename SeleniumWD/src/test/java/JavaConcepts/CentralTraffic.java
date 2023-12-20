package JavaConcepts;

public interface CentralTraffic {
	// Notes:1
	// This is pack where methods are not defined.
	// They will be defined in abstract level
	// Here I can't use these {} Because these braces stands for defining body of
	// the method as body of the method is not allowed in this interface.
	// we would just define.
	// void -is required, because return type expects something.
	// Better to create interface first then add methods to this interface then
	// create another class file

	public void greenGo();

	public void redStop();

	public void FlashYellow();

	// Note:2
	// We can define variables here. but you have to make sure that these variables
	// should be public.
	// If you don't define them as a public. Even if you don't use that this will
	// treat these variables as public

	public int i = 10;

	int j = 20; // This will treat as public here

	public String s = "Variable Interface1";

	String s2 = "Variable Interface2"; // This will treat as public here

}
