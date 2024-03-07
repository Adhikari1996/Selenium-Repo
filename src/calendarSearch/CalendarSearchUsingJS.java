package calendarSearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarSearchUsingJS {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'round trip')]")).click();
		WebElement element = driver.findElement(By.xpath(
				"//div[text()='Return Date']//following-sibling::div//child::div[@class=\"css-76zvg2 css-bfa6kz r-homxoj r-ubezar\"]"));
		System.out.println(element.getText());
		String date = "Fri, 8 March 2024";
		Thread.sleep(4000);
		selectDateByJS(driver, element, date);
	}

	public static void selectDateByJS(WebDriver driver, WebElement element, String date) throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].innerText=" + date, element);
		// js.executeScript("arguments[0].setAttribute('value','" + date + "');",
		// element);
	}

}
