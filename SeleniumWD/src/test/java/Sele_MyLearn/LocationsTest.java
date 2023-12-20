package Sele_MyLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Location Module");
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window.
		driver.manage().window().maximize();
		System.out.println("User: Maximized the browser window");

		// Open Application URL
		driver.get("https://qa-customtemplate1.bsi-connect.net/Login/");
		System.out.println("User: Navigated to Login Page");
		Thread.sleep(2000);

		// Enter Login Credentials & Click Login button -- By using Locator XPath
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("NKorea.681");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("#qwerty123");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='login']")).click();
		System.out.println("User: Navigated to Home Page");
		Thread.sleep(10000);
		/*
		 * // To handle dropdown use SELECT class Select obj = new Select(WebElement);
		 * obj.
		 * 
		 */

		/*
		 * // Getting the current URL after the click String CurrentURL =
		 * driver.getCurrentUrl(); System.out.println(CurrentURL);
		 * 
		 * // Getting the Title of the URL String CurrentPagetitle = driver.getTitle();
		 * System.out.println(CurrentPagetitle);
		 */

		// Alternative way to get the current URL
		System.out.println("Current Application URL: " + driver.getCurrentUrl());

		// Alternative way to get Title of the URL
		System.out.println("Current Page Title is: " + driver.getTitle());
		Thread.sleep(5000);

		// Navigate to View Locations page via Administration Top Menu
		driver.findElement(By.xpath("//button[@aria-label='Administration']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Structure')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Locations')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Create Location')]")).click();
		// driver.findElement(By.xpath("//label[@for='radio-create-audit-0-input']")).click();
		// driver.findElement(By.id("radio-create-audit-1")).click();
		// driver.findElement(By.xpath("//label[text()='LocationInternal']")).click();
		Thread.sleep(5000);

		driver.navigate().to("https://qa-customtemplate1.bsi-connect.net/Connect/locations/2871869");
		// driver.findElement(By.xpath("//input[contains(text(),'Name')]")).sendKeys("Trichy
		// Update");
		// driver.findElement(By.xpath("//div[contains(@class,'ProseMirror
		// focus-visible')]")).sendKeys("HELLO USER DESC");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[contains(text(),'DND NKOREA 681 JENSON QA')]")).click();
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		driver.findElement(By.xpath("//span[@id='menu-span-last-link-span-1']")).click();
		// driver.navigate().refresh();

		// To Quit Application & Close browser Window
		driver.quit();
	}

}
