package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screen_Shot {
	
	
@Test
public void SS() throws IOException {
		//Open Chrome Browser
		
		WebDriver driver = new ChromeDriver();
		
		//Enter Url
		driver.get("https://www.facebook.com/login/");
		
		//Take Screenshot
		TakesScreenshot t=(TakesScreenshot)driver;
		
	 File src=t.getScreenshotAs(OutputType.FILE);
	 
	 File dest = new File("./Screen_Shot/s.png");
	 
	 FileUtils.copyFile(src, dest);
	 
	 
	 
	 //new ChromeTab open for makemytrip
	 driver.switchTo().newWindow(WindowType.TAB);
	 
	 driver.get("https://www.makemytrip.com/");
	 
 File src1=t.getScreenshotAs(OutputType.FILE);
	 
	 File dest1 = new File("./Screen_Shot/s1.png");
	 
	 FileUtils.copyFile(src1, dest1);
	 
	 //new Chrome tab open for instagram
	 driver.switchTo().newWindow(WindowType.TAB);
	 
	 driver.get("https://www.instagram.com/");
	 
File src2=t.getScreenshotAs(OutputType.FILE);
	 
	 File dest2 = new File("./Screen_Shot/s2.png");
	 
	 FileUtils.copyFile(src2, dest2);
	 
	 
	 //New Chrome tab open for gibl.in bike insurance
	 
	 driver.switchTo().newWindow(WindowType.TAB);
	 
	 driver.get("https://www.gibl.in/two-wheeler-insurance/");
	 
File src3=t.getScreenshotAs(OutputType.FILE);
	 
	 File dest3 = new File("./Screen_Shot/s3.png");
	 
	 FileUtils.copyFile(src3, dest3);
	 
	 
	 //new Chrome tab open for ginteja.com car insurance
	 driver.switchTo().newWindow(WindowType.TAB);
	 
	 driver.get("https://www.gintejainsurance.com/car-insurance");
	 
File src4=t.getScreenshotAs(OutputType.FILE);
	 
	 File dest4 = new File("./Screen_Shot/s4.png");
	 
	 FileUtils.copyFile(src4, dest4);
	 
	 
	 driver.quit();
		
		
	
}

}
