package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_001 {
	public static void main(String[] args) throws InterruptedException {
		//1.Open Chrome Browser
		WebDriver driver= new ChromeDriver();
		//2.Enter Url
		driver.get("http://automationexercise.com/");
        //3.Verify that home page is visible successfully
		 Boolean logo = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']")).isDisplayed();
		if(logo==true) {
			System.out.println("Home page is visible");
		}
		else {
			System.out.println("Home page is not visible");
		}
		
		//4.Click on 'Signup / Login' button
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		
		//5.Verify 'New User Signup!' is visible
		
		Boolean logo1=driver.findElement(By.xpath("//h2[text()='New User Signup!']")).isDisplayed();
		if (logo1==true) {
			System.out.println(" 'New User Signup!' is visible ");
		}
		else {
			System.out.println("'New User Signup!' is NOT visible");
		}
		
		//6.Enter name and email address
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("vi1shnu123");
		driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("Bisu@gmail.com");
		
		Thread.sleep(3000);
		//7.Click 'Signup' button
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//button[@class=\"btn btn-default\"])[2]")).click();
	
	//8.Verify that 'ENTER ACCOUNT INFORMATION' is visible
		Thread.sleep(3000);
		Boolean logo2=driver.findElement(By.xpath("//b[text()='Enter Account Information']")).isDisplayed();
		if(logo2==true) {
			System.out.println("'ENTER ACCOUNT INFORMATION' is visible");
		}
		else {
			System.out.println("'ENTER ACCOUNT INFORMATION' is NOT visible");
		}
		
		//Fill details: Title, Name, Email, Password, Date of birth

		driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Bisu12345");
		Thread.sleep(2000);
		//day
		 WebElement Date=driver.findElement(By.xpath("//select[@id=\"days\"]"));
	     Select s =new Select(Date);
	     s.selectByIndex(9);
	     
	     //month
	     WebElement Month=driver.findElement(By.xpath("//select[@id=\"months\"]"));
	     Select s1 =new Select(Month);
	     s1.selectByIndex(8);
	     
	     //year
	     WebElement Year=driver.findElement(By.xpath("//select[@id=\"years\"]"));
	     Select s2=new Select(Year);
	     s2.selectByVisibleText("1997");
Thread.sleep(2000);
//Select checkbox 'Sign up for our newsletter!'
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.xpath("//input[@name=\"newsletter\"]")).click();
Thread.sleep(2000);

//11. Select checkbox 'Receive special offers from our partners!'
driver.findElement(By.xpath("//input[@name=\"optin\"]")).click();
Thread.sleep(2000);


//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
driver.findElement(By.xpath("//input[@data-qa=\"first_name\"]")).sendKeys("VISWADEEP");
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@data-qa=\"last_name\"]")).sendKeys("PAUL");
Thread.sleep(1000);


driver.findElement(By.xpath("//input[@data-qa=\"company\"]")).sendKeys("WEbskitters");
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@id=\"address1\"]")).sendKeys("kolkata");
Thread.sleep(1000);


driver.findElement(By.xpath("//input[@id=\"address2\"]")).sendKeys("kolkata 2");
Thread.sleep(1000);

WebElement Country=driver.findElement(By.xpath("//select[@id=\"years\"]"));
Select s3=new Select(Country); 
s3.selectByIndex(1);


driver.findElement(By.xpath("//input[@data-qa=\"state\"]")).sendKeys("West Bengal");


driver.findElement(By.xpath("//input[@data-qa=\"city\"]")).sendKeys("Kolkata");

driver.findElement(By.xpath("//input[@data-qa=\"zipcode\"]")).sendKeys("123456");

driver.findElement(By.xpath("//input[@data-qa=\"mobile_number\"]")).sendKeys("1234567890");
Thread.sleep(10000);
driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();


//14. Verify that 'ACCOUNT CREATED!' is visible

Thread.sleep(3000);
Boolean logo3=driver.findElement(By.xpath("//b[text()='Account Created!']")).isDisplayed();
if(logo3==true) {
	System.out.println("'ACCOUNT CREATED!' is visible");
	}
else {
	System.out.println("'ACCOUNT CREATED!' is Not visible");
}
	
Thread.sleep(2000);


driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]")).click();

	
	}
}
