package basic;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) 
	{ 	
		int[] ages= {10,20,30};
		int lowestage= ages[0];  
		
		for (int age : ages) 
		{
			if(lowestage>age) 
			{
				lowestage= age;
			}
		}
		
		System.out.println(lowestage); 
	} 
} 