package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
//was to execute test case which is dependent on another test case. 

//By using a parameter called (dependsOnMethods) for @TestAnnotation or methods. 
public class Tester6 {
	
	@Test(priority=1)
	public void login() {
		Reporter.log("login");
	}
	@Test(dependsOnMethods= {"login",},priority=2)
	public void createUser() {
		Reporter.log("createuser");
	}
	@Test(priority=3)
	public void logout() {
		Reporter.log("logout");
	}


}
