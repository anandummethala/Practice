package Javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HashMapConceptEx {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Appium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String credentials = Data.getuserinfo().get("credentials1");
		String Info[] = credentials.split("_");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Info[0]);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Info[1]);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

}
