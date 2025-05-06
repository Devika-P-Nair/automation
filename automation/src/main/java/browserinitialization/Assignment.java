package browserinitialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment extends Base {

	
	public void text()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> txt=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement text:txt)
		{
			text.sendKeys("Hello World");
		}
		
		}
	public static void main(String[] args) {
		
		
		Assignment assignment=new Assignment();
		assignment.initializebrowser();
		assignment.text();

	}

}
