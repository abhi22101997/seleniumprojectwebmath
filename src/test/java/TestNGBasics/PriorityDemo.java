package TestNGBasics;

import org.testng.annotations.Test;

public class PriorityDemo {
	@Test (priority = 1)
	public void zebra() {
		System.out.println("zebra");
	}
	@Test (priority = 2)
	public void apple() {
		System.out.println("apple");
	}

}
