package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
     
    System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.automationtesting.in/Windows.html");
    driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
    //--Browser Commands--
    driver.close(); // close current window at a time.close one windows which opened currently.
  //driver.quit();  // close all the window at a time.close all those windows which opened currently.
	} 
}
