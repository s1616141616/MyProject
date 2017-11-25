package com.viasat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeaderLinkClick {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D://QA Job//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://viasat.com");
	}

	@Test (priority = 1 )
	public void serviceSystemLinkTest() throws InterruptedException {

		driver.findElement(By.xpath("//a[@href='/services-systems']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

	}

	@Test (priority =2)
	public void industriesApplicationsLinkTest() throws InterruptedException {

		driver.findElement(By.xpath("//a[@href='/industries-applications']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

	}

	@Test (priority = 3)
	public void supportTrainingLinkTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@href='/support-training']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
	}
	
	@Test (priority = 4)
	public void aboutLinkTest() throws InterruptedException{
		
		driver.findElement(By.xpath("//a[@href='/about']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	@Test (priority = 5)
	public void careersLinkTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@href='/careers']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	@Test (priority = 6)
	public void contactLinkTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@href='/contact']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}