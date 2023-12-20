package TestNGTutorial;

import org.testng.annotations.BeforeTest;

//Concept of TestNG

import org.testng.annotations.Test;

public class day2 {

	@Test
	public void ploan() {
		System.out.println("2nd class TestNG: 3rd Testcase");

	}

	@BeforeTest
	public void prerequiste() {
		System.out.println("Before Test: I will execute first");
	}
}
