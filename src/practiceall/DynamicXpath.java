package practiceall;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpath {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "C:\\Appium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("lst-ib")).sendKeys("testing");
	
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role = 'listbox']//li/descendand::div[@class='sbqa_c']"));
		
		for (int i =0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("testing tools"));
			list.get(i).click();
			break;
		}
			
		
		
}
}


