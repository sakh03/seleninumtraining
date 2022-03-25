package OrangeHRM_Login;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_Login_Parameters_DataProvider extends Applicationtestdata {
    ChromeDriver driver;
	
    @Test(dataProvider="Login")
  public void login_valid (String uName ,String upass) throws InterruptedException
	{
	
		driver.findElement(By.name("txtUsername")).sendKeys(uName);
		driver.findElement(By.name("txtPassword")).sendKeys(upass);
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Dashboard")).isDisplayed();
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.id("btnLogin")).isDisplayed();

  }
   
    @BeforeTest
    public void LaunchBrowser()
  
  {
	WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
  }
  
	
	//public void closeBrowser()
	//{      
	//	driver.quit(); 
	//}
}
