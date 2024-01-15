package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOKButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
	    //Alert box with Ok button exmaple
	    //Switch to alert box
	    //If ok button then used to accept method
	    String alertText = driver.switchTo().alert().getText();
	    System.out.println("Alert message is : " +alertText);
	    if(alertText.contains("I am an alert box!"))
	        driver.switchTo().alert().accept();
	    else
	    	System.out.println("Alert not working properly");
	    //If Cancel button then used to dismiss method
	    //driver.switchTo().alert().dismiss();
	}

}
