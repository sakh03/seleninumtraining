package OrangeHRM_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_TestNG2_login_usingXPATH {
    FirefoxDriver driver1;
	@Test
  public void b_login () {
	
			System.out.println("Second method as per Alphabet");	
			
			driver1.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			driver1.findElement(By.name("txtUsername")).sendKeys("Admin");
	        driver1.findElement(By.name("txtPassword")).sendKeys("admin123");
	        driver1.findElement(By.name("submit")).click();
	        driver1.findElement(By.linkText("Dashboard")).isDisplayed();
	        

  }
  
  
	//WebDriverManager.firefoxdriver().setup();
	//FirefoxDriver driver1= new FirefoxDriver();
	
	
	
	public void a_logout()throws interupotedexception
	{
		System.out.println("Second method as per Alphabet");	
		driver1.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("btnLogin")).isDisplayed();        
		driver1.quit(); 
	}
}
