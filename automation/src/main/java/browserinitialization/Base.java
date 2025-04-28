package browserinitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base
{
public WebDriver driver;

public void initializebrowser()
{
	driver=new ChromeDriver();
	//driver=new EdgeDriver();
	//driver=new FirefoxDriver();
	driver.get("https://selenium.qabible.in/index.php");
	driver.manage().window().maximize();
}

public void QuitAndClose()
{
	//driver.close();
	driver.quit();
}
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
           
	Base base=new Base();
	base.initializebrowser();
	base.QuitAndClose();
	}
	
	
	
	

}
