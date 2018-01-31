package package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Simple {
	
	private static WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.gmail.com");
		 
      driver.findElement(By.id("Email")).sendKeys("soumya.billava@sagarsoft.in");
 
      driver.findElement(By.id("next")).click();
      
      driver.findElement(By.id("Passwd")).sendKeys("India_123$");
 
      driver.findElement(By.id("signIn")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.firefox.marionette","C:\\Users\\soumya.billava\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
