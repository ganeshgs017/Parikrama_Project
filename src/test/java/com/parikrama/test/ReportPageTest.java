package com.parikrama.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.parikrama.pages.ReportPage;
import com.parikrama.utils.Reports;

@Listeners(Reports.class)
public class ReportPageTest extends ReportPage{	

	Reports report = new Reports();

	@Test
	public void companyreportParikrama()  {

		try {

			report.setTestCaseDesc("Validating the Report Page Test cases");

			launchBrowser("https://parikrama.ioptechnologies.com/crm/login");

			ReportPage loginpage = PageFactory.initElements(driver, ReportPage.class);

			loginpage.enterUserName("iop.support@ioptechnologies.com");
			loginpage.enterPassword("maheshcv");
			Thread.sleep(13000);
			loginpage.clicksignin();
			Thread.sleep(3000);
			loginpage.clickreport();
			Thread.sleep(3000);
			loginpage.clickCompanyoption();
			Thread.sleep(3000);
			loginpage.selectcompanyname();
			Thread.sleep(2000);
			loginpage.selectemployeeoption();
			Thread.sleep(2000);
			loginpage.selectemployee();
			Thread.sleep(2000);
			loginpage.assignedfromdate();
			Thread.sleep(2000);
			loginpage.assignedtilldate();
			Thread.sleep(2000);
			loginpage.clickrefresh();
			Thread.sleep(2000);
			loginpage.clickDownload();

			loginpage.quitBrowser();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}


}
