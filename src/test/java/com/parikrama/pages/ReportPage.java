package com.parikrama.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.parikrama.utils.BaseTest;

public class ReportPage extends BaseTest {
	
	

	@FindBy(id = "emailid")
	WebElement useremail;
	
	@FindBy(id = "pwd")
	WebElement password;
	
	@FindBy(id = "captcha_code_input")
	WebElement captchainput;
	
	@FindBy(name = "btnLogin")
	WebElement Signin;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div/ul/li[4]/a")
	WebElement reportbtn;
	
	public void enterUserName(String user) {
		
		typeText(useremail, user);
	}

	public void enterPassword(String pwd) {
		
		typeText(password, pwd);
		
	}

	public void clicksignin () {
		
		clickAction(Signin);	
		
	}
	
	public void clickReportBtn() {
		
		jsClick(reportbtn);
	}

	

}
