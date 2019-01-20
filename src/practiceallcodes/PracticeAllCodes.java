package practiceallcodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PracticeAllCodes {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_lib\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		/*//1. Alert:
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//2. Handling Dropdown:
		
		Select select = new Select(driver.findElement(By.linkText("")));
		select.selectByVisibleText("");
		
		
		
		//3. Navigate:
		
		driver.navigate().to("url");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		
		
		//4. Mouse Movements: Actions
		
		Actions actions = new Actions(driver);
		//actions.doubleClick();
		//actions.moveToElement(driver.findElement(By.linkText(""))).build().perform();
		//driver.findElement(By.id("")).click();
		//actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		//actions.clickAndHold(driver.findElement(By.id(""))).moveToElement(driver.findElement(By.id(""))).release().build().perform();
		
		
		//5. FindElements:
		
		List<WebElement> lists = driver.findElements(By.tagName("a"));

		System.out.println(lists.size());
		
		for(int i=0; i<lists.size(); i++) {
			
			System.out.println(lists.get(i).getText());*/
			
		
			
			
	   //6. Screenshot:
			
			/*File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File(""));*/
		
		
		//7. Handling Window Popup:
		
		/*Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentwindowId = it.next();
		String childwindowId = it.next();
		driver.switchTo().window(childwindowId);
		driver.close();
		driver.switchTo().window(parentwindowId);*/
		
		
		//8. Prop:
		
		/*Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("");
		prop.load(ip);*/
		
		
		//9. JS Executor:
		
		
		WebElement loginbtn = driver.findElement(By.id(""));
		
		clickon(loginbtn, driver);
	
	
	}
		
		
	public static void clickon(WebElement element, WebDriver driver) {
		
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("argument[0].click;", element);
		
	}
		
			
	    	
	    	
	    	
	   /* 	//10. Explicit Wait:
		
		ClickOn(driver, driver.findElement(By.id("")), 25);
		
	}
		
		public static void ClickOn(WebDriver driver, WebElement locator, int timeout) {
			
			
			new WebDriverWait(driver, timeout)
			.ignoring(StaleElementReferenceException.class)
			.until(ExpectedConditions.visibilityOf(locator));
			locator.click();
			
			
			
			
		}*/
		
	    	
		}
		
		
		
		
	



