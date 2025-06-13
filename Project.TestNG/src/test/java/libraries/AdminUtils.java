package libraries;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.AppUtils;

public class AdminUtils extends AppUtils  
{
	
	LoginPage lp;
	@BeforeTest 
	public void adminlogin() 
	{
		lp=new LoginPage();
		lp.login("Admin", "Qedge123!@#"); 
		
	}
	
	@AfterTest 
	public void adminlogout() throws Throwable 
	{
		
		lp.logout(); 
	}
	
	
	
	
}
