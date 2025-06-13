package libraries;

import java.time.Duration;

import org.openqa.selenium.By;

import utils.AppUtils;

public class LoginPage extends AppUtils

{

	public void login(String uid, String pass) 
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);  
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	public boolean isAdminModuleDisplayed() 
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed()) 
		{
			return true; 
		}else 
		{
			return false; 
		}
	}
	
	public void logout() throws Throwable  
	{
		driver.findElement(By.linkText("Welcome Suresh")).click();
		Thread.sleep(1000); 
		driver.findElement(By.linkText("Logout")).click();
	
	}
	
	public boolean iserrmessagedisplayed() 
	{
	String errmessage=	driver.findElement(By.id("spanMessage")).getText().toLowerCase();
	if(errmessage.contains("invalid")|| errmessage.contains("empty"))
	{
		return true;
	}
	else 
	{
		return false; 
	}
		
	}
	
} 
