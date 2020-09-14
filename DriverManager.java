package BasePage;

import org.openqa.selenium.WebDriver;

public class DriverManager extends ChromeLauncher
{
	private WebDriver driver;
	
	public WebDriver getdriver()
	{
		if(driver==null)
		{
			driver=setdriver();
			return driver;		
		}
		
		else
		{
			return driver;
		}
	}
	
	public WebDriver setdriver()
	{
		 driver=launcher();
		 return driver;
	}
}
