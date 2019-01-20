package practiceall;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Javasessions\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://spstest.mckesson.com/BosentanUI/login.u");
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(int i =0; i<linklist.size(); i++) {
			
			System.out.println(linklist.get(i).getText());
			
		}

		
			driver.close();
	}

}
