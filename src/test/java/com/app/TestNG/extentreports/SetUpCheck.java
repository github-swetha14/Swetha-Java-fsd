package com.app.TestNG.extentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SetUpCheck {
	
	@Test
	public void extentdemo() {
		
		ExtentReports ex =new ExtentReports();
		
		
		//C:\Users\Swetha\eclipse-workspace\Selenium_Workspace\ATE-Phase2-Selenium-TestNG
		
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter("//C:\\Users\\Swetha\\eclipse-workspace\\Selenium_Workspace\\ATE-Phase2-Selenium-TestNG\\extentReport\\report.html");
		
		ex.attachReporter(sparkreporter);
		
		ex.flush();
			
	}
	
	@Test
	public void extentdemo2() throws IOException {
		
		ExtentReports ex = new ExtentReports();
		File file = new File("report1.html");
		
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter(file);
		ex.attachReporter(sparkreporter);
		ex.flush();
		
		Desktop.getDesktop().browse(new File("report1.html").toURI());
		
	}
	

}
