package com.viasat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomePage {

	@Test
	public void launchHomePageTest() throws InterruptedException {

		// WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D://QA Job//chromedriver_win32//chromedriver.exe");

		// System.setProperty("webdriver.edge.driver",
		// "d://Users//Saif//Downloads//MicrosoftWebDriver.exe");
		// WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();

		driver.get("https://www.viasat.com/");

		driver.findElement(By.xpath("//a[@href='/services-systems']")).click();

		driver.findElement(By.xpath(
				".//*[@id='block-system-main']/div/div/div/div[1]/div/div/div/div[3]/div/div/div[1]/div[1]/div/a/img"))
				.click();
		driver.navigate().back();

		driver.findElement(By.xpath(
				".//*[@id='block-system-main']/div/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[1]/div/a/img"))
				.click();
		driver.navigate().back();

		// driver.findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div[1]/div/div/div/div[3]/div/div/div[3]/div[1]/div/a/img")).click();

		Actions action = new Actions(driver);

		WebElement element = driver.findElement(By.xpath(
				".//*[@id='block-system-main']/div/div/div/div[1]/div/div/div/div[3]/div/div/div[1]/div[1]/div/a/img"));

		action.moveToElement(element).perform();

		driver.findElement(By.xpath(
				".//*[@id='block-system-main']/div/div/div/div[1]/div/div/div/div[3]/div/div/div[1]/div[3]/div/div[1]/a"))
				.click();
		driver.navigate().back();

		Actions action1 = new Actions(driver);

		WebElement element1 = driver.findElement(By.xpath(
				".//*[@id='block-system-main']/div/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[1]/div/a/img"));

		action1.moveToElement(element1).perform();

		driver.findElement(By.xpath(
				".//*[@id='block-system-main']/div/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[3]/div/div[1]/a"))
				.click();
		driver.navigate().back();
		// Thread.sleep(3000);
		// driver.navigate().back();

		// Thread.sleep(3000);
		// driver.quit();
	}

}

/*
 * Actions action = new Actions(driver);
 * 
 * WebElement element =
 * driver.findElement(By.xpath("//a[@href='/services-systems']"));
 * 
 * action.moveToElement(element).perform();
 * 
 * WebElement element1= driver.findElement(By.xpath("//a[@href='/services']"));
 * WebDriverWait wait = new WebDriverWait(driver, 10);
 * wait.until(ExpectedConditions.elementToBeClickable(element1));
 * element1.click(); driver.navigate().back(); Thread.sleep(3000);
 * 
 * WebElement element3 =
 * driver.findElement(By.xpath("//a[@href='/services-systems']"));
 * action.moveToElement(element3).perform();
 * 
 * WebElement element2=
 * driver.findElement(By.xpath("//a[@href='/services/business']"));
 * //WebDriverWait wait = new WebDriverWait(driver, 10);
 * wait.until(ExpectedConditions.elementToBeClickable(element2));
 * element2.click(); driver.navigate().back();
 * 
 */

/*
 * List <WebElement>list =
 * driver.findElements(By.xpath("//li[contains(@id,'menu-24')]")); int listCount
 * =list.size(); System.out.println(listCount);
 * 
 * 
 * for (int i=0; i <listCount;i++) { WebElement element1 = list.get(i); //String
 * listMenu
 * =driver.findElement(By.xpath("//a[@href='/services/business']")).getAttribute
 * ("innerHTML"); String listMenu =element1.getAttribute("innerHTML");
 * 
 * System.out.println(listMenu);
 * 
 * }
 * 
 */