package dynamicWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("rajadhikari");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Raj@12345");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[text()=\"Contacts\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"//a[text()=\"Watt Klopp\"]//parent::td[@class=\"datalistrow\"]//preceding-sibling::td[@class=\"datalistrow\"]//input[@name=\"contact_id\"]"))
				.click();
		driver.quit();
		/*
		 * //custom x-path when using tabular data.
		 * 
		 * preceding-sibling-
		 * //a[text()="Watt Klopp"]//parent::td[@class="datalistrow"]//preceding-sibling
		 * ::td[@class="datalistrow"]//input[@name="contact_id"];
		 * 
		 * following-sibling-
		 * //a[text()="Watt Klopp"]//parent::td[@class="datalistrow"]//following-sibling
		 * ::td[@class="datalistrow"]//a[text()="Amazon"];
		 * 
		 * //a[text()="Harry iKane"]//parent::td//parent::tr//*[@title="Edit"
		 * and @class="fa fa-edit"];
		 * 
		 * //a[text()="Harry Kane"]//..//..//descendant::td//a//i[@title="Edit"];
		 * 
		 * //a[text()="Harry Kane"]//ancestor::tr//i[@class="fa fa-edit"
		 * and @title="Edit"];
		 * 
		 * //a[text()="Harry Kane"]//..//..//descendant::td//i[@title="Edit"];
		 */
	}
}
