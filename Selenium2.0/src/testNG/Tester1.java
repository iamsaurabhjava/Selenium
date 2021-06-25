package testNG;

import org.junit.Test;
import org.testng.Reporter;

public class Tester1{
	
	@Test
	public void login(){
		Reporter.log("This is login method",true);
	}
}

