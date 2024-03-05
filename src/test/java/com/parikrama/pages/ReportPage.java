package com.parikrama.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.parikrama.utils.BaseTest;
import com.parikrama.utils.SikuliUtils;

public class ReportPage extends BaseTest {
	
	

	@FindBy(id = "emailid")
	WebElement useremail;
	
	@FindBy(id = "pwd")
	WebElement password;
	
	@FindBy(id = "captcha_code_input")
	WebElement captchainput;
	
/*	@FindBy(xpath = "//*[@id=\"wrapper_body\"]/div/center/div/table/tbody/tr/td[2]/form/button")
	WebElement Signin;
	
	@FindBy(linkText = "//*[@id=\"wrapper_content\"]/div/div[3]/div/div/ul/li[6]/a")
	WebElement calendarbtn;
	*/
	
	@FindBy(id = "companyChange")
	WebElement selectcompany;
	
	@FindBy(id ="assigned_to")
	WebElement selectperson;
	
	@FindBy(name = "from_date")
	WebElement selectfromdate;
	
	@FindBy(name = "to_date")
	WebElement selecttodate;
	
	@FindBy(name = "btnReport")
	WebElement refreshbtn;
	
	@FindBy(name = "btnDownloadCSV")
	WebElement downloadbtn;
	
	public void enterUserName(String user) {
		
		typeText(useremail, user);
	}

	public void enterPassword(String pwd) {
		
		typeText(password, pwd);
		
	}

	public void clicksignin () {
		
		//clickAction(Signin);
		try {
			SikuliUtils.clickImage();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
	
	public void clickreport() {
		
		//clickAction(calendarbtn);
		
		try {
			SikuliUtils.clickimages1();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public void clickCompanyoption() {
		
		clickAction(selectcompany);
	}

	public void selectcompanyname() {
		
		selectDDbyindex(selectcompany, 3);
		clickAction(selectcompany);
	}

	public void selectemployeeoption() {
		
		clickAction(selectperson);
	}


	public void selectemployee() {
		
		selectDDbyvalue(selectperson, "124");
		clickAction(selectperson);
	}

	public void assignedfromdate() {
		
		typeText(selectfromdate, "2024/03/07");
	}
 
	public void assignedtilldate() {
		
		typeText(selecttodate, "2024/03/15");
		
		
	}

	public void clickrefresh() {
		
		clickAction(refreshbtn);
	}

	public void clickDownload() {
		
		clickAction(downloadbtn);
	}

























































}
