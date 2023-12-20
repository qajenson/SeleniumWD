package JavaConcepts;

//This class is created for Access Modifier concept --

public class public_access_modifiers { // Public Class
	static int x1 = 50;
	static int y1 = 10;
	static int z1 = 2;
	static int Total1;

	public static void Addition() // Public Modifier
	{
		Total1 = x1 + y1;
		System.out.println("public static method Addition is: " + Total1);
	}

	public static void Multiplication() // Public Modifier
	{
		Total1 = x1 * y1;
		System.out.println("public static method Multiplication is: " + Total1);
	}

	public void Division() // Public Modifier
	{
		Total1 = x1 / y1;
		System.out.println("public without static method Division is: " + Total1);
	}

	private void Add() {
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println("Private method is: " + c);
	}

	protected static void Sub() {
		int s = 500;
		int k = 300;
		int y = s - k;
		System.out.println("Protected static method Sub is: " + y);
	}

	public static void main(String[] args) {
		public_access_modifiers jen1 = new public_access_modifiers();
		// jen1.Addition();
		// jen1.Multiplication();
		// jen1.Division();
		Addition(); // To call method -- Call methodname() directly
		Multiplication(); // To call method -- Call methodname() directly
		jen1.Division(); // To call method -- Object.method name() if it is not static
		jen1.Add();
		jen1.Sub();
	}

}
