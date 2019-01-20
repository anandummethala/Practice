package Javapractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Appium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.makemytrip.com/");

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Actions actions = new Actions(driver);
		
		/*actions.moveToElement(driver.findElement(By.xpath("//ul[@id = 'ui-id-1']"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@aria-label = 'Top Cities : Hyderabad, India']")).click();
		
		actions.moveToElement(driver.findElement(By.xpath("//ul[@id = 'ui-id-2']"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@aria-label = 'Top Cities : Chennai, India']")).click();
		*/
		
		
		WebElement countryUL= driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']"));
		/*List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
		for (WebElement li : countriesList) {
		if (li.getText().equals("Chennai")) {
		     li.click();
		     
		     
		     
		     }
		     }
		     */
		
		
		Actions actions = new Actions(driver);
		
	    actions.moveToElement(countryUL).build().perform();
	    
	    driver.findElement(By.xpath("//li[@aria-label = 'Top Cities : Chennai, India']")).click();
			
		   }
		
		
	}


