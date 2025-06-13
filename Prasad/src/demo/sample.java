package demo;
import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample {

	public static void main(String[] args) throws Throwable  
	{	
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://amazon.in"); 
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.getElementsByClassName(product-image).scrollIntoView();");
		
	}}
