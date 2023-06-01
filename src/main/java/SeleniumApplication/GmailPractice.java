package SeleniumApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailPractice {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S721658487%3A1683794675120284&authuser=0&continue=https%3A%2F%2Fmail.google.com&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		driver.findElement(By.name("Passwd")).sendKeys("Testpassword");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		//run perfectly
	}

}
