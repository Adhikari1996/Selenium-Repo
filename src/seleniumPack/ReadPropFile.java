package seleniumPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//Object repository in selenium webdriver.

public class ReadPropFile {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\RAJESH 1\\eclipse-workspace\\SeleniumBasic\\src\\seleniumPack\\config.properties");

		prop.load(fis);
		System.out.println(prop.getProperty("name"));

		System.out.println(prop.getProperty("age"));

		String URL = prop.getProperty("URL");
		System.out.println(URL);

		String browser = prop.getProperty("browser");
		System.out.println(browser);

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(URL);
	}
}
