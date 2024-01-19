package seleniumPack;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverConditional {

	public static void main(String[] args) {
		WebDriver driver = null;
		String browserType = "Chrome";
		try {
			openBrowser(driver,browserType); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    public static void openBrowser(WebDriver driver,String browserType) throws Exception {
		switch(browserType) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		break;
		case "Edge":
			System.setProperty("webdriver.edge.driver", "C:\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		break;
		case "Safari":
			//System.setProperty("webdriver.safari.driver","C:\\safaridriver.exe");
			driver = new SafariDriver();
		break;
		case "InternetExplorer":
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		break;
		case "Opera":
			System.setProperty("webdriver.opera.driver", "C:\\operadriver.exe");
			driver = new OperaDriver();
		break;
		default :
			throw new Exception("Unsupported Browser :" +browserType);
	}
		URL(driver);
}
	
    public static void URL(WebDriver driver) {
    	//Open URL
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		//WebElements
		WebElement firstName=driver.findElement(By.name("firstname"));
		WebElement lastName=driver.findElement(By.name("lastname"));
		WebElement email=driver.findElement(By.name("reg_email__"));
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		List <WebElement> gender=driver.findElements(By.xpath("//input[@name='sex' and @type='radio']"));
		//Call sendKeys method
		sendKeys(driver,4,"Raj",firstName);
		sendKeys(driver,6,"Adhikari",lastName);
		sendKeys(driver,8,"raj123@gmail.com",email);
		sendKeys(driver,10,"123456",password);
		radioButton(driver,gender);
    }

    public static void sendKeys(WebDriver driver,int timeout,String value,WebElement element) {
    	new WebDriverWait(driver,timeout)
    	.until(ExpectedConditions.visibilityOf(element));
    	 element.sendKeys(value);
    }
   
    public static void radioButton(WebDriver driver,List<WebElement> gender) {
    	for(int i=0;i<gender.size();i++) {
    		WebElement mulGender=gender.get(i);
    		String genderName=mulGender.getAttribute("value");
    		if(genderName.equalsIgnoreCase("-1"))
    		    mulGender.click();
    	}
    }
}
