package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
//We should use a parameter called as (enabled=false) then that case or method will be disabled.

//was to disable a test case.

public class Tester5 {
	@Test
	public void login() {
		Reporter.log("login");
	}
	@Test(enabled=false)
	public void logout() {
		Reporter.log("logout");
	}

}
