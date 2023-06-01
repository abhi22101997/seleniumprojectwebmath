package TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {
	@Test(dataProvider = "getdata")
	public void fblogin(String abhi,String shek) {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(abhi);
		driver.findElement(By.id("pass")).sendKeys(shek);
		driver.findElement(By.name("login")).click();
	}
	@DataProvider
	public Object[][] getdata() {
		Object[][]data = new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="ajay";
		data[1][1]="ajay123";
		
		data[2][0]="hr";
		data[2][1]="hr123";
		return data;
		//run perfectly
		
		
		
	}

}
