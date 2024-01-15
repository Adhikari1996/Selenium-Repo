package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     //Using url
        //driver.get("https://the-internet.herokuapp.com/basic_auth");
	    //Using Auth
	     driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	     String value = driver.findElement(By.cssSelector("p")).getText();
	     System.out.println(value);
	}

}
