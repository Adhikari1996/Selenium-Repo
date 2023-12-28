package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver();
	     driver.get("https://practicetestautomation.com/practice-test-login/");
	     
	     WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/section/section/h2"));
	     System.out.println(login.getText());
	     
	     //driver.close();
	       driver.quit();
	       
//	    ---Get commands---
//	       get()
//	       getTitle()
//	       getCurrentURL()
//	       getText()
//	       getControls()
//	       getPageSource()
	       

	}

}
