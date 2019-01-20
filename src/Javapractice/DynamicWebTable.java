package Javapractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Appium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.freecrm.com/");

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("anandummethala");
		driver.findElement(By.name("password")).sendKeys("gitmech");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();

		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
		
		//  /html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[4]/td[2]/a
		
		driver.findElement(By.xpath("//a[contains(text(), 'Great Greater')]/parent::td//preceding-sibling::td//input[@name = 'contact_id']")).click();
	
		
	}

}
