package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns extends Base {
	
	public void dropDowns()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement select=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select1=new Select(select);
		//select1.selectByValue("Yellow");
		//select1.selectByVisibleText("Green");
		select1.selectByIndex(2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		HandlingDropdowns dropdown=new HandlingDropdowns();
		dropdown.initializebrowser();
		dropdown.dropDowns();
		
	}

}
