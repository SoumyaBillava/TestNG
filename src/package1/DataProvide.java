package package1;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;


public class DataProvide {
	private static WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.out.println("Printing username"+n);
	  System.out.println("Printing password"+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "soumya.billava@sagarsoft.in", "India_123$" },
      new Object[] {"soumya.billava@sagarsoft.in", "India_123$"  },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.firefox.marionette","C:\\Users\\soumya.billava\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
