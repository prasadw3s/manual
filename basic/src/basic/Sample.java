package basic;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws Throwable 
	{ 	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 

		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);

		//selenium download

		List<WebElement> data=	driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
		System.out.println(data.size());
		
		for (WebElement sample : data)
		{
			String dataaaa= sample.getText();
			System.out.println(dataaaa); 
			if(dataaaa.equalsIgnoreCase("selenium download")) 
			{
				sample.click();
				break;
			}
		}
		
	} 
} 