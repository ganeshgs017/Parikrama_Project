package com.parikrama.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports implements ITestListener{
	
	
	
	public static ExtentSparkReporter sparkReporter_Alltest;
	public static ExtentSparkReporter sparkReporter_FailedTest;
	public static ExtentSparkReporter sparkReporter_SkippedandWarningtest;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	
	
	@BeforeSuite
	public void startReport() {

		try {

			sparkReporter_Alltest = new ExtentSparkReporter(System.getProperty("user.dir") +"/AllTest.html");
			extentReports = new ExtentReports();
			sparkReporter_Alltest.config().setDocumentTitle("Parikrama Automation Report");
			sparkReporter_Alltest.config().setReportName("parikrama WebAutomation Results");
			sparkReporter_Alltest.config().setTheme(Theme.DARK);
			sparkReporter_Alltest.config().setTimeStampFormat("EEEE, MMM dd, yyyy,hh:mm a '('zzz')'");
           
			sparkReporter_FailedTest = new ExtentSparkReporter(System.getProperty("user.dir") +"/FailedTest.html");
			extentReports = new ExtentReports();
			sparkReporter_FailedTest.config().setDocumentTitle("Parikrama Automation Report");
			sparkReporter_FailedTest.config().setReportName("parikrama WebAutomation Results");
			sparkReporter_FailedTest.config().setTheme(Theme.DARK);
			sparkReporter_FailedTest.config().setTimeStampFormat("EEEE, MMM dd, yyyy,hh:mm a '('zzz')'");
			 sparkReporter_Alltest.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
				
			
			
			sparkReporter_SkippedandWarningtest = new ExtentSparkReporter(System.getProperty("user.dir") +"/SkippedandWarning.html");
			extentReports = new ExtentReports();
			sparkReporter_SkippedandWarningtest.config().setDocumentTitle("Parikrama Automation Report"); 
			sparkReporter_SkippedandWarningtest.config().setReportName("parikrama WebAutomation Results");
			sparkReporter_SkippedandWarningtest.config().setTheme(Theme.DARK);
			sparkReporter_SkippedandWarningtest.config().setTimeStampFormat("EEEE, MMM dd, yyyy,hh:mm a '('zzz')'");
			sparkReporter_FailedTest.filter().statusFilter().as(new Status[] {Status.SKIP, Status.WARNING}).apply();
		

			extentReports.attachReporter(sparkReporter_Alltest,sparkReporter_FailedTest,sparkReporter_SkippedandWarningtest);

		}

		catch (Exception ex) {

			System.out.println("Problem While Generating the Html Reports ");
			ex.printStackTrace();
		}
	}

	public void setTestCaseDesc(String testcasename) {

		try {

			extentTest = extentReports.createTest(testcasename);

		}

		catch (Exception ex) {

			System.out.println("Problem while creating the Test case");

			ex.printStackTrace();
		}
	}

	public static void reportStep(String status, String desc) {
		
		try {
			
			if(status.toUpperCase().equals("PASS"))
			{
				extentTest.log(Status.PASS, desc);
			}
		
			else if (status.toUpperCase().equals("FAIL"))
				{
					extentTest.log(Status.FAIL, desc);
				}
				else if (status.toUpperCase().equals("SKIP")){
					{
						extentTest.log(Status.SKIP, desc);
					}
				}
		}
	
		catch(Exception ex) 
		{
			ex.printStackTrace();
			
		
		}
	}
		public void onTestSuccess(ITestResult result) {
			
			try 
			{
				if(result.getStatus() == ITestResult.SUCCESS)
				{
					extentTest.log(Status.PASS, result.getName());
				}
				
			}
			
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}

		public void onTestFailure(ITestResult result) {
			
			try 
			{
				if (result.getStatus() == ITestResult.FAILURE)
				{
					extentTest.log(Status.FAIL, result.getThrowable());
				}
				
			}
			
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}

		public void onTestSkipped(ITestResult result) {
			
			try 
			{
				if(result.getStatus() == ITestResult.SKIP)
				 {
					extentTest.log(Status.SKIP, result.getName());
					
				}
			}
			
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
		
	
	@AfterSuite
	public void endReport() {
		
		try {
			
		
		extentReports.flush();
		
	}

	catch(Exception ex) {
		
		System.out.println("Problem while generating the report");
		
		ex.printStackTrace();
	}
	
}

}


