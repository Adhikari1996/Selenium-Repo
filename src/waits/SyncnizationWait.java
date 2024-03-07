package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncnizationWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement firstName=driver.findElement(By.name("firstname"));
		WebElement lastName=driver.findElement(By.name("lastname"));
		WebElement phone=driver.findElement(By.name("reg_email__"));
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		WebElement submit=driver.findElement(By.name("websubmit"));
		WebElement alreadyAcc=driver.findElement(By.linkText("Already have an account?"));
		
//		WebDriverWait driverwait = new WebDriverWait(driver,8);
//		driverwait.until(ExpectedConditions.elementToBeClickable(firstName));
//		firstName.sendKeys("Raj");
		
		sendKeys(firstName,driver,8,"Raj");
		sendKeys(lastName,driver,5,"Adhikari");
		sendKeys(phone,driver,5,"9205618013");
		sendKeys(password,driver,5,"123456");
		
		//clickOn(driver,submit,6);
		clickOn(driver,alreadyAcc,6);
		
	}
	
	public static void sendKeys(WebElement element,WebDriver driver,int timeout , String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
      }
	
	public static void clickOn(WebDriver driver,WebElement element,int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}



//<----- Pageload Timeout--->
//1.driver.manage().timeouts().pageLoadTimeout(4,TimeUnit.SECONDS);

//<----- Implicit Wait--->
//2.driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);

//<----- Explicit Wait--->
//3.WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
//wait.until(ExpectedConditions.visibilityOf(element));
//element.sendKeys("Rajesh")

//<----- Fluent Wait--->
//4.FluentWait<WebDriver> fluent = new FluentWait<WebDriver>(driver)
//.withTimeout(Duration.ofSeconds(5))
//.pollingEvery(Duration.ofMillis(2))
//.ignoring(Exception.Class)
//.withMessage("your message");
//fluent.until(ExpectedCondtions.presenceOfElementIsLocated(By.xpath("//*[@id=\"textbox\"]"))).click();
