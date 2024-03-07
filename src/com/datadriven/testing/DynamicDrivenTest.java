package com.datadriven.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DynamicDrivenTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\RAJESH 1\\eclipse-workspace\\SeleniumBasic\\src\\com\\testdata\\freeCrmTestData.xlsx");
		int rowCount = reader.getRowCount("testdata");
		reader.addColumn("testdata", "status");

		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
			String firstName = reader.getCellData("testdata", "firstname", rowNum);
			System.out.println(firstName);

			String lastName = reader.getCellData("testdata", "lastname", rowNum);
			System.out.println(lastName);

			String email = reader.getCellData("testdata", "email", rowNum);
			System.out.println(email);

			String confirmEmail = reader.getCellData("testdata", "confirmemail", rowNum);
			System.out.println(confirmEmail);

			String username = reader.getCellData("testdata", "username", rowNum);
			System.out.println(username);

			String password = reader.getCellData("testdata", "password", rowNum);
			System.out.println(password);

			String confirmPasword = reader.getCellData("testdata", "confirmpasword", rowNum);
			System.out.println(confirmPasword);

			//Entering values
			driver.findElement(By.name("first_name")).clear();
			driver.findElement(By.name("first_name")).sendKeys(firstName);
			
			driver.findElement(By.name("surname")).clear();
			driver.findElement(By.name("surname")).sendKeys(lastName);
			
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(email);
			
			driver.findElement(By.name("email_confirm")).clear();
			driver.findElement(By.name("email_confirm")).sendKeys(confirmEmail);
			
			driver.findElement(By.name("surname")).clear();
			driver.findElement(By.name("surname")).sendKeys(username);
			
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(password);
			
			driver.findElement(By.name("passwordconfirm")).clear();
			driver.findElement(By.name("passwordconfirm")).sendKeys(confirmPasword);
			
			//driver.findElement(By.name("agreeTerms")).click();
			
			//write the data into cells.
			reader.setCellData("testdata", "status", rowNum, "Pass");
		}

	}

}
