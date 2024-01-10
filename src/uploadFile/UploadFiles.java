package uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFiles {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://demo.automationtesting.in/Register.html");
	    driver.manage().window().maximize();
	    
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"))).click().build().perform();
	    
	    String imagesFilePath = "C:\\driver\\capture\\";
	    String inputFilePath = "C:\\driver\\capture\\";
	    
	    Screen screen = new Screen();
	    Pattern fileInputTextBox = new Pattern(imagesFilePath + "filename.PNG");
	    Pattern openButton = new Pattern(imagesFilePath + "open.PNG");
	    
	    Thread.sleep(4000);
	    screen.wait(fileInputTextBox,20);
	    screen.type(fileInputTextBox,inputFilePath+"data.txt");
	    screen.click(openButton);
	}

}
