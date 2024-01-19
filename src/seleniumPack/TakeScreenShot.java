package seleniumPack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
	    
	    //Take screenshot of any page in selenium 
	    //Take screenshot and store as a file format
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //Now copy the screenshot into desire location using copyFile method
	    FileHandler.copy(src,new File("C:\\Users\\RAJESH 1\\eclipse-workspace\\SeleniumBasic\\src\\seleniumPack//google.png"));
	}

}
