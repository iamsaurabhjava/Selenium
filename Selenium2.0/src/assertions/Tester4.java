package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//tester 15 of copy
public class Tester4 {
	@Test
	public static void title() {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://demo.actitime.com/login.do");
	
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	String expectedTitle="actiTime- Log";
	String actualTitle= driver.getTitle();
	
	SoftAssert softassert= new SoftAssert();
	
	softassert.assertEquals(actualTitle,expectedTitle);
	
	System.out.println("hello-guys");
	softassert.assertAll();
	
	

}
}
