package com.assignment.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.page.Loginbydatadriven;

public class Logintestbydata {

	Loginbydatadriven lp;
	@BeforeMethod
	public void browsersetup() {
	    lp = new Loginbydatadriven();
		lp.intialization();
	}
	@Test
	public void logintest() throws EncryptedDocumentException, IOException {
		lp.login();
	}
	@AfterMethod
	public void closebrowser() {
		lp.teardown();
	}
	


}
