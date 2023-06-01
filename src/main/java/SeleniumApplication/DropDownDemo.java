package SeleniumApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	public static void main(String[] args) {
		WebDriver abhishek= new ChromeDriver();
		abhishek.get("https://the-internet.herokuapp.com/dropdown");
		WebElement Dropdown = abhishek.findElement(By.id("dropdown"));
		Select obj= new Select (Dropdown);
		obj.selectByVisibleText("Option 1");
		
	}

	
	}


