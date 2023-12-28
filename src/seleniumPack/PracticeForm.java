package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
      driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("Rajesh");
      driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("Adhikari");
      driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("9205618013");
      driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("India");
      driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("Gurgaon");
      driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("user123@gmail.com");
      driver.findElement(By.xpath("//LABEL[@for='RESULT_RadioButton-7_0'][text()='Male']")).click();
      driver.findElement(By.xpath("//LABEL[@for='RESULT_CheckBox-8_4'][text()='Thursday']")).click();
      Select select = new Select(driver.findElement(By.id("RESULT_RadioButton-9")));
      select.selectByVisibleText("Evening");
	}
}
