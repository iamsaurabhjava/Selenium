package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Tester7 {
	
	@Parameters("browsername")
	@Test
	public void launchBrowser(@Optional("chrome")String name) {
		if(name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--disable-notification");
			
			WebDriver driver= new ChromeDriver(options);	
			
		}else if(name.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			
			FirefoxOptions options= new FirefoxOptions();
			
			options.addPreference("dom.webnotifications.enabled", false);
			WebDriver driver = new FirefoxDriver(options);
		} else {
			System.out.println("invalid username");
		}
		
	}

}
