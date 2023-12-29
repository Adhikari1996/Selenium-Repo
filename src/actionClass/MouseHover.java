package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://qatechhub.com/mouse-hover-actions-selenium-webdriver/");
	    driver.manage().window().maximize();
	    Actions action = new Actions(driver);
	    WebElement tutorial =driver.findElement(By.xpath("/html/body/div[2]/div/header/div[2]/div/div/nav/ul/li[2]/a"));
	    WebElement learnSelenium =driver.findElement(By.xpath("html/body/div[2]/div/header/div[2]/div/div/nav/ul/li[2]/ul/li[1]/a"));
	    WebElement seleniumTutorials =driver.findElement(By.xpath("/html/body/div[2]/div/header/div[2]/div/div/nav/ul/li[2]/ul/li[1]/ul/li[1]/a\r\n"));
	    //Single statement
	    action.moveToElement(tutorial).moveToElement(learnSelenium).moveToElement(seleniumTutorials).click().build().perform();
	    //multi statement
//	    action.moveToElement(tutorial).build().perform(); //mouse to over tutorial tab
//	    action.moveToElement(learnSelenium).build().perform(); //mouse to over learnSelenium tab
//	    action.moveToElement(seleniumTutorials).click().build().perform(); // mouse over to selenium tutorials and click
	}

}
