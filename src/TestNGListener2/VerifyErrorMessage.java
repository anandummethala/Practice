package TestNGListener2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorMessage {
	
	String actualmessage;
	
	String expectedmessage = "Please enter your first name";
	
	

	
	@Test
	
	public void Test() {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_lib\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.id("registration-submit")).click();
		
		
		actualmessage = driver.findElement(By.cssSelector(".alert-content")).getText();
		
		
		
		try {
			Assert.assertEquals(actualmessage, expectedmessage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
		
		System.out.println("Test Passed");
		
		}
		driver.quit();
		
	}
	
}
