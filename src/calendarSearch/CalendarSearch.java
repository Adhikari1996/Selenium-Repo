package calendarSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("rajadhikari");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Raj@12345");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.xpath("//a[text()=\"Calendar\"]")).click();

		Thread.sleep(3000);

		String date = "31-December-2024";
		String[] arrDate = date.split("-");

		String day = arrDate[0];
		String month = arrDate[1];
		String year = arrDate[2];

		Select selectMonth = new Select(driver.findElement(By.xpath("//select[@name=\"slctMonth\"]")));
		selectMonth.selectByVisibleText(month);

		Select selectYear = new Select(driver.findElement(By.xpath("//select[@name=\"slctYear\"]")));
		selectYear.selectByVisibleText(year);

		// *[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1];
		// *[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2];

		String beforeRowXpath = "//*[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterRowXpath = "]/td[";

		final int totalWeekDays = 7;
		final int totalRow = 7;
		boolean flag = false;
		String dayNum = null;

		for (int rowNum = 2; rowNum <= totalRow; rowNum++) {
			for (int colNum = 1; colNum <= totalWeekDays; colNum++) {
				try {
					dayNum = driver.findElement(By.xpath(beforeRowXpath + rowNum + afterRowXpath + colNum + "]"))
							.getText();
					System.out.println(dayNum);
				} catch (Exception e) {
					System.out.println("....Please enter the correct date value....");
					flag = true;
					break;
				}
				if (day.equals(dayNum)) {
					driver.findElement(By.xpath(beforeRowXpath + rowNum + afterRowXpath + colNum + "]")).click();
					flag = true;
					break;
				}
			}
			if (flag)
				break;
		}
	}
}
