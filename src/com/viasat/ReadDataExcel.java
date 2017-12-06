package com.viasat;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataExcel {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Saif\\eclipse-workspace\\ViaSat\\src\\com\\viasat\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");

	}

	@Test(dataProvider = "loginData")
	public void gmailLoginTest(String username, String password) throws Exception {

		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("passwordNext")).click();

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "Gmail", "Fail");

		Thread.sleep(3000);

	}

	@AfterMethod
	public void closeBrowser() {

		driver.quit();
	}

	@DataProvider(name = "loginData")
	public Object[][] passData() {

		ExcelDataConfig config = new ExcelDataConfig("D:\\Users\\Saif\\eclipse-workspace\\ViaSat\\TestData\\t.xlsx");

		int rows = config.getRowCount(0);
		Object[][] data = new Object[rows][2];

		for (int i = 0; i < rows; i++) {

			data[i][0] = config.getData(0, i, 0);
			data[i][1] = config.getData(0, i, 1);
		}
		return data;
	}
}