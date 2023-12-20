package TestNGTutorial;
//Concept of TestNG

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {

	@Test
	public void webLoginHomeLoan() {

		// Selenium code

		System.out.println("4th class TestNG: 7th Testcase Web Login Home loan");

	}

	@Test
	public void mobileLoginHomeLoan() {

		// Appium code

		System.out.println("4th class TestNG: 8th Testcase Mobile Login Home loan");

	}

	@Test
	public void loginAPIHomeLoan() {

		// REST API code

		System.out.println("4th class TestNG: 9th Testcase API Login Home Loan");

	}

	@AfterMethod
	public void afMethod() {
		System.out.println("I will execute After every method in this class 4");
	}

	@BeforeMethod
	public void bfMethod() {
		System.out.println("I will execute Before every method in this class 4");
	}
}
