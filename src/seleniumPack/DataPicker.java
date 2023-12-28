package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Datepicker.html");
	    driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img")).click();
    	
	    for(int i=6;i>=1;i--) {
	    	 String month = driver.findElement(By.xpath("/html/body/div[1]/div/div/span[1]")).getText();
	    	 System.out.println(month);
		    if(month.equals("August")) {
		    	driver.findElement(By.linkText("26")).click();
		    	break;
		    }else {
		    	driver.findElement(By.xpath("/html/body/div[1]/div/a[1]/span")).click();
		    }
	    }
	           
	}

}
