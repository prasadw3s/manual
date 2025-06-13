package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AppUtils

{
	public static WebDriver driver;
	public static String url= "http://orangehrm.qedgetech.com"; 
	
	@BeforeSuite 
	public static void lanchApp() 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	 //	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		driver.get(url);  
		
	}
	
	@AfterSuite 
	public static void closeapp()
	{
		driver.close(); 
	}
}
