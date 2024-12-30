package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String json,String projectname) {
		
		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReports");
		
		Configuration con =new Configuration(loc, projectname);
		con.addClassifications("BrowserName", "Chrome");		
		con.addClassifications("BrowserVersion", "131");		
		con.addClassifications("OS", "Windows 11");		
		con.addClassifications("Environment", "QA");		
			
		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(json);
		
		ReportBuilder r=new ReportBuilder(jsonFiles, con);
		r.generateReports();
		
	}

}
