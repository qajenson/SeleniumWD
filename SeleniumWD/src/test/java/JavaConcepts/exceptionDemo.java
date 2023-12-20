package JavaConcepts;

// Different kind of exceptions try {} Catch(){} finally
// finally - This block will be executed irrespective of exception thrown or not 
// finally - ie even the script got failed in between the code. it comes down and check for finally block and execute all the statements present in that finally block
// Rule of finally - finally blocks should be used only if use try () & catch() block 
// finally real time usage - if you write scripts due to some reason script failed. so if you write to clear cookies or close the application or window etc we can write in the finally. Next time if use lauch app for next use cookies will be cleared
// finally - even the script passes it execute finally block statements.
// Without catch block - The script may fail and throws error in output. but finally blocks will be executed in that case. To check kindly comment all catch blocks below.

//Interview question why & where we use finally block?
// Answer:  As a automation tester - you might use finally block to close the browser once the test is done irrespective of pass or fail or delete the cookies

// Another question - Is there anywhere this finally block will not get executed? or tell me where finally block will not get executed?
// Answer: It will not be executed when you stop JVM forcibilly. like when it is running if you tries to hit or stop before it is executing in that case only finally wont be executed.
// One try can be followed by multiple catch blocks
// Catch block always followed by try blocks - Catch block should defintely follow by try blocks (ie inbetween try and catch blocks if you write some other codes script wont accept.
// Purpose of multiple catch blocks written in code - if you get any exception you can write in one catch block and another exception for second catch blocks so on...
// Each exception will handle only particular exceptions - for more info google Java different type of exceptions

public class exceptionDemo {

	int a = 4;

	// 3 or 4 lines of code here - may throw an error.
	// try catch mechanism

	int b = 7;
	int c = 0;

//Step1: Starts here-----------
	// int k = b / c; // Expected result: 7/0 = undefined

	// public void getData() {
	// System.out.println(k);
	// }

// Step 1 ends here -----------------:

	// if I suspect any error - Then i can use try catch mechanism

	public static void main(String[] args) {

// For step1  Starts-----------
		// exceptionDemo ed = new exceptionDemo();
		// ed.getData();
// For step1  ends -----------

		// Step 2: starts here
		int a1 = 8;
		int b1 = 0;
		try {

// For Step2 

			// purchased failed

			// int k1 = a1 / b1; // Expected result: 8/0 = undefined
			// System.out.println(k1);

			// Enabled for Step2
			int arr[] = new int[5];
			System.out.println(arr[7]); // Trying to print array index present in 7. so respective catch block will be
										// executed

		} catch (ArithmeticException ae) { // This catch exception will listen only Arithmetic problems

			// This ArithmeticException will handle only Arithemetic related exceptions,
			// Other exceptions won't handle here

			System.out.println("I catched ArithmeticException here - Due to try block ");

		} catch (ArrayIndexOutOfBoundsException abe) { // For Step 2

			System.out.println("I catched ArrayIndexOutOfBoundsException here - Due to try block ");

		} catch (Exception e) {

			// retry again the purchase
			// This is a parent class and this block accepts all kind of exceptions
			// Ideally I write this general exception which catches for everything, its all
			// up to you
			// Google it for more exceptions

			System.out.println("I catched General error/exception here - Due to try block ");
		}
		// Step 2: ends here

		finally {
			System.out.println("I am in finally block. Please delete cookies");
		}
	}

}

// So if I feel any of my code may throw an error how can you handle that error?
// Lets say I'm writing 3 or 4 lines of code above and I'm not sure whether these lines throw an error or not.
// If it throws an error I need to catch them and print a message without failing.
// That can be done by using try catch mechanism
// In general when people try to write the code and they're suspect that there might be an error in to that then they will use that in exception handling

// When ever you put something in try block you are just trying may be this code works or not. If it fails then control will come out of this try block and enters into catch.

// Step 1 : Error below
// If you run step 1 code - Uncomment only step1 starts and step1 ends inbetween lines of code & run - You will get error
/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * JavaConcepts.exceptionDemo.<init>(exceptionDemo.java:14) at
 * JavaConcepts.exceptionDemo.main(exceptionDemo.java:21)
 */

//	Source Google: Types of catch exceptions are below https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/

//	ArithmeticException  - It is thrown when an exceptional condition has occurred in an arithmetic operation.
//	ArrayIndexOutOfBoundsException - It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.
//	Checked exception
//	ClassNotFoundException 
//	NullPointerException 
//	IOException   etc
//	Each exception has specific purposes
