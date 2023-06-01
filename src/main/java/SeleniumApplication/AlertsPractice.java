package SeleniumApplication;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver practice = new ChromeDriver();
		practice.get("https://demo.automationtesting.in/Alerts.html");
		practice.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		practice.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(4000);
		Alert mayur=practice.switchTo().alert();
		mayur.accept();
		
		practice.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		practice.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Thread.sleep(4000);
		practice.switchTo().alert().dismiss();
		
		practice.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		practice.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Thread.sleep(4000);
		Alert abhi=practice.switchTo().alert();
		String sonal=mayur.getText();
		System.out.println(sonal);
		abhi.sendKeys("abhi should get the job asap");
		abhi.accept();
		practice.close();
		//first nd second runs
		//third is not printing the text
		
	}

}
