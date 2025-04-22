import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException  {
		//open chrome browser
	 WebDriver driver=new ChromeDriver(); 
	 //enter fb account create url
	 driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
	 Thread.sleep(2000);
	 //Enter First Name
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Biswa");
	 Thread.sleep(2000); 
	 //enter last name
	 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Paul");
	 
     WebElement Date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
     Select s =new Select(Date);
     s.selectByIndex(8);
     
     WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
     Select s1=new Select(Month);
     s1.selectByIndex(7);
     
     WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
     Select s2=new Select(Year);
     s2.selectByVisibleText("1997");
     
     driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
     
     driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("1234567890");
     
     driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("abcdef1234");
     
     
     driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
     driver.quit();
	}
}
