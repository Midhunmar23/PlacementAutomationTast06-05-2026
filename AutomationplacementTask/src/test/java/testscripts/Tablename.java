package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tablename  extends Base
{
	
	      @Test
	    public void tableName()
	    {
	    	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	    	List<WebElement> columnData = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//td[1]"));
	    	for (WebElement cell : columnData) {
	    	    System.out.println(cell.getText());
	    	}
	    }

}
