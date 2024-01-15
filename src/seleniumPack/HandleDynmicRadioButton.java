package seleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynmicRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//         <----RadioButton--->
//	    List<WebElement> multiRadio= driver.findElements(By.xpath("//input[@name='radioButton' and @type='radio']"));
//        for(int i=0;i<multiRadio.size();i++) {
//        	WebElement radio =multiRadio.get(i);
//        	String value =radio.getAttribute("value");
//        	if(value.equalsIgnoreCase("radio3"))
//        		radio.click();
//        	System.out.println(value);
//        }
		
        // <----CheckBox---->
//		List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
//		for(int i=0;i<checkboxes.size();i++) {
//			WebElement checkbox =checkboxes.get(i);
//			String value =checkbox.getAttribute("value");
//			if(value.equalsIgnoreCase("option2"))
//				checkbox.click();
//		}
       
		//<----File upload using sendkeys method---> 
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("C:\\Users\\RAJESH 1\\Downloads\\Aadhar.jpg");
		
		//<---Upload file through our project---->
//		String files =System.getProperty("user.dir");
//		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys(files+"\\files\\Aadhar.jpg");
		
	}

}
