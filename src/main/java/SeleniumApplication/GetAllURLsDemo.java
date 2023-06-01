package SeleniumApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllURLsDemo {
	public static void main(String[] args) {
		WebDriver face= new ChromeDriver();
		face.get("https://www.facebook.com/");
		List<WebElement> urls= face.findElements(By.tagName("a"));
		System.out.println("count"+urls.size());
		for
			(int i =0; i<urls.size(); i++){
				System.out.println(urls.get(i).getText());
			}
		
		
	}

}
