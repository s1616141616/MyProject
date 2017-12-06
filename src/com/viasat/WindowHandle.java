package com.viasat;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {

	@Test
	public void closeChildWindowTest() throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
		"D:\\Users\\Saif\\eclipse-workspace\\ViaSat\\src\\com\\viasat\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver ();
		driver.get("https://www.naukri.com/");
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
//		Thread.sleep(18000);
		Set <String> allWindows=driver.getWindowHandles();
		
		ArrayList<String>tab =new ArrayList<>(allWindows);
		driver.switchTo().window(tab.get(2));
		driver.close();
		driver.switchTo().window(tab.get(1));
		driver.close();
	}
	
}
