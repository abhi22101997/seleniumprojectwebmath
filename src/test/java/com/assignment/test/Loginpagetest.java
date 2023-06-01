package com.assignment.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.page.LoginPage;

public class Loginpagetest {
	LoginPage lp;
	@BeforeMethod
	public void browsersetup() {
	    lp = new LoginPage();
		lp.intialization();
	}
	@Test
	public void logintest() {
		lp.login();
	}
	@AfterMethod
	public void closebrowser() {
		lp.teardown();
	}
	
}
