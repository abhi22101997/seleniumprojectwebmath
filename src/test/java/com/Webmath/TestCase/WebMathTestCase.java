package com.Webmath.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WebMath.Page.OpenBrowser;
import com.WebMath.Page.ReusableComponents;
import com.assignment.page.LoginPage;

public class WebMathTestCase extends ReusableComponents{
	OpenBrowser lp;
	@BeforeMethod
	public void browsersetup() {
	    lp = new OpenBrowser();
		lp.intialization("chrome");
	}
	@Test
	public void logintest() {
		clickOnMathForEveryone();
		verifymathForEveryonePageIsDisplayed();
		clickOnChooseMathHelpItemDropdown();
		clickOnGoButton();
		verifyHomePageIsDisplayed();
		clickOnMathForEveryone();
		clickOnFiguringATip();
		clickOnMathForEveryone();
		clickOnSalePrice();
		clickOnMathForEveryone();
		clickOnWindChill();
		clickOnMathForEveryone();
		clickOnCountCoins();
		clickOnMathForEveryone();
		clickOnLotteryOdds();
		
		
		
	}
	@AfterMethod
	public void closebrowser() {
		lp.teardown();
	}
	
}
