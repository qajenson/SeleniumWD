package Sele_MyLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RunApp extends LocationModule {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Testing BSI Connect RunAPP File - By Using Selenium WebDriver!");
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window.
		driver.manage().window().maximize();
		System.out.println("User: Maximized the browser window");

		// Open application URL
		driver.get("https://qa-customtemplate1.bsi-connect.net/Connect/");

		// Getting the current URL after the click
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		System.out.println("User: Navigated to Login Page");

		// Waiting for 2 seconds
		Thread.sleep(2000);
		System.out.println("User: Wait for 2 seconds");

		// By using locators Relative XPath
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("NKorea.681");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("#qwerty123");
		Thread.sleep(2000);
		// username.clear();
		// password.clear();
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		System.out.println("User: Homepage Loaded successfully");

		// Getting the Title of the URL
		String CurrentPagetitle = driver.getTitle();
		System.out.println("Current Page Title is: " + CurrentPagetitle);

		// Explicit wait sets timeouts for specific conditions ie 60 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='topMenu4']")));

		driver.findElement(By.xpath("//button[@aria-label='Administration']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[contains(text(),'Structure')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Locations')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'View Locations')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[contains(text(),'Add new')]")).click();
		System.out.println("User: Clicked Add New button");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//label[@for='radio-create-audit-0-input']")).click();
		driver.findElement(By.xpath("//button[@class='red-button small-button']")).click();
		System.out.println("User: Navigated to Location create Page");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[normalize-space()='Locations']")).click();
		System.out.println("User: Clicked breadcrumb link. Page navigate to view locations");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='search-record-input']")).sendKeys("Location ADD");
		System.out.println("User: Clicked Search box & entered search Text");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[contains(text(),'Location ADD')]")).click();
		System.out.println("User: Clicked searched record from the grid");

		Thread.sleep(5000);

		// Close the all the tabs or windows of the browser.
		System.out.println("User: Closed all browser tabs/windows");
		driver.quit();

		/*
		 * // Calling TopMenuSelect() method LocationModule T_menu = new
		 * LocationModule(); T_menu.TopMenuSelect();
		 */
	}

}
