package testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import libraries.LoginPage;
import utils.AppUtils;

public class AdminloginTestCase  extends AppUtils 
{ 
	@Parameters({"uid","pwd"})  
	@Test 
	public  void checkadmin(String uid,String pwd) throws Throwable 
	{

		LoginPage lp= new LoginPage(); 
		lp.login(uid,pwd); 
		boolean res=lp.isAdminModuleDisplayed(); 
		Assert.assertTrue(res);
		lp.logout();
		
	}


}
