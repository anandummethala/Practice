package TestNGListenerConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	
	public static WebDriver driver;
	
     public static void initialization() { 
	System.setProperty("webdriver.gecko.driver", "C:\\Javasessions\\geckodriver-v0.20.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
}
     
     public void failed() {
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 		FileUtils.copyFile(src, new File("C:\\Users\\uanand\\eclipse-workspace\\Practice\\screenshots"));

     }

}
     
