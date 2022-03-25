package OrangeHRM_Login;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spree_gettitle_getcurrentlurl {
	// Global Declaration
		ChromeDriver driver;

		@Test
		public void Login_Valid_Scenario() throws InterruptedException {

			driver.findElement(By.xpath("//button[@id='account-button']//*[name()='svg']")).click();
			driver.findElement(By.linkText("LOGIN")).click();
			Thread.sleep(5000);
			String acturl = driver.getCurrentUrl();
			String acttitle = driver.getTitle();
			String Exptitle = "Login - Spree Demo Site";
			String Expurl= "https://demo.spreecommerce.org/login";
			Assert.assertEquals(acturl, Expurl);
			Assert.assertEquals(acttitle, Exptitle);
			//Grab the text and verify with Expected Result
			
			String ActText = driver.findElement(By.xpath("//h3[normalize-space()='Log in to continue']")).getText();
			String ExpText = "LOG IN TO CONTINUE";
			Assert.assertEquals(ActText, ExpText);
		}

		@BeforeTest
		public void LaunchBrowser() {
			// Download chromedriver at run time
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get("https://demo.spreecommerce.org/");
		}

		@AfterTest
		public void CloseBrowser() {
			driver.quit();
		}
}
