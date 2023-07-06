package com.assignment.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignmentform extends LoginBase {
	public void click0nFormButton() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[2]")).click();
	}
	
	public void clickOnPracticeForm() {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li")).click();
	}
	public void fillForm() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("abhishek");
		driver.findElement(By.id("lastName")).sendKeys("gund");
		driver.findElement(By.id("userEmail")).sendKeys("xyz@gmail.com");
		//Gender
		Actions action =new Actions(driver);
		WebElement radioButton= driver.findElement(By.xpath("(//div[@class=\"custom-control custom-radio custom-control-inline\"]/input)[1]")); 
		action.click(radioButton);
		//MobileNo
		driver.findElement(By.id("userNumber")).sendKeys("9921455698");
		//DOB
		driver.findElement(By.id("dateOfBirthInput")).click();
		Select yearDropdown =new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		yearDropdown.selectByVisibleText("1997");
		Thread.sleep(2000);
		Select monthDropdown =new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		monthDropdown.selectByVisibleText("October");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, October 22nd, 1997']")).click();
		action.build().perform();
		driver.findElement(By.id("subjectsInput")).sendKeys("English");
		Actions action_Subject =new Actions(driver);
		action_Subject.sendKeys(Keys.TAB);
		action_Subject.build().perform();
		//Hobbies 
		Actions action_Hoobbies =new Actions(driver);
		WebElement checkBox= driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		action_Hoobbies.click(checkBox);
		action_Hoobbies.build().perform();
		//Upload Image
		Actions action_UploadImage =new Actions(driver);
		WebElement uploadImage= driver.findElement(By.id("uploadPicture"));
		uploadImage.sendKeys("C:\\Users\\Admin\\Pictures\\Saved Pictures\\one.png");
		//action_UploadImage.sendKeys(uploadImage, "C:\\Users\\Admin\\Pictures\\Saved Pictures\\one.png");
		action_UploadImage.build().perform();
		//driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Admin\\Pictures\\Saved Pictures");
		//City
		driver.findElement(By.id("currentAddress")).sendKeys("Roha ,Maharashtra");
		//State
		Actions action_State =new Actions(driver);
		driver.findElement(By.id("react-select-3-input")).sendKeys("Maharashtra");
		//state.click();
		action_State.sendKeys(Keys.ENTER);
		action_State.build().perform();
		//Submit Button
		Actions action_Submit =new Actions(driver);
		WebElement submitButton= driver.findElement(By.id("submit"));
		action_Submit.click(submitButton);	
	}	
}
