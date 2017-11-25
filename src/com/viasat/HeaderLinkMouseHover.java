package com.viasat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderLinkMouseHover {

	WebDriver driver;
	Actions action;
	WebElement element;

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D://QA Job//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.viasat.com");

	}

	@Test(priority = 1)
	public void serviceSystemLinkMouseHoverTest() throws InterruptedException {

		action = new Actions(driver);
		element = driver.findElement(By.xpath("//a[@href='/services-systems']"));
		action.moveToElement(element).perform();
		Thread.sleep(3000);

		element = driver.findElement(By.id("logo"));
		action.moveToElement(element).perform();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void industriesApplicationsLinkMouseHoverTest() throws InterruptedException {

		action = new Actions(driver);
		element = driver.findElement(By.xpath("//a[@href='/industries-applications']"));
		action.moveToElement(element).perform();
		Thread.sleep(3000);

		element = driver.findElement(By.id("logo"));
		action.moveToElement(element).perform();

	}

}