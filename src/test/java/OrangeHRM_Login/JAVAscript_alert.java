package OrangeHRM_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JAVAscript_alert 
{
	
	FirefoxDriver driver;
  @Test
  public void JS_alert() throws IntrruptedException()
    {
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
  }
  
  @BeforeTest
  public void LaunchBrowser() 
  {
  	// Download chromedriver at run time
  	// WebDriverManager.chromedriver().setup();
  	WebDriverManager.firefoxdriver().setup();
  	driver = new FirefoxDriver();
  	// ChromeDriver driver = new ChromeDriver();
  	driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
  }

  @AfterTest
  public void CloseBrowser() 
  {
  	driver.quit();
  }

  }

