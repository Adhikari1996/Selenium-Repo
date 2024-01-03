package fileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
public class DownloadZIPFilesForFirefox {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckdriver.exe");  
	//Creating browser profile
	FirefoxProfile profile = new FirefoxProfile();
	//Set these two MIME types from https://www.sitepoint.com/mime-types-complete-list/
	profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/Zip");
	profile.setPreference("browser.download.manager.showWhenStarting", false);
	
	FirefoxOptions option = new FirefoxOptions();
	option.setProfile(profile);
	
	WebDriver driver = new FirefoxDriver(option);
	driver.get("https://testingmasters.com/student-corner/downloads");
	Thread.sleep(4000);
	driver.findElement(By.xpath("")).click();
	}
}
