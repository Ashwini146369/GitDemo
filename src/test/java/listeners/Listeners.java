package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import config.ExtentReportV5;
import config.TestBaseClass;

public class Listeners extends TestBaseClass implements ITestListener
{

	ExtentReports extent = ExtentReportV5.GenerateReport();
	ExtentTest test;
	ThreadLocal<ExtentTest> et = new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) 
	{	
		et.set(extent.createTest(result.getMethod().getMethodName()));
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		et.get().log(Status.PASS, "Test is passed");
	}
	
	public void onTestFailure(ITestResult result) 
	{	
		et.get().fail(result.getThrowable());
		WebDriver driver=null;
		String Filename = result.getMethod().getMethodName();
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			et.get().addScreenCaptureFromPath(CaptureScreenshot(driver,Filename), Filename);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void onFinish(ITestContext context) 
	{
		extent.flush();
	}

}
