package com.assignment.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.page.Assignmentform;



public class FormFillAssignment {

	Assignmentform lp;
	@BeforeMethod
	public void browsersetup() {
	    lp = new Assignmentform();
		lp.intializations();
	}
	@Test
	public void logintest() throws InterruptedException {
		lp.click0nFormButton();
		lp.clickOnPracticeForm();
		lp.fillForm();
	}
	
	@AfterMethod
	public void closebrowser() {
		lp.teardown();
	}
	


}
