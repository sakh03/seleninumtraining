package OrangeHRM_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_navigatecommandexp 
{
    FirefoxDriver driver;
	@Test
  public void  verify_navigation_command () throws InterruptedException
	{
	driver.findElement(By.linkText("Welcome to HDFC Bank NetBanking")).click();
	Thread.sleep(5000);
	String FYPActLink=driver.getCurrentUrl();
	String ExpLink="https://netbanking.hdfcbank.com/netbanking/";
	Assert.assertEquals(FYPActLink, ExpLink);
	driver.navigate().back();
	Thread.sleep(5000);
	//Verify user back to Login Page
	String LoginActLink =driver.getCurrentUrl();
	String LoginExpLink="https://netbanking.hdfcbank.com/netbanking/";
	Assert.assertEquals(LoginActLink, LoginExpLink);
	//Verify that user navigated back to login page
	driver.navigate().forward();
	Thread.sleep(5000);
	String FYPActLinkBack =driver.getCurrentUrl();
	String ExpLinkBack="https://netbanking.hdfcbank.com/netbanking/";
	Assert.assertEquals(FYPActLinkBack, ExpLinkBack);

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
