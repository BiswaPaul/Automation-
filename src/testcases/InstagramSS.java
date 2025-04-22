package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InstagramSS {
@Test
	public void SS() throws IOException{
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	
	TakesScreenshot t=(TakesScreenshot)driver;
	
	File  src=t.getScreenshotAs(OutputType.FILE);
	
	File dest= new File("./Screen_Shot/InstagramSS.png");
	
	FileUtils.copyFile(src, dest);
	
	driver.close();
	
	
	
	
		
	}
}
