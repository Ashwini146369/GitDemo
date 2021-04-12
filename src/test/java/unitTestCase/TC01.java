package unitTestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import config.TestBaseClass;

public class TC01 extends TestBaseClass
{	
	WebDriver driver;
	@Test
	public void LaunchApp()
	{
		driver = DriverInitialization();
		driver.get(prop.getProperty("URL"));
		driver.quit();
	}
}
