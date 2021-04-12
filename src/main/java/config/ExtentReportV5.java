package config;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportV5 
{	
	public static ExtentReports GenerateReport()
	{
		String report_path = System.getProperty("user.dir")+"\\Evidence\\Reports\\index.html";
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter reporter = new ExtentSparkReporter(report_path);
		reporter.config().setReportName("Web Automation Result");
		reporter.config().setDocumentTitle("Test Results");
		extent.attachReporter(reporter);
		extent.setSystemInfo("Automation Tester", "Ashwini Kumar");
		return extent;
	}

}
