package SeleniumApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxesRadioButtonDemo {

	public static void main(String[] args) {
		WebDriver box = new ChromeDriver();
		box.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement Checkbox1=box.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		System.out.println(Checkbox1.isDisplayed());
		System.out.println(Checkbox1.isEnabled());
		System.out.println(Checkbox1.isSelected());
		
		WebElement Checkbox2=box.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		System.out.println(Checkbox2.isDisplayed());
		System.out.println(Checkbox2.isEnabled());
		System.out.println(Checkbox2.isSelected());
		//run successfully
		
	}
}
