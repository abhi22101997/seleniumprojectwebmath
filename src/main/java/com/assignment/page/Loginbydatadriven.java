package com.assignment.page;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Loginbydatadriven extends LoginBase{
	
	public void login() throws EncryptedDocumentException, IOException {
		driver.findElement(By.id("email")).sendKeys(UtilityClass.getData(1, 0));
		driver.findElement(By.id("passwd")).sendKeys(UtilityClass.getData(0, 1));
		driver.findElement(By.id("SubmitLogin")).click();
	}
	
	
	public void enterUserName() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.findElement(By.name("uid")).sendKeys(UtilityClass.getData(1, 0));
		
	}
	
	public void enterPassword() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.findElement(By.name("password")).sendKeys(UtilityClass.getData(0, 1));
		
	}
	public void clickOnSubmitButton() {
		driver.findElement(By.name("btnLogin")).click();
		
	}
	public void clickOnOkButton() throws InterruptedException{
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	
	
	

}
