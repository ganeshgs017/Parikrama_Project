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
	public void loginParikrama() {

		try {

			report.setTestCaseDesc("Validating the Test cases");

			launchBrowser("https://parikrama.ioptechnologies.com/crm/login");

			ReportPage loginpage = PageFactory.initElements(driver, ReportPage.class);

			loginpage.enterUserName("iop.support@ioptechnologies.com");
			loginpage.enterPassword("maheshcv");
			Thread.sleep(13000);
			loginpage.clicksignin();
			Thread.sleep(2000);
			loginpage.clickReportBtn();
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}


}
