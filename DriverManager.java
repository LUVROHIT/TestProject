package BasePage;

import org.openqa.selenium.WebDriver;

public class DriverManager extends ChromeLauncher
{
	private WebDriver driver;
	
	public WebDriver getdriver()
	{
		if(driver==null)
		{
			driver=set_driver();
			return driver;		
		}
		
		else
		{
			return driver;
		}
	}
	
	public WebDriver set_driver()
	{
		 driver=launcher();
		 return driver;
	}
}
