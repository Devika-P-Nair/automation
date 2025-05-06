package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathLocator extends Base {
	
	public void relativeXpath()
	{
		//tagname[@attribute='value']
		WebElement a=driver.findElement(By.xpath("//button[@id='button-one']"));
		
	}
	public void contains()
	{
		//tagname[contains(@attribute,'value')]
		WebElement b=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		
	}
	public void startsWith()
	{
		//tagname[starts-with(@attribute,'value')]
		WebElement c=driver.findElement(By.xpath("//input[starts-with(@id,'single')]"));
	}
   public void text()
   {
	   //tagname[text()='value']
	   WebElement d=driver.findElement(By.xpath("//label[text()='Enter Message']"));
   }
   public void and()
   {
	   //tagname[@attribute='value' and @attribute='value']
	   WebElement e=driver.findElement(By.xpath("//input[@id='value-b' and @class='form-control']"));
   }
   public void or()
   {
	   WebElement f=driver.findElement(By.xpath("//input[@id='value-a' or @placeholder='Enter Value']"));
   }
   
  public void textm()
   
   {
	   driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	   WebElement find=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	   System.out.println(find.isEnabled());
	   find.sendKeys("Message");
	   WebElement fnd=driver.findElement(By.xpath("//button[@id='button-one']"));
	   fnd.click();
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         XpathLocator xpathlocator=new  XpathLocator();
         xpathlocator.initializebrowser();
         xpathlocator.textm();
		
	}

}
