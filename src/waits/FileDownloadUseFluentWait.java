package waits;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FileDownloadUseFluentWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://addons.mozilla.org/en-GB/firefox/addon/selenium-ide/versions/");
		driver.findElement(By.linkText("Download file")).click();
		
		String downloadPath = "C:\\Users\\RAJESH 1\\Downloads";
		String nameofFile = "selenium_ide-3.17.4.xpi";
		
		File file = new File(downloadPath,nameofFile);
		
		FluentWait<File> wait = new FluentWait<File>(file)
				.withTimeout(Duration.ofMinutes(2))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(Exception.class)
				.withMessage("File is not downloaded");
		
		//<-----------download file simple on minute timeout duration & polling second duration time---------->
		
		//		boolean downloaded=wait.until(f -> f.exists() && f.canRead());
		//		String result = (downloaded) ? "File downloaded completed 100%":"File not downloaded completely";
		//		System.out.println(result);
		
		//<-----------Execeptions using try & catch---------->
					//.withTimeout(Duration.ofSeconds(2))
					//.pollingEvery(Duration.ofMillis(10))
					//Change duration of timeout to second and polling time to mills as well.
					//If get exceptions then used try ,catch.
		try {
			boolean downloaded=wait.until(f -> f.exists() && f.canRead());
			if(downloaded)
				System.out.println(".......File downloaded completed 100%.......");
		}catch(TimeoutException e) {
				System.out.println(".......File not downloaded completely..........");	
		}
	}

}
