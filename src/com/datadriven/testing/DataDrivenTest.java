package com.datadriven.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\RAJESH 1\\eclipse-workspace\\SeleniumBasic\\src\\com\\testdata\\freeCrmTestData.xlsx");
		System.out.println("file name " +reader);
		
		String firstName=reader.getCellData("testdata", "firstname", 2);
		System.out.println(firstName);
		
		String lastName=reader.getCellData("testdata", "lastname", 2);
		System.out.println(lastName);
		
		String email=reader.getCellData("testdata", "email", 2);
		System.out.println(email);
		
		String confirmEmail=reader.getCellData("testdata", "confirmemail", 2);
		System.out.println(confirmEmail);
		
		String username=reader.getCellData("testdata", "username", 2);
		System.out.println(username);
		
		String password=reader.getCellData("testdata", "password", 2);
		System.out.println(password);
		
		String confirmPasword=reader.getCellData("testdata", "confirmpasword", 2);
		System.out.println(confirmPasword);
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.name("first_name")).sendKeys(firstName);
		driver.findElement(By.name("surname")).sendKeys(lastName);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("email_confirm")).sendKeys(confirmEmail);
		driver.findElement(By.name("surname")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("passwordconfirm")).sendKeys(confirmPasword);
		driver.findElement(By.name("agreeTerms")).click();
	}

}

