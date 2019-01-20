package practiceall;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenElements {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Javasessions\\geckodriver-v0.20.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	
	    driver.manage().window().maximize();
	    
	   /* int x = driver.findElement(By.xpath("//*[@id='male']")).getLocation().getX();
	    int y = driver.findElement(By.xpath("//*[@id='male']")).getLocation().getY();
	    
	    System.out.println(x);
	    System.out.println(y);*/
	    
	    
	    List<WebElement> radio = driver.findElements(By.id("male"));
	    
	    int count = radio.size();
	    System.out.println("Total radio buttons are " + count);
	    
	    
	    for(int i=0;i<count; i++) {
	    	
	    	
	    	int x = radio.get(i).getLocation().getX();
	    	
	    	if (x!=0) {
	    		
	    		radio.get(i).click();
	    		break;
	    	}
	    	
	    }
	    
	}

}
