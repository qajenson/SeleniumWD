package TestNGTutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

//Concept of TestNG

import org.testng.annotations.Test;

public class day1 {

	// TestNG needs all it step execution in a method
	// Add test annotation and hover annotation 'Add TestNG library' now.
	// Again hover annotation text this time select
	// import.Test(org.testing.annotations)

// @Test is the one of the annotations in TestNG library which will recognize the method which immediately followed after this annotation as a Testcase
// When you write @test what ever the method follows after this @test annotation will be treated as a test case by TestNG.
// And it runs that program even if you don't provide public static void main(String[] args) { }
// Run As -> TestNG Test 
// Earlier you should always run as a Java application for public static void main(String[] args) { }	
// As you removed main method () Now you no more have an option of Java Application

	@AfterTest
	public void lastExecution() {

		System.out.println("I will execute last");
	}

	@Test
	public void demo() { // This is a method - also this is a first test case
		System.out.println("1st class TestNG: 1st Testcase"); // Some automation code written here
	}

	@Test
	public void SecondTest() {
		System.out.println("1st class TestNG: 2nd Testcase");
	}

	@AfterSuite
	public void afSuite() {
		System.out.println("1st class = I'll execute Last After Suite  ");
	}
}

//Note:
// If you run TestNG Application, you will get
// Some custom libraries inside their framework which will neatly provide information Passed or Failed , Display the method name such details.
// Output will be neatly organized 

// How to run tests with TestNg?
// #1 You need to have @Test Annotation followed by method.
// #2 You can define multiple tests from single class.
// #3 You can modularize the test cases based up on functionality and trigger them accordingly.
// #4 All the above points we cannot do in Java. if you import TestNG you can acheive this.
// #5 You can also get a control on running specific methods from test case.

// So in one single class you can multiple test cases, okay? 
// But whereas in Java if you want to write one test you will define public static void main(String[] args) { }. And if you want to create one more test case you will create another Java class
// Instead of that TestNG there is a feature where you can develop multiple test cases in one single class file.

// How do you differentiate between one test and another ?
// Answer: So if you write a test annotation then immediately TestNG read this as a test case. ie whatever you define after annotation will be treated as test case.
// So when you want to define second test case you have to write it in a method that's a TestNG rule.

// TestNG is the common frameworks we can use in selenium, appium & RestAPIs
