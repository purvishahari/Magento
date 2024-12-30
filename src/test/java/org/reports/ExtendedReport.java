package org.reports;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utility.BaseClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class ExtendedReport extends BaseClass {
	
	static ExtentReports report;
	public static void startReport() {
		
		ExtentSparkReporter html=new ExtentSparkReporter(System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports\\ExtentReport\\report.html");
		html.config().setDocumentTitle("Cucumber Extent Report");
		html.config().setReportName("Extent Report");
		html.config().setTheme(Theme.DARK);

		
		report= new ExtentReports();
		report.attachReporter(html);
		
		report.setSystemInfo("OS", "Windows");
		report.setSystemInfo("Env", "QA");
	
	}
	public static void createTestLog(Scenario sc) {
		String name = sc.getName();
		Status status = sc.getStatus();
		TakesScreenshot tk= (TakesScreenshot)driver;
		String scr = tk.getScreenshotAs(OutputType.BASE64);
		
		switch (status) {
		case PASSED:
			report.createTest(name).pass("Test Case Passed").addScreenCaptureFromBase64String(scr);
			break;
		case FAILED:
			report.createTest(name).fail("Test Case Failed").addScreenCaptureFromBase64String(scr);
			break;

		default:
			report.createTest(name).skip("Test Case Skipped").addScreenCaptureFromBase64String(scr);
			break;
		}	}
	
	public static void endReport() {
		report.flush();
	}
	

}
