package com.parikrama.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.parikrama.pages.AdminPage;
import com.parikrama.utils.Reports;

@Listeners(Reports.class)
public class AdminPageTest extends AdminPage{
		
	Reports report = new Reports();
	
	@Test
	public void adminDetailsParikrama()  {

		try {

			report.setTestCaseDesc("Validating the  Admin Page Test cases");
		

			launchBrowser("https://parikrama.ioptechnologies.com/crm/login");

			AdminPage loginpage = PageFactory.initElements(driver, AdminPage.class);

			loginpage.enterUserName("iop.support@ioptechnologies.com");

			loginpage.enterPassword("maheshcv");
	
			loginpage.clickcaptcha();
			Thread.sleep(13000);
			loginpage.clicksignin();
			Thread.sleep(3000);
			loginpage.clickadmin();
			Thread.sleep(2000);
            loginpage.editdetails();
            Thread.sleep(2000);
            loginpage.clickcategory();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} 
		catch (Exception ex)
		{
				ex.printStackTrace();
			}

}
}
