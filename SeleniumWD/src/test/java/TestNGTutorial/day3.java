package TestNGTutorial;
//Concept of TestNG

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void webLoginCarLoan() {

		// Selenium code

		System.out.println("3rd class TestNG: 4th Testcase realated to Web Car loan");

	}

	@Test
	public void mobileLoginCarLoan() {

		// Appium code

		System.out.println("3rd class TestNG: 5th Testcase realated to Mobile Car loan");

	}

	@Test
	public void mobileSignOut() {

		// Appium code

		System.out.println("3rd class TestNG: 5th.2 Testcase realated to Mobile Signout Car loan");

	}

	@Test
	public void mobileHomeScreen() {

		// Appium code

		System.out.println("3rd class TestNG: 5th.3 Testcase realated to Mobile HomeScren Car loan");

	}

	@BeforeSuite
	public void bfSuite() {
		System.out.println("3rd Class =  I'll execute First Before Suite");
	}

	@Test
	public void APICarLoanLogin() {

		// REST API code

		System.out.println("3rd class TestNG: 6th Testcase realated to Login API Car Loan");

	}
}
