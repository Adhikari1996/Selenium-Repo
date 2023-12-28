package seleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	 
	 ChromeOptions option = new ChromeOptions();
	 //option.setHeadless(true);
	 option.addArguments("--headless");
	 
	 WebDriver driver = new ChromeDriver(option);
     driver.get("https://practicetestautomation.com/practice-test-login/");
     
     System.out.println(driver.getTitle());
     System.out.println(driver.getCurrentUrl());
	}

}
