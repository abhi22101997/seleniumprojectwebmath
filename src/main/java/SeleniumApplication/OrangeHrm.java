package SeleniumApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {
	public static void main(String[] args) {
		WebDriver orange = new ChromeDriver();
		orange.get("https://www.orangehrm.com/contact-sales/");
		WebElement Dropdown=orange.findElement(By.id("Form_getForm_Country"));
		Select obj = new Select(Dropdown);
		obj.selectByVisibleText("Australia");
		//run successfully
		list();
	}
	public static void list() {
		WebDriver orange = new ChromeDriver();
		orange.get("https://www.orangehrm.com/contact-sales/");
		WebElement country=orange.findElement(By.name("Country"));
		List<WebElement>options = country.findElements(By.tagName("option"));
		System.out.println(options.size());
		for(int i=0; i<options.size();i++) {
			System.out.println(options.get(i).getText());
			//run successfully
		}
		
		
	}
}
