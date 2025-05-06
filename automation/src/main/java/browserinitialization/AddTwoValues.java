package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddTwoValues extends Base{
	
	
	public void navigate()
	{
		driver.navigate().to("https://selenium.qabible.in/index.php");
		WebElement a=driver.findElement(By.xpath("//input[@id='value-a']"));
		a.sendKeys("5");
		WebElement b=driver.findElement(By.xpath("//input[@id='value-b']"));
		b.sendKeys("7");
		WebElement c=driver.findElement(By.xpath("//button[@id='button-two']"));
		c.click();
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		AddTwoValues add=new AddTwoValues();
		add.initializebrowser();
		add.navigate();
		
		
	}

}
