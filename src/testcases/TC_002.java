package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_002 {
	public static void main(String[] args) throws InterruptedException {
		
		//1. Launch browser(Chrome)
		WebDriver driver = new ChromeDriver();
		
        //2. Navigate to url 'http://automationexercise.com'
		
		driver.get("http://automationexercise.com");
		
		//3. Verify that home page is visible successfully
		
		Boolean Logo = driver.findElement(By.xpath("//img[@src=\"/static/images/home/logo.png\"]")).isDisplayed();
		
		if(Logo==true) {
			System.out.println("Home page is visible");
		}
		else {
			System.out.println("Home page is Not visible");
		}
		
		//4. Click on 'Signup / Login' button
		 driver.findElement(By.xpath("//i[@class=\"fa fa-lock\"]")).click();
		
		 
		 //5. Verify 'Login to your account' is visible
		 
		 
		 Boolean Logo1 = driver.findElement(By.xpath("//h2[text()='Login to your account']")).isDisplayed();
		 
		 if(Logo1==true) {
			 System.out.println("'Login to your account' is visible");
		 }
			 
			 else {
				 System.out.println("'Login to your account' is NOT visible");
			 }
		 
        //6. Enter correct email address and password
		 
		 //email address
		 driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("Bisu@gmail.com");
		 //password
		 driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("Bisu12345");
	
     Thread.sleep(10000);
     
     
     //7. Click 'login' button
     
     driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
     
     
     //8. Verify that 'Logged in as username' is visible
     
     Boolean Logo3=driver.findElement(By.xpath("//i[@class=\"fa fa-user\"]")).isDisplayed();
     
     if (Logo3==true) {
    	 System.out.println("Logged in as username' is visible");
     }
     else {
    	 System.out.println("Logged in as username' is NOt visible");
    	 
     }
     
     //9. Click 'Delete Account' button
     
     driver.findElement(By.xpath("//i[@class=\"fa fa-trash-o\"]")).click();
     
     Thread.sleep(10000);
     
     //10. Verify that 'ACCOUNT DELETED!' is visible
     
     
     Boolean Logo4=driver.findElement(By.xpath("//b[text()='Account Deleted!']")).isDisplayed();
     
     if (Logo4==true) {
    	 System.out.println("'ACCOUNT DELETED!' is visible");
    	 
     }
     
     else {
    	 System.out.println("'ACCOUNT DELETED!' is visible");
     }
     
     
	}
	
}
