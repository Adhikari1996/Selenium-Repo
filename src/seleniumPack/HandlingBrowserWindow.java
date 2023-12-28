package seleniumPack;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowserWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Windows.html");
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
	    
	    Set <String> noOfID = driver.getWindowHandles();
	    //System.out.println(noOfID);
	    
	    for(String ID : noOfID) {
	    	String windowsURL = driver.switchTo().window(ID).getTitle();
	    	System.out.println(windowsURL);
	    	
	    	if(windowsURL.contains("Frames & windows"))
	    		driver.close();
	    } 
	}	
//	    ---Switching commands---
//	    
//	    SwitchTo().frame();
//	    SwitchTo().alert();
//	    SwitchTo().defaultContent();
//	    switchTo().window();
//	    Driver.getWindowHanldes();
}
