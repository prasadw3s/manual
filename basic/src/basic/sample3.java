package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sample3 
{
	@Test(dataProvider = "demo")
	public void test(Object[] name) 
	{
		System.out.println(name); 
	}
	
	@DataProvider 
	public Iterator<Object[]> demo()
	{
		List<Object[]> data= new ArrayList<Object[]>();
		data.add(new Object[] {"prasad"});
		return data.iterator();  
		
	}
}
