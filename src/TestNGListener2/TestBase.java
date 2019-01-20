package TestNGListener2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class TestBase {

	public static WebDriver driver;

	@Test
public void initialization() {
	

	
	System.setProperty("webdriver.gecko.driver", "C:\\Javasessions\\geckodriver-v0.20.0-win64\\geckodriver.exe");
	driver.get("https://spstest.mckesson.com/BosentanUI/login.u");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("fsfsfffs");
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("fsfsfffs");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
	
public void failed(String testMethod) throws IOException {

File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("C:\\Users\\uanand\\eclipse-workspace\\Practice\\screenshot"+testMethod+".png"));



}
}
