package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
//	     WebElement userName = driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
//	     userName.sendKeys("rajesh");
//	     WebElement pass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//	     pass.sendKeys("adhikari");
//       
	     driver.findElement(By.linkText("Software Testing Tutorials")).click();
	}

}
