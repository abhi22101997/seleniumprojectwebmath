package com.assignment.page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginBase {
	public static WebDriver driver;
	public void intialization() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
	}
	
	public void intializations() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
	}
	public void teardown() {
		driver.close();
	}

}
