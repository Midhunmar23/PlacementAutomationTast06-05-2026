package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draganddrop  extends Base
{
	
	     @Test
	    public void dragAndDrop()
	    {
	    	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	    	Actions newaction= new Actions(driver);
	    	
	    	WebElement sorce= driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
	    	WebElement target= driver.findElement(By.id("mydropzone"));
	    	newaction.dragAndDrop(sorce, target).perform();
	    }
	     
	     @Test
	     public void rightClick()
	     {
	    	 driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	    	 Actions newactions= new Actions( driver);
	    	 
	    	 WebElement arrowTest= driver.findElement(By.id("mydropzone"));
	    	 newactions.contextClick().perform();
	    	 
	     }

}
