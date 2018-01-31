package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import org.testng.Assert;

@Test(groups= "classgroup")
public class Assertion {
	
	private static WebDriver driver;
  @Test(priority =0,groups= "methodgroup1")
  public void openGmail() {
	  System.setProperty("webdriver.firefox.marionette","C:\\Users\\soumya.billava\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.get("https://www.gmail.com");       
  }
  
  @Test(priority =1,groups= "methodgroup1")
  public void login() {
	 
      driver.findElement(By.id("Email")).sendKeys("soumya.billava@sagarsoft.in");
 
      driver.findElement(By.id("next")).click();
      
      driver.findElement(By.id("Passwd")).sendKeys("India_123$");
 
      driver.findElement(By.id("signIn")).click();
	  
  }
  
  @Test(priority =3)
  public void validation() throws InterruptedException {
	  
	  Thread.sleep(1000);
	 
	 // Assert.assertEquals("https://mail.google.com/mail/u/0/#inbo", driver.getCurrentUrl());
	  
	 SoftAssert softAssertion= new SoftAssert();
	  softAssertion.assertEquals("https://mail.google.com/mail/u/0/#inbo", driver.getCurrentUrl());
		 
  }
  
  @Test(priority =2,groups= "methodgroup1")
  public void ending() throws InterruptedException {
	  System.out.println("End of the Class");
	   }
  
}
