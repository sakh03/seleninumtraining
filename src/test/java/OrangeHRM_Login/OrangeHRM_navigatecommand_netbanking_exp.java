package OrangeHRM_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_navigatecommand_netbanking_exp 
{
    FirefoxDriver driver;
	@Test
  public void  verify_navigation_command () throws InterruptedException
	{
		
	driver.switchTo().frame("login_page");
	driver.findElement(By.xpath("//a[normalize-space()='CONTINUE']")).sendKeys("Admin");


    }

@BeforeTest
public void LaunchBrowser() 
{
	// Download chromedriver at run time
	// WebDriverManager.chromedriver().setup();
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	// ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
}

@AfterTest
public void CloseBrowser() 
{
	driver.quit();
}

}
