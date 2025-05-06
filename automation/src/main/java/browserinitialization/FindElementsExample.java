package browserinitialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsExample extends Base {

	
	public void findElemens()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> multi=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement multiplebox:multi)
		{
			multiplebox.click();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElementsExample findelementsexample=new FindElementsExample();
		findelementsexample.initializebrowser();
		findelementsexample.findElemens();
	}

}
