package testNG;

import org.junit.Test;
import org.testng.Reporter;

public class ta{
	
	@Test
	public void animal() {
		Reporter.log("This is animal method", true);
		
	}
	
	@Test
	public void Animal() {
		Reporter.log("This is Animal method", true);
	}
	
	@Test
	public void Bird() {
		Reporter.log("This is Bird method", true);
	}
	
	@Test
	public void lion() {
		Reporter.log("This is lion method", true);
	}
	
	@Test
	public void cheetah() {
		Reporter.log("This is cheetah method", true);
	}


}
