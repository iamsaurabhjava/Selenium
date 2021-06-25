package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester3 {
	
	@Test
	public void login() {
		Reporter.log("This is login method" , true);
		System.out.println();
	}

	
	 @Test(invocationCount=2)
	 public void createUser() {
		 Reporter.log("This is createUser method", true);
		 System.out.println();
	 }

}
