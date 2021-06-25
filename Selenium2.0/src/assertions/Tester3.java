package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//here when the assertion fails it wont execute remaining statement as it is hard assert
//to execute the remaining statements when the asserted fails we should go for soft asset.
public class Tester3 {
	@Test
	public static void title() {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	String expectedTitle="actiTime -log";
	String actualTitle= driver.getTitle();
	
	Assert.assertEquals(actualTitle, expectedTitle);
	
	System.out.println("hello guys");	

 }
}
