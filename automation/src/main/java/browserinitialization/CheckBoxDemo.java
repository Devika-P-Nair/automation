package browserinitialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxDemo extends Base {
	
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");	
		WebElement c=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		
		c.click();
		System.out.println(c.isSelected());
		}
	
	public void radioButton(){
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement r=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		r.click();

	}

	/*public void multiple()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");	
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (WebElement checkbox : checkboxes) {
	        if (!checkbox.isSelected()) {
	            checkbox.click();
	        }
		}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBoxDemo checkbox=new CheckBoxDemo();
		checkbox.initializebrowser();
		checkbox.checkBox();
		checkbox.radioButton();
		//checkbox.multiple();

	}

}
