package TestNGBasics;

import org.testng.annotations.Test;

public class GroupsDemo {
	
	@Test (groups = {"phone"})
	public void mobile() {
		System.out.println("iphone");
	}
	@Test
	public void laptop() {
		System.out.println("lenovo");
	}
	@Test (groups = {"phone"})
	public void mobile1() {
		System.out.println("samsung");
	}
	//if you want to run specific group then right click on project name and covert it to the .xml file
	//then select the group which you want to execute
	//specify the group by using groups run and include name in the .xml file
	//run perfectly

}
