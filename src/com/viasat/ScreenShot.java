package com.viasat;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {

	@Test
	public void captureScreenShotTest() throws IOException, InterruptedException {

		// WebDriver driver =new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Saif\\eclipse-workspace\\ViaSat\\src\\com\\viasat\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.viasat.com/about/executive-team");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("D:\\Users\\Saif\\eclipse-workspace\\ViaSat\\Screenshot\\home.png"));

		System.out.println("Taken");

		Thread.sleep(3000);

		driver.quit();
	}
}