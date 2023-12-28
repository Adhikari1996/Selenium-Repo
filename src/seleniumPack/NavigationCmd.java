package seleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCmd {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://demo.automationtesting.in/Windows.html");
	     System.out.println(driver.getTitle());
	     
	     driver.navigate().to("https://www.facebook.com/login/");
	     System.out.println(driver.getTitle());
	     
	     driver.navigate().back();
	     System.out.println(driver.getTitle());
	     
	     driver.navigate().forward();
	     System.out.println(driver.getTitle());
	     
	     driver.navigate().refresh();
	    
	     driver.close();     
//	     ---Navigation commands---
//	        navigate().To()
//	        navigate().back()
//	        navigate().forward()
//	        navigate().refresh()
	}
}
