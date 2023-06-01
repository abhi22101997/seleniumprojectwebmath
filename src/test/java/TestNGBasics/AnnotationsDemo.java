package TestNGBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("open the browser");
		System.out.println("launch the application");
	}
	@Test
	public void validatetitle() {
		System.out.println("validate the title");

	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("close the browser");
		
	}

}
