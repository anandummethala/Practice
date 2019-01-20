package practiceall;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "C:\\Appium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Pass')]")).sendKeys("anandummethala");
		//driver.findElement(By.xpath("//input[@class='']")).sendKeys("anandummethala");
		//driver.findElement(By.xpath("//input[contains(@class,'form-')]")).sendKeys("anandummethala");
		//driver.findElement(By.xpath("//input[ends-with(@placeholder,'name')]")).sendKeys("gitmech");
    
		//driver.findElement(By.xpath("//input[@class='form-control' and @placeholder='Username']")).sendKeys("anandummethala");
		
		//for links:
		
		driver.findElement(By.xpath("//a[contains(text(), 'Gmail')]")).click();
		
		
		
	}

}
