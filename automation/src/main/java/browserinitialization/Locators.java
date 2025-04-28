package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
	public void idLocator()
	{
		WebElement messagefield=driver.findElement(By.id("single-input-fieldull"));
		
	}
	
	public void nameLocator()
	{
		WebElement name=driver.findElement(By.name("description"));
	}

	public void classLocator()
	{
		WebElement classloc=driver.findElement(By.className("header-top"));
	}
	
	public void linkLocator()
	{
		WebElement link=driver.findElement(By.linkText("radio-button-demo.php"));
	}
	
	public void partialLinkTextLocator()
	{
		WebElement partial=driver.findElement(By.partialLinkText("radio-button"));
	}
	
	public void cssSelector()
	{
		WebElement tagid=driver.findElement(By.cssSelector("input#single-input-field")); //tag#id
		WebElement tagclass=driver.findElement(By.cssSelector("button.navbar-toggler"));//tag.class
		WebElement tagattribute=driver.findElement(By.cssSelector("input[placeholder=Message]"));//tag[attributetype=attributevalue]
		WebElement tca=driver.findElement(By.cssSelector("input.form-control[placeholder=Message]"));//tag.class[attributetype=attributevalue]
	}
	
	public void cssSelector1()
	{
		WebElement a=driver.findElement(By.cssSelector("input#password_step_input"));
		WebElement b=driver.findElement(By.cssSelector("a._9bq5"));
		WebElement c=driver.findElement(By.cssSelector("input[data-type=\"password\"]"));
		WebElement d=driver.findElement(By.cssSelector("input.inputtext _58mg _5dba _2ph-[data-type=\"password\"]"));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}

}
