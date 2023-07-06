package com.assignment.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.page.Loginbydatadriven;

public class assignment4_1 {
	Loginbydatadriven lp;
	@BeforeMethod
	public void browsersetup() {
	    lp = new Loginbydatadriven();
		lp.initialization_module4();
	}
	@Test
	public void logintest() throws EncryptedDocumentException, IOException, InterruptedException {
		lp.enterUserName();
		lp.enterPassword();
		lp.clickOnSubmitButton();
		lp.clickOnOkButton();
		
	}
	@AfterMethod
	public void closebrowser() {
		lp.teardown();
	}
	


}



