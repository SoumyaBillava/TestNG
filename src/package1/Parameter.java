package package1;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterSuite;

public class Parameter {
	private static WebDriver driver;
	
	
  @Test
  @Parameters({"sUsername","sPassword"})
  public void f(String sUsername, String sPassword) {
	 			 
	      driver.get("https://www.gmail.com");
	 
	      driver.findElement(By.id("Email")).sendKeys(sUsername);
	 
	      driver.findElement(By.id("next")).click();
	      
	      driver.findElement(By.id("Passwd")).sendKeys(sPassword);
	 
	      driver.findElement(By.id("signIn")).click();
	 
	    	 
	  }
  
  @BeforeSuite
  public void beforeSuite() {
	 
	  System.setProperty("webdriver.firefox.marionette","C:\\Users\\soumya.billava\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
