package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOKCancelButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
	    //Accepts ok button
	    
	    driver.switchTo().alert().accept();
	    
	    String pressOK = "You pressed Ok";
	    String pressCancel = "You Pressed Cancel";
	    
	    String dynamicValue = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
	    System.out.println("first time :"+dynamicValue);
	    
	    String accptResult = (pressOK.equals(dynamicValue))?"Test Case accepted Passed " : "Test Case accepted Failed";
	    System.out.println(accptResult);
	    
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
	    driver.switchTo().alert().dismiss();
	    dynamicValue = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
	    System.out.println("second time :"+dynamicValue);
	    
	    String dismisResult = (pressCancel.equals(dynamicValue))?"Test Case dismised Passed " : "Test Case dismised Failed";
	    System.out.println(dismisResult);
	    

	}
}
