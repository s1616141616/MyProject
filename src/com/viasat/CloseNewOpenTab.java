package com.viasat;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseNewOpenTab {

	@Test
	public void closeNewTabTest() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Saif\\eclipse-workspace\\ViaSat\\src\\com\\viasat\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bangla2000.com/index.asp");
		String parent = driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//html/body/table[4]/tbody/tr[2]/td[2]/table[2]/tbody/tr/td/span/font/table/tbody/tr/td[1]/a[5]"))
				.click();

		Set<String> allWindows = driver.getWindowHandles();
	//	int count = allWindows.size();
		//System.out.println(count);

		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {

				driver.switchTo().window(child);
				Thread.sleep(5000);

				driver.close();
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}
}