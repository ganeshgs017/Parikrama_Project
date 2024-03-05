package com.parikrama.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.parikrama.utils.BaseTest;
import com.parikrama.utils.SikuliUtils;

public class SigninPage extends BaseTest {
	
	@FindBy(id = "emailid")
	WebElement useremail;
	
	@FindBy(id = "pwd")
	WebElement password;
	
	@FindBy(id = "captcha_code_input")
	WebElement captchainput;
	
	//@FindBy(name = "btnLogin")
	//WebElement Signin;
	
	
	public void enterUserName(String user) {
		
		typeText(useremail, user);
	}

	public void enterPassword(String pwd) {
		
		typeText(password, pwd);
		
	}

	public void clicksignin () {
		
			
		
	//	clickAction(Signin);
		try {
			
			SikuliUtils.clickImage();
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}	
		
	}	

}
