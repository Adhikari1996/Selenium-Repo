package googleSearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("uttarakhand");
		Thread.sleep(5000);

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//descendant::span//b"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("tunnel news")) {
				list.get(i).click();
				break;
			}
		}
	}
}
