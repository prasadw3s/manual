package libraries;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.AppUtils;

public class Employee extends AppUtils
{

	public boolean addemployee(String fname,String lname) 
	{

		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();

		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
		String emp=	driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();


		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(emp); 
		driver.findElement(By.id("searchBtn")).click();


		WebElement table=	driver.findElement(By.id("resultTable"));
		List<WebElement> rows=	table.findElements(By.tagName("tr"));
		
		boolean result= false;
		for(int i=1;i<rows.size();i++) 
		{
			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(emp))  
			 {
				 result = true;
				 break; 
			 }
		}
		return result; 
	}
}
