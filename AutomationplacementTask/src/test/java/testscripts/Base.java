package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	
public WebDriver driver;
	
	@BeforeMethod 
	
	public void invokeBrowser()
	{
		driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
