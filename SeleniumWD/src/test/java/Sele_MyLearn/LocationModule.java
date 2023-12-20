package Sele_MyLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationModule {

	public static void main(String[] args) throws InterruptedException {

	}

	public void TopMenuSelect() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
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

	}

}
