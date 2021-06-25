package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tester10 {
		@Test
		public void launch() {
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
		
		}
}


