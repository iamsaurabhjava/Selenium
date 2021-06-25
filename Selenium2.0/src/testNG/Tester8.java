package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester8 {
	@Test(groups= {"regression","smoke"})
	public void login()
	{
		Reporter.log("login", true);
	}
	@Test(groups= {"regression"})
	public void createUser()
	{
		Reporter.log("createUser", true);
	}
	@Test(groups= {"regression"})
	public void logout()
	{
		Reporter.log("logout",true);
	}
	@Test(groups= {"regression","smoke"})
	public void deleteuser()
	{
		Reporter.log("deleteUser",true);
	}
	
	

}
