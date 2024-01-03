package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizeable {

	public static void main(String[] args)  {
     System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
     WebDriver wb = new ChromeDriver();
     wb.get("https://jqueryui.com/resizable/");
     wb.manage().window().maximize();
     wb.switchTo().frame(0);
     WebElement resize = wb.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
     Actions ac = new Actions(wb);
     //ac.moveToElement(resize).dragAndDropBy(resize, 200, 20).build().perform();
     ac.dragAndDropBy(resize, 200, 50).perform();
	}
}
