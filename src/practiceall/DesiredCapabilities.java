package practiceall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DesiredCapabilities {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Javasessions\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		
		driver.get("https://www.google.com");
		

	}

}
