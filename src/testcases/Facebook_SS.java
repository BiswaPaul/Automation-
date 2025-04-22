package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_SS {
	@Test
	public void SS() throws IOException {
		//Open Chrome Browser
		
				WebDriver driver = new ChromeDriver();
				
				//Enter Url
				driver.get("https://www.facebook.com/login/");
				
				//Take Screenshot
				TakesScreenshot t=(TakesScreenshot)driver;
				
			 File src=t.getScreenshotAs(OutputType.FILE);
			 
			 File dest = new File("./Screen_Shot/facebookss.png");
			 
			 FileUtils.copyFile(src, dest);
			 
			 driver.close();
	}

}
