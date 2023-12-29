package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    driver.manage().window().maximize();
        WebElement doubleClickButton = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).build().perform();
        String textRes = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        String expResult = "You double clicked me.. Thank You..";
        String finalRes = (expResult.equals(textRes)) ? "Test case passed " : "Test case failed";
        System.out.println(finalRes);
	}
}
