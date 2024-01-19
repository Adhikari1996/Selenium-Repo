package seleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlternativeWayOfSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
       
//Below are 5 different methods that can be used to select value in dropdown in Selenium without-- 
	    //--using Select Class
	    
//============>Method-1.By storing all the options in List and iterating through it.<=============
	    
	    driver.get("https://www.bstackdemo.com/");
	    driver.manage().window().maximize();
	    //driver.findElement(By.xpath("//select")).click();
	    //List <WebElement> listOfValue=driver.findElements(By.cssSelector("select option"));
	    //Iterate List through for loop
	    String expectedValue = "Highest to lowest";
	    
	    //Iterate using for loop
	  /*  for(int i=0;i<listOfValue.size();i++) {
	    	if(listOfValue.get(i).getText().contains(expectedValue)) {
	    		 listOfValue.get(i).click();
		    	 System.out.println("Test Case passed");
		    	 break;
	    	}  
	    }*/
	     
	    //Iterate using for each loop
	   /* for(WebElement value : listOfValue ) {
	    	if(value.getText().contains(expectedValue))
	    		value.click();
	    	System.out.println("Test Case passed");
	    	break;
	    }*/
	    
	  //============>Method-2.By creating Custom Locator and without iterating the List.<=============
	    
		    /*WebElement dropdown=driver.findElement(By.xpath("//select/option[contains(text(),'"+expectedValue+"')]"));
		    dropdown.click();*/
	    
	  //============>Method-3.By using JavaScriptExecutor class.<=============  
		    WebElement selectValues=driver.findElement(By.xpath("//select"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].value='highestprice'", selectValues);
	    
	    
	  //============>Method 4: By using sendKeys method<=============  
	    	// driver.findElement(By.xpath("//select")).sendKeys("Highest to lowest");
	    
	  //pause//============>Method 5: By using Actions Class<=============  
	    
	    	/*WebElement dd = driver.findElement(By.xpath("//span[@class='nav_item_name' and contains(text(), 'Developers')]"));

	    	Actions action=new Actions(driver);

	    	action.moveToElement(dd).perform();*/
	}
}
