package com.viasat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BootStrapPopup {

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Saif\\eclipse-workspace\\ViaSat\\src\\com\\viasat\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.honest.com");
		//driver.switchTo().frame("bcx_local_storage_frame");
		Thread.sleep(5000);
	}
	
	@Test
	public void popupClosingTest() {
		
		driver.findElement(By.xpath("//div[contains(@id,'bx-element-622589-Fb4KQ0e']")).click();
		
	}
}
