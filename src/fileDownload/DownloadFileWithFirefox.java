package fileDownload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFileWithFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckdriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Creating browser profile
		FirefoxProfile profile = new FirefoxProfile();
		//Set these two MIME types from https://www.sitepoint.com/mime-types-complete-list/
		profile.setPreference("browser.helperApps.neverAsk", "text/plain");
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver(option);
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
	}

}
