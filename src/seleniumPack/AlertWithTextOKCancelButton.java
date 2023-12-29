package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextOKCancelButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    
	    // Accepted popup
	    
	    driver.findElement(By.linkText("Alert with Textbox")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button\r\n")).click();
	    driver.switchTo().alert().sendKeys("Raj");
	    driver.switchTo().alert().accept();
	    
	    String userValue = driver.findElement(By.xpath("//*[@id=\"demo1\"]\r\n")).getText();
	    String expactedResult = "Hello Raj How are you today";
	    
	    String actualResult = (userValue.equals(expactedResult))? "Test case Passed " : "Test case Failed";
	    System.out.println(actualResult);
	    
	    // Cancel popup
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button\r\n")).click();
	    driver.switchTo().alert().dismiss();
	}
}
