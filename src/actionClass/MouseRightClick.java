package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    driver.manage().window().maximize();
	    Actions action = new Actions(driver);
	    WebElement button = driver.findElement(By.xpath("/html/body/span"));
//	    System.out.println(copy);
        action.contextClick(button).build().perform();
        WebElement copy = driver.findElement(By.xpath("/html/body/ul/li[3]/span"));
        copy.click();
        String  expactedRes = "clicked: copy";
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        String result = alertText.equals(expactedRes) ? "Test case passed " : "Test case failed";
        System.out.println(result);
	}

}
