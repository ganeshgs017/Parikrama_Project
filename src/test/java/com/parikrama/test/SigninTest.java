package com.parikrama.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.parikrama.pages.SigninPage;
import com.parikrama.utils.Reports;

@Listeners(Reports.class)

public class SigninTest extends SigninPage {

	Reports report = new Reports();

	@Test
	public void loginParikrama() {

		try {

			report.setTestCaseDesc("Validating the  Signin Page Test cases");

			launchBrowser("https://parikrama.ioptechnologies.com/crm/login");

			SigninPage loginpage = PageFactory.initElements(driver, SigninPage.class);

			loginpage.enterUserName("iop.support@ioptechnologies.com");
			loginpage.enterPassword("maheshcv");
			Thread.sleep(10000);
			loginpage.clicksignin();
		
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		
	}
}

