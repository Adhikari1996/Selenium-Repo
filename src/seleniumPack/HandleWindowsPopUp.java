package seleniumPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowsPopUp {

	public static void main(String[] args) throws InterruptedException {

		// 1.Javascript popup(alert)
		// 2.BrowserWindows popup/advertisement popup(getWindowHandles)
		// 3.FileUpload popup(using sendKeys)

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Thread.sleep(2000);
		// Store windowID into Set
		Set<String> Windows = driver.getWindowHandles();
		// Iterator to windows
		Iterator<String> iterator = Windows.iterator();

		// find to id of parent windowID
		String parentWindowID = iterator.next();
		System.out.println("parentWindowID :" + parentWindowID);

		// find to id of child windowID
		String childWindowID = iterator.next();
		System.out.println("childWindowID :" + childWindowID);

		driver.switchTo().window(parentWindowID);
		Thread.sleep(2000);
		System.out.println("Parent window URL :" + driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(childWindowID);
		Thread.sleep(2000);
		System.out.println("Child window URL :" + driver.getCurrentUrl());
		driver.close();

	}
}
