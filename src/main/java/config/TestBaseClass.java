package config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBaseClass
{
	WebDriver driver;
	public Properties prop;
	
	public WebDriver DriverInitialization()
	{
		File src = new File("E:\\Selenium by Rahul Shetty\\eclipse-workspace\\AshE2E\\src\\main\\java\\resources\\StaticData.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
			String browser = prop.getProperty("Browser");
			if (browser.equalsIgnoreCase("InternetExplorer"))
			{
				driver = new InternetExplorerDriver();
			}
			else if (browser.equalsIgnoreCase("FireFox"))
			{
				driver = new FirefoxDriver();
			}
			else
			{
				driver = new ChromeDriver();
			}
		} catch (Exception e) {
			System.out.println("Exception Caught "+e.getMessage());
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public String CaptureScreenshot(WebDriver driver,String FilePath)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		String destFile = System.getProperty("user.dir")+"\\Evidence\\Screenshots\\"+FilePath+System.currentTimeMillis()+".png";
		try {
			FileUtils.copyFile(srcFile, new File(destFile));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return destFile;
	}
}
