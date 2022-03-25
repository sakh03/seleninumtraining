package OrangeHRM_Login;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgetYour_password {

	@Test
	public void forgetyourpassword() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver1= new FirefoxDriver();
		driver1.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver1.findElement(By.linkText("Forgot your password?")).click();
		driver1.findElement(By.id("btnSearchValues")).isDisplayed();
		driver1.quit();
		
	}

}
