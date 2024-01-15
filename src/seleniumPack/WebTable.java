package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.w3schools.com/html/html_tables.asp");
         
         int sizeOfRows=driver.findElements(By.xpath("html/body/div[5]/div[1]/div[1]/div[3]/div/table/tbody/tr")).size();
         System.out.println(sizeOfRows);
         
         int sizeOfColumns=driver.findElements(By.xpath("html/body/div[5]/div[1]/div[1]/div[3]/div/table/tbody/tr/th")).size();
         System.out.println(sizeOfColumns);
         
         for(int i=2;i<=sizeOfRows;i++) {
        	 for(int j=1;j<=sizeOfColumns;j++) {
        		String tableD = driver.findElement(By.xpath("html/body/div[5]/div[1]/div[1]/div[3]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText()+ " ";
        		System.out.print(tableD);
        	 }
        	 System.out.println();
         }
         driver.close();
	}
}
