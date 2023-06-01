package SeleniumApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
public static void main(String[] args) {
	WebDriver facebook= new ChromeDriver();
	facebook.get("https://www.facebook.com/");
	facebook.findElement(By.cssSelector("#email")).sendKeys("abhi@gmail.com");
	facebook.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("password");
	//facebook.findElement(By.name("login")).click();
	facebook.findElement(By.linkText("Forgotten password?")).click();
	//run successfully
	
}
}
