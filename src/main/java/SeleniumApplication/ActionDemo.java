package SeleniumApplication;

//import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
	public static void main(String[] args) {
	//	hover();
		//keyboardevents();
	//	clicks();
		scrolling();
	}
public static void hover() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAjwge2iBhBBEiwAfXDBR3zeDlI23zyjhZRSoHpE_ZLrHHj5b7SRXtXYVjIhzKycsXV9Wk2pNhoC5h8QAvD_BwE");
	WebElement kidsmenu = driver.findElement(By.xpath("//a[text()='Kids'][1]"));
	Actions act = new Actions(driver);
	act.moveToElement(kidsmenu).build().perform();
}
public static void keyboardevents() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("abhishek");
	Actions act = new Actions(driver);
	act.keyDown(Keys.TAB).perform();
}
public static void clicks() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Actions act = new Actions(driver);
	WebElement username= driver.findElement(By.id("email"));
	act.scrollToElement(username).perform();
	
	
	
	
	
	
}
public static void scrolling() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinprimeexpt5-21&ascsubtag=_k_CjwKCAjwge2iBhBBEiwAfXDBR1nHh2q5M-DubvmZ0jYtIme_zfl7xJTNjFGVjmHrT53GDJiS_BN0BxoCIQYQAvD_BwE_k_&gclid=CjwKCAjwge2iBhBBEiwAfXDBR1nHh2q5M-DubvmZ0jYtIme_zfl7xJTNjFGVjmHrT53GDJiS_BN0BxoCIQYQAvD_BwE");
	Actions act = new Actions(driver);
	WebElement target= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/div/div[1]/h2/span"));
	act.scrollToElement(target).perform();
	
}
//run perfect
}
