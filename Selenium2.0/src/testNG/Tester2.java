package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester2{
	
	@Test(priority=5)
	public void animal() {
		Reporter.log("This is animal method", true);
	}
	
	@Test(priority=2)
	public void Animal() {
		Reporter.log("This is Animal method", true);
	}
	
	@Test (priority=4)
	public void Bird() {
		Reporter.log("This is Bird method", true);
	}
	
	@Test(priority=1)
	public void lion() {
		Reporter.log("This is lion method", true);
	}
	
	@Test(priority=3)
	public void cheetah() {
		Reporter.log("This is cheetah method", true);
	}


}


