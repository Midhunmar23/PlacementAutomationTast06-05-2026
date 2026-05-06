package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Registration  extends Base
{
	
	     @Test
	     public void submitForm()
	     {
	    	 
	    	    driver.navigate().to("https://selenium.qabible.in/form-submit.php");
	    	    
	    	    WebElement fristname= driver.findElement(By.xpath("//input[@id='validationCustom01']"));
	    	    fristname.sendKeys("Ksish");
	    	    driver.findElement(By.xpath("//input[@id='validationCustom02']")).sendKeys("KK");
	    	   WebElement  Uname= driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
	    	   Uname.sendKeys("Krish23");
	    	   driver.findElement(By.xpath("//input[@id='validationCustom03']")).sendKeys("Benguluru");
	    	   driver.findElement(By.xpath("//input[@id='validationCustom04']")).sendKeys("Krntka");
	    	   driver.findElement(By.xpath("//input[@id='validationCustom05']")).sendKeys("691560");
	    	   driver.findElement(By.xpath("//input[@id='invalidCheck']")).click();
	    	   driver.findElement(By.xpath("//button[text()='Submit form']")).click();
	    	    
	    	 
	     }

}
