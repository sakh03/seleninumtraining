package OrangeHRM_Login;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logout_Senario {

		@Test
	public void test() throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver= new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver1= new FirefoxDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		//driver.quit();
		
		driver1.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver1.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver1.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver1.findElement(By.name("submit")).click();
        driver1.findElement(By.linkText("Dashboard")).isDisplayed();
        driver1.findElement(By.id("welcome")).click();
        Thread.sleep(2000);
        driver1.findElement(By.linkText("Logout")).click();        
		driver1.quit();
	}

}
