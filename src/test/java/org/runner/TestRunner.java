package org.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.reports.ExtendedReport;
import org.reports.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue="org.stepdefinition",
				  dryRun = false, monochrome = true,tags="@e2e",
				  plugin = {"pretty","html:src\\test\\resources\\Reports\\HtmlReport\\report.html",
						  	"json:src\\test\\resources\\Reports\\JsonReport\\report.json"}		
		        )

public class TestRunner {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Extended Report Start");
		ExtendedReport.startReport();
	}
	
	@AfterClass
	public static void afterClass() {
		ExtendedReport.endReport();
		System.out.println("Extent Report Generated and Closed");
		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\JsonReport\\report.json", "Luma");
	}
	
}
