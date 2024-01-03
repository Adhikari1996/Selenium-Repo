package seleniumPack;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Initiate Driver
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    //Maximize Page
	    driver.manage().window().maximize();
	    //Implicit wait for 10 secs
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //Open the URL
	    driver.get("https://www.google.co.in/");
	    //Wait
	    Thread.sleep(5000);
	    //Capture link from a webpage
	    List <WebElement> getAllLinks=driver.findElements(By.tagName("a"));
	    //Number of links
	    System.out.println(getAllLinks.size());
	    for(int i=0;i<getAllLinks.size();i++) {
	    	WebElement element = getAllLinks.get(i);
	    	String href = element.getAttribute("href");
	    	URL url = new URL(href);
	    	HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
	    	//Wait time 2 sec
	    	Thread.sleep(2000);
	    	//Establish connection
	    	httpConnection.connect();
	    	int response=httpConnection.getResponseCode();
	    	String textRes = (response >= 400)? "Broken Link: " + href :  "Valid Link: " + href  ;
	    	 System.out.println(textRes); 
	    }
	    System.out.println();
	    System.out.println("All Links Checked"); 
	    // Closing The Driver 
	    driver.quit(); 
	}
}
