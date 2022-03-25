package OrangeHRM_Login;

import org.testng.annotations.DataProvider;

public class Applicationtestdata 

{
	@DataProvider(name="Login")
	
	public Object[][] getdataforlogin()
	{
		
		return new Object[][]
		{
			{"Admin","admin123"},
			{"dixit","admin123"},
			{"sanket","admin123"},
			{"Admin","admin123"},

		};
	}
	
	@DataProvider(name = "LoginScenario")
	public Object[][] getDataforLoginDifferentScenarios() 
	{
		return new Object[][] { 
				{ "admin", "", "Password cannot be empty"},
				{ "", "admin123", "Username cannot be empty" }, 
				{ "AdminWrong", "admin123", "Invalid credentials" },
				{ "admin", "admin", "Invalid credentials" }, 
				{ "admin", "admin123", "Dashboard" }
				
		};

	}

}
