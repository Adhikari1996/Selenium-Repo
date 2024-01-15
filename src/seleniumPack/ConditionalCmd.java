package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCmd {
	
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		//driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		 
		boolean male = driver.findElement(By.xpath("/html/body/form/div[2]/div[15]/table/tbody/tr[1]/td/label")).isSelected();
		boolean female = driver.findElement(By.xpath("/html/body/form/div[2]/div[15]/table/tbody/tr[2]/td/label")).isSelected();
		
		System.out.println(male);
		System.out.println(female);
		
		if(male==false)
			driver.findElement(By.xpath("/html/body/form/div[2]/div[15]/table/tbody/tr[1]/td/label")).click();
		
//		 WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
//		 WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
//		 
//		 if(username.isDisplayed() && username.isEnabled())
//			 username.sendKeys("student");
//		 
//		 if(password.isDisplayed() && password.isEnabled())
//			 password.sendKeys("Password123");
		
	// --- Conditional Commands---
//		   isDisplayed();
//		   isEnabled();
//		   isSelected();
		
	// -- Wait Commands --	
		//Implicit Wait
		//Explicit Wait
		//Fluent Wait
	}

}
