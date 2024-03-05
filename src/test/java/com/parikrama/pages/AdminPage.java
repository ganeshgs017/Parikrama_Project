package com.parikrama.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.parikrama.utils.BaseTest;
import com.parikrama.utils.SikuliUtils;

public class AdminPage extends BaseTest {

	@FindBy(id = "emailid")
	WebElement useremail;

	@FindBy(id = "pwd")
	WebElement password;

	@FindBy(id = "captcha_code_input")
	WebElement captchainput;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[4]/div/div[2]/form/table/tbody/tr[2]/td[4]/a")
	WebElement actionsedit;

//	@FindBy(name = "btnUpdate")
//	WebElement updatebutton;

	@FindBy(xpath = "//*[@id=\"wrapper_body\"]/div/div[1]/div/div/ul/li[2]/a")
	WebElement categorybtn;
	
	
	public void enterUserName(String user) {

		typeText(useremail, user);
	}

	public void enterPassword(String pwd) {

		typeText(password, pwd);

	}

	public void clickcaptcha() {

		clickAction(captchainput);

	}

	public void clicksignin() {

		// clickAction(Signin);
		try {

			SikuliUtils.clickImage();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void clickadmin() {

		try {

			SikuliUtils.clickimage2();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void editdetails() {

		clickAction(actionsedit);
	}

	public void clickcategory() {
		
		clickAction(categorybtn);


	}

}
