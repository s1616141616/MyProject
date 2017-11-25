package com.viasat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeaderLinkClickLoop {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D://QA Job//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://viasat.com");
	}

	@Test // (priority = 1 )
	public void serviceSystemLinkTest() throws InterruptedException {

		// =driver.findElements(By.xpath("//li[contains(@class,'sf-depth-1')]"));
		List<WebElement> list = driver.findElements(By.xpath("//li[contains(@class,'sf-depth-1')]/a"));
		int totalMenu = list.size();
		System.out.println(totalMenu);

		for (int i = 0; i < totalMenu; i++) {

			WebElement ele = list.get(i);
			String menuList = ele.getText();
			System.out.println(menuList);

			if (menuList.equalsIgnoreCase("Contact")) {
				ele.click();
				break;
			}
		}

		/*
		 * for (int i = 0; i < totalMenu; i++) {
		 * 
		 * driver.findElement(By.xpath("//a[@href='/services-systems']")).click();
		 * Thread.sleep(3000); driver.navigate().back();
		 * 
		 * driver.findElement(By.xpath("//a[@href='/industries-applications']")).click()
		 * ; Thread.sleep(3000); driver.navigate().back();
		 * 
		 * driver.findElement(By.xpath("//a[@href='/support-training']")).click();
		 * Thread.sleep(3000); driver.navigate().back();
		 * 
		 * driver.findElement(By.xpath("//a[@href='/about']")).click();
		 * Thread.sleep(3000); driver.navigate().back();
		 * 
		 * driver.findElement(By.xpath("//a[@href='/careers']")).click();
		 * Thread.sleep(3000); driver.navigate().back();
		 * 
		 * driver.findElement(By.xpath("//a[@href='/contact']")).click();
		 * Thread.sleep(3000);
		 * 
		 * }
		 */ }

	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}