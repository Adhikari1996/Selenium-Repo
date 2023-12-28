package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");

     WebDriver driver = new ChromeDriver();
     driver.get("https://practicetestautomation.com/practice-test-login/");
     
     driver.manage().window().maximize();
     
     WebElement userName = driver.findElement(By.name("username"));
     userName.sendKeys("student");
     
     WebElement password = driver.findElement(By.name("password"));
     password.sendKeys("Password123");
     
     WebElement submit = driver.findElement(By.id("submit"));
     submit.click();
     
     String ExpTitle = "Logged In Successfully | Practice Test Automation";
     String ActTitle = driver.getTitle();
     
     if (ExpTitle.equals(ActTitle)) {
    	 System.out.println("Test case passed");
     }else {
    	 System.out.println("Failed"); 
     }
     driver.findElement(By.className("wp-block-button__link"));
     driver.close();
	}

}
