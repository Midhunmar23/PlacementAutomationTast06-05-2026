package testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alerthadle extends Base
{
	
	    @Test
	   public void simpleAlert()
	   {
	    	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	    	WebElement sipalert= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
			sipalert.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
	   }
	    
	    @Test
	    public void confirmationAlert()
	    {
	    	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	    	WebElement confirmationAlert= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	    	confirmationAlert.click();
	    	Alert alert=driver.switchTo().alert();
	    	alert.dismiss();
	    
	    }
	    
	    @Test
	    public void promtAlert()
	    {
	    	 driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
				WebElement promtalert= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
				promtalert.click();
				Alert alrt= driver.switchTo().alert();
				alrt.sendKeys("MG");
				alrt.accept();
	    }
	 
	

}
