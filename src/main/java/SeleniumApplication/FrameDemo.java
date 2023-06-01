package SeleniumApplication;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tinymce");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("count of Frames==>"+ frames.size());
		WebElement target = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(target);
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("ajay"); 
		driver.switchTo().defaultContent();
		//run perfectly
				
	}

}
