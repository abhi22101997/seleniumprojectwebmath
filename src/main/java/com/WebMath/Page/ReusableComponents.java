package com.WebMath.Page;

import org.testng.Assert;

public class ReusableComponents extends OpenBrowser {

	public void logInfo(String message) {
		System.out.println("INFO: " + message);
	}
	
	public void clickOnMathForEveryone() {
		logInfo("clickOnMathForEveryone" + " execuation started");
		try {
			driver.findElement(ObjectRepository.mathForEveryone).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void verifymathForEveryonePageIsDisplayed() {
		logInfo("verifymathForEveryonePageIsDisplayed" + "execuation started");
		try {
			String textOfMathForEveryonedriver=driver.findElement(ObjectRepository.textOfMathForEveryone).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfMathForEveryonedriver, "Math for Everyone");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void clickOnChooseMathHelpItemDropdown() {
		logInfo("clickOnChooseMathHelpItemDropdown" + " execuation started");
		try {
			driver.findElement(ObjectRepository.chooseMathHelpItemDropdown).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void clickOnGoButton() {
		logInfo("clickOnGoButton" + " execuation started");
		try {
			driver.findElement(ObjectRepository.goButton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void verifyHomePageIsDisplayed() {
		logInfo("verifymathForEveryonePageIsDisplayed" + "execuation started");
		try {
			String textOfMathForEveryonedriver=driver.findElement(ObjectRepository.textFromHomePage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfMathForEveryonedriver, "Welcome to Webmath!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void clickOnFiguringATip() {
		logInfo("clickOnFiguringATip" + " execuation started");
		try {
			driver.findElement(ObjectRepository.figuringATip).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void clickOnSalePrice() {
		logInfo("clickOnSalePrice" + " execuation started");
		try {
			driver.findElement(ObjectRepository.salePrice).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void clickOnWindChill() {
		logInfo("clickOnGoButton" + " execuation started");
		try {
			driver.findElement(ObjectRepository.windChill).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void clickOnCountCoins() {
		logInfo("clickOnCountCoins" + " execuation started");
		try {
			driver.findElement(ObjectRepository.countCoins).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void clickOnLotteryOdds() {
		logInfo("clickOnLotteryOdds" + " execuation started");
		try {
			driver.findElement(ObjectRepository.lotteryOdds).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void clickOnSimpleInterest() {
		logInfo("clickOnSimpleInterest" + " execuation started");
		try {
			driver.findElement(ObjectRepository.simpleInterest).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void verifyTipCalculatorPageIsDisplayed() {
		logInfo("verifyTipCalculatorPageIsDisplayed" + "execuation started");
		try {
			String textOfMathForEveryonedriver=driver.findElement(ObjectRepository.textFromTipCalculator).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfMathForEveryonedriver, "Tip Calculator");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

