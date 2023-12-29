package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Slider.html");
	    driver.switchTo().frame(0);
	    WebElement slider = driver.findElement(By.xpath("html/body/section/div[1]/div/div/div/a"));
	    System.out.println(slider);
	    Actions action = new Actions(driver);
	    action.moveToElement(slider).dragAndDropBy(slider, 200, 0).build().perform();
	}

}
