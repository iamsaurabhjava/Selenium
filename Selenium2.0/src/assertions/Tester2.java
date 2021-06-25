package assertions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tester2 {
	
	@Test
	public static void title() {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://demo.actitime.com/login.do");
	
	WebElement username= driver.findElement(By.id("username"));
	
	Assert.assertTrue(username.isDisplayed());
	
	

}
}
