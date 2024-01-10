package fileDownload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileWithChrome {

	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
			    driver.get("https://demo.automationtesting.in/FileDownload.html");
			    driver.manage().window().maximize();
			    //Generate the text files
			    driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Automation");
			    driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
			    driver.findElement(By.id("link-to-download")).click();
			    //Generate the pdf files
			    driver.findElement(By.id("pdfbox")).sendKeys("Automation PDF");
			    driver.findElement(By.id("createPdf")).click();
			    driver.findElement(By.id("pdf-link-to-download")).click();
			    
			    //driver.close();
	}

}
