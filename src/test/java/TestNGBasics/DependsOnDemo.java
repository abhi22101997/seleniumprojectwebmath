package TestNGBasics;



import org.testng.Assert;
import org.testng.annotations.Test;





public class DependsOnDemo {
	@Test
	public void login() {
		System.out.println("user login successfully");
		//Assert.fail("not logged in");
	}
	@Test (dependsOnMethods = {"login","sendfriendreq"})
	public void acceptfriendreq() {
		System.out.println("accepted");
	}
	@Test
	public void sendfriendreq() {
		System.out.println("sent");
		
	}
	@Test
	public void forgotpassword() {
		System.out.println("forgotten");
	}
	//run successfully

}
