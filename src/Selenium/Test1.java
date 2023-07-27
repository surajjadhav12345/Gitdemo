package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedr.exe"); 
		WebDriver driver= new ChromeDriver ();
		driver.get("https://www.google.com");
	}

}
				

