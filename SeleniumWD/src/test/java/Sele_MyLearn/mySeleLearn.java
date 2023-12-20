package Sele_MyLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mySeleLearn {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("My Application Testing By Using Selenium WebDriver!...");
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		// Implicit wait - 4 seconds; here Duration is a class

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		// Maximize the browser window.
		driver.manage().window().maximize();
		System.out.println("User: Maximized the browser window");

		// Open application URL
		driver.get("https://qa-customtemplate1.bsi-connect.net/Login/Login");
		// driver.get("https://qa-customtemplate1.bsi-connect.net/Connect/");

		// Getting the current URL after the click
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		System.out.println("User: Navigated to Login Page");

		// Waiting for 1 seconds
		Thread.sleep(1000);
		System.out.println("User: Wait for 1 seconds");
		/*
		 * // Forgot password
		 * driver.findElement(By.xpath("//input[@id='ForgotPassword']")).click();
		 * 
		 * driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("abc");
		 * 
		 * driver.findElement(By.xpath("//input[@value='Send']")).click();
		 */
		/*
		 * // By using locators ID WebElement username =
		 * driver.findElement(By.id("Username")); username.sendKeys("NKorea.681");
		 * Thread.sleep(2000); username.clear();
		 * 
		 * WebElement password = driver.findElement(By.id("Password"));
		 * password.sendKeys("#qwerty123"); Thread.sleep(2000); password.clear();
		 * System.out.println("User: Wait for 2 seconds");
		 * System.out.println("Used Locator by using ID");
		 * 
		 */

		// By using locators Relative XPath
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("NKorea.681");
		// driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys("NKorea.681");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("#qwerty123");
		// username.clear();
		// password.clear();
		System.out.println("Used Locator by using Relative Xpath");

		driver.findElement(By.id("login")).click();

		// By using CSS selector - Locator
		// System.out.println(driver.findElement(By.cssSelector("div.validation-summary-errors")).getText());
		Thread.sleep(5000);
		System.out.println("User: Homepage Loaded successfully");

		// Getting the Title of the URL
		String CurrentPagetitle = driver.getTitle();
		System.out.println("Current Page Title is: " + CurrentPagetitle);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='topMenu4']")));
		Thread.sleep(7000);

		// S_Menu - Findings
		driver.findElement(By.xpath("//button[@aria-label='Findings']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='>View Findings']")).click();
		System.out.println("Clicked View findings sub menu");
		Thread.sleep(5000);

		// User Logout
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[@id='last-span-hover']")).click();
//		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[@id='menu-span-last-link-span-1']")).click();
		Thread.sleep(5000);

		// S_Menu - Auditing
		// driver.findElement(By.xpath("//button[@aria-label='Auditing']")).click();

		// S_Menu - Findings
		// driver.findElement(By.xpath("//button[@aria-label='Findings']")).click();

		// S_Menu - Actions
		driver.findElement(By.xpath("//button[@aria-label='Actions']")).click();

		// SSub_Menu- View Actions , Create Action

		// driver.findElement(By.xpath("//button[@id='>View Actions']")).click();
		driver.findElement(By.xpath("//button[@id='>Create Action']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@value='Action']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@aria-label='Continue']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//textarea[@id='inputInputtypeCover_Title']")).sendKeys("Hello Action");
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//span[@id='spanMultiselectArrowCustom'])[1]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='741747-input']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//img[@id='imgMultiselectlistTreeAproval']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//span[contains(text(),'QA')])[5]")).click();
		// Not working
// driver.findElement(By.xpath("//input[@id='inputTreeSearchBar']")).sendKeys("mexico");

		// Rel xpath - Not working
// driver.findElement(By.xpath("(//span[normalize-space()='DND Mexico 681 Jenson QA'])[1]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[contains(text(),'DND NKOREA 681 JENSON QA')])[4]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id='btnAssignLocationsPopUpApply']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@id='imgCustom-Calender_StartDate']")).click();
		// //img[@id='imgCustom-Calender_StartDate']
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@aria-label='30 December 2023']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		Thread.sleep(3000);

// driver.findElement(By.xpath("//button[@aria-label='BSI Certificates & Reports']")).click();
		System.out.println("Clicked side menu");
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Hello");
		Thread.sleep(3000);
		Thread.sleep(3000);

		// input[@aria-label='Management System']
		/*
		 * aria-label="Actions" aria-label="BSI Certificates & Reports"
		 * aria-label="Actions"
		 */
		// T_Menu click Profile
		driver.findElement(By.xpath("//span[@id='last-span-hover']")).click();
		System.out.println("Clicked profile name top menu");
		Thread.sleep(5000);

		// T_Menu click 'Help
		driver.findElement(By.xpath("//button[@aria-label='Help']")).click();
		System.out.println("Clicked Help top menu");
		Thread.sleep(5000);

		// T_Menu click 'Reporting'
		driver.findElement(By.xpath("//button[@aria-label='Reporting']")).click();
		System.out.println("Clicked Reporting top menu");
		Thread.sleep(5000);

		/*
		 * // T_Menu click 'Connect features' //
		 * driver.findElement(By.xpath("//*[@id=\"bsi-launchpad\"]")).click();
		 * driver.findElement(By.xpath("//button[@id='appcues-widget-icon']")).click();
		 * Thread.sleep(7000);
		 */

		/*
		 * // Navigate To Command driver.navigate().to(
		 * "https://qa-customtemplate1.bsi-connect.net/Connect/locations");
		 * Thread.sleep(4000); System.out.println(driver.getCurrentUrl());
		 * driver.navigate().refresh();
		 */
		// Alternative way
		driver.findElement(By.xpath("//button[@aria-label='Administration']")).click();
		Thread.sleep(7000);

		// Index xpath
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

		// Location Create
		/*
		 * driver.findElement(By.id("inputInputtypeCover_Name")).sendKeys("Location ADD"
		 * ); Thread.sleep(4000);
		 * 
		 * driver.findElement(By.id("inputInputtypeCover_AddressLine1")).
		 * sendKeys("DEV or QA Environment"); Thread.sleep(4000);
		 * 
		 * driver.findElement(By.id("inputInputtypeCover_TownOrCity")).sendKeys("IND UK"
		 * ); Thread.sleep(4000);
		 * 
		 * driver.findElement(By.id("inputInputtypeCover_PostCode")).sendKeys("687001");
		 * Thread.sleep(4000);
		 * 
		 * driver.findElement(By.id("imgMultiselectlistTreeBelongsTo")).click();
		 * Thread.sleep(4000);
		 * 
		 * driver.findElement(By.xpath("//span[contains(text(),'Auto_Prajna_DND_Loc1')]"
		 * )).click(); Thread.sleep(4000);
		 * 
		 * driver.findElement(By.xpath("//button[@id='btnAssignLocationsPopUpApply']")).
		 * click(); Thread.sleep(4000);
		 * driver.findElement(By.id("btnStatusDisplayName")).click();
		 * 
		 * Thread.sleep(9000);
		 */
		Thread.sleep(4000);

		// Navigate to Home Page
		driver.findElement(By.xpath("//button[@id='home']")).click();
		System.out.println("User Navigated to Home Page");
		Thread.sleep(4000);

		// Location Update -- from details page

		// Close the all the tabs or windows of the browser.
		System.out.println("User: Closed all browser tabs/windows");
		driver.quit();

	}

}
