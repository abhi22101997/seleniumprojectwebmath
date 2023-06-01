package com.assignment.page;

import org.openqa.selenium.By;

public class LoginPage extends LoginBase {
	public void login() {
		driver.findElement(By.id("email")).sendKeys("abhishek");
		driver.findElement(By.id("passwd")).sendKeys("xyz");
		driver.findElement(By.id("SubmitLogin")).click();
	}
	
	}
	

