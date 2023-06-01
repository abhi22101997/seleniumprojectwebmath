package TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLParameters {
	@Parameters({"username","password"})
	@Test
	public void login(String uname,String pwd) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("uname");
		driver.findElement(By.id("pass")).sendKeys("pwd");
		driver.findElement(By.id("u_0_9_UJ")).click();
	}

}
