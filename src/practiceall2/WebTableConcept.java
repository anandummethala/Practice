package practiceall2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableConcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Appium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int i=2; i<=7; i++) {
			
			String actualxpath = beforeXpath + i+  afterXpath;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
		
		}

	}

}


