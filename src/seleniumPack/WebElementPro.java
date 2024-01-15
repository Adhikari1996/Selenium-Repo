package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementPro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Register.html");
	    //maximize page
	    driver.manage().window().maximize();
	    //Name
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("Raj");
	    //Last Name
	    driver.findElement(By.xpath("html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("Adhikari");
	    //Address
	    driver.findElement(By.xpath("html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("Gurgaon");
	    //Email
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("user123@gmail.com");
	    //Phone
	    driver.findElement(By.xpath("html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys("9809123456");
	    //Gender
	    boolean male = driver.findElement(By.xpath("html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")).isSelected();
	    //boolean female = driver.findElement(By.xpath("html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input")).isSelected();
	    //System.out.println(male);
	    if(!male) 
	    	driver.findElement(By.xpath("html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")).click();	
	    else 
	    	driver.findElement(By.xpath("html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input")).click();
	    //Hobbies
	    driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
	    
	    //Select skills
	     Select skills =new Select(driver.findElement(By.id("Skills")));
	     System.out.println(skills.getOptions().size());
	     
	     skills.selectByIndex(6); //selected by index
	     //skills.selectByValue("Analytics");  //selected by values
	     //skills.selectByVisibleText("C++");    // selected by text
	     
	     //Link
         boolean link =driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/a[1]/span")).isDisplayed();
         System.out.println(link);
         
         if(link) {
        	 driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/a[1]/span")).click(); 
        	 //driver.navigate().back();
         }else {
        	 System.out.println("Linked not displyed"); 
         } 
	}
}
 