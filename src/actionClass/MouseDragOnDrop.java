package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragOnDrop {

	public static void main(String[] args) {
        //--Here we used three method--- 
			// clickAndHold();
			// moveToElement();
			// release();
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    WebElement sourceItem = driver.findElement(By.xpath("//*[@id=\"box5\"]"));
	    WebElement targetItem = driver.findElement(By.xpath("//*[@id=\"box105\"]"));
	    
	    Actions action = new Actions(driver);
	    //one method
	    //action.clickAndHold(sourceItem).moveToElement(targetItem).release().build().perform();
	    //2nd method
	    action.dragAndDrop(sourceItem,targetItem).build().perform();
	}

}
