package seleniumPack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownBoxSorted {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
	    
	    Select option = new Select(driver.findElement(By.id("RESULT_RadioButton-9")));
	    
	    List<WebElement> allOptions = option.getOptions();
	    
	    List originalOptions = new ArrayList();
	    List tempOptions = new ArrayList(); 
	    
	    for(WebElement op : allOptions) {
	    	originalOptions.add(op.getText());
	    	tempOptions.add(op.getText());
	    }
	    
	    System.out.println("Before OriginalOptions " +originalOptions);
	    System.out.println("Before TempOriginal" +tempOptions);
	    
	    Collections.sort(originalOptions);
	    
	    System.out.println("After OriginalOptions " +originalOptions);
	    System.out.println("After TempOriginal " +tempOptions);
	    
	    String resultSet = (originalOptions==tempOptions)? "...Options are sorted... " : "...Options are not sorted...";
	    System.out.println(resultSet); 
	}

}
