package testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import libraries.AdminUtils;
import libraries.Employee;

public class EmployeeRegistsrtionTest extends AdminUtils 
{
	
	@Parameters({"fname","lname"}) 
	@Test 
	public void checkempreg(String fname, String lname)  
	{

		Employee emp= new Employee(); 
		boolean res=emp.addemployee(fname, lname); 
		Assert.assertTrue(res);
		
	}


}
