package Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeDriver {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Javasessions\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		String values = "anandummethala";
		clickElementByJS(email, driver, values);
		
		
		clickOn(driver, driver.findElement(By.xpath("//input[@id='email']")), 20 );
	}
		
		public static void clickElementByJS(WebElement element, WebDriver driver, String values){
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value', '"+values+"');", element);
		}

		
		
		
		public static void clickOn(WebDriver driver, WebElement locator, int Timeout) {
		
			new WebDriverWait(driver, Timeout)
		   .ignoring(StaleElementReferenceException.class)
		   .until(ExpectedConditions.visibilityOf(locator));
			locator.sendKeys("ssffbsfdsbfdsfm");
			
	}


}