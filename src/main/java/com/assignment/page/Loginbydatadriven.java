package com.assignment.page;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class Loginbydatadriven extends LoginBase{
	
	public void login() throws EncryptedDocumentException, IOException {
		driver.findElement(By.id("email")).sendKeys(UtilityClass.getData(1, 0));
		driver.findElement(By.id("passwd")).sendKeys(UtilityClass.getData(0, 1));
		driver.findElement(By.id("SubmitLogin")).click();
	}
	
	

}
