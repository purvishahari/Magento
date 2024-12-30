package org.stepdefinition;

import java.io.IOException;

import org.reports.ExtendedReport;
import org.utility.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	
	@Before()
	public void beforeScenario() {
		launchBrowser(getPropertyValue("browsername"));
		urlLaunch(getPropertyValue("url"));
		maximize();
		implicitWait(50);	
	}

	@After()
	public void afterScenario(Scenario sc) throws IOException {
		String name = sc.getName();
		screenShot(name); 
		ExtendedReport.createTestLog(sc);
		quit();
	}

}
