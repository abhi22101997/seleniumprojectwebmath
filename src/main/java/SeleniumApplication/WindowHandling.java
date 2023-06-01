package SeleniumApplication;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/practiceform/");
		//when you want to paste the title of the window
		System.out.println("title of the page"+driver.getTitle());
		//when you want to paste the window id
		System.out.println("id of the page"+driver.getWindowHandle());
	//	driver.findElement(By.xpath("//*[@id="main-nav"]/li[6]/a/span")).click();
		driver.findElement(By.id("button1")).click();
		//at this point child window is also present
		//identify the id of parent and child window
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String pwindowid = it.next();
	    String cwindowid = it.next();
	    System.out.println("pwindowid"+pwindowid);
	    System.out.println("cwindowid"+cwindowid);
	    driver.switchTo().window(cwindowid);
	    System.out.println("print id of c"+driver.getTitle());	
	}
}


