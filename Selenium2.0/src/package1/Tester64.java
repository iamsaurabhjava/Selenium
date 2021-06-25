package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester64 extends basicsetting{
// to perform click on check-box by using boolean and click() function - JavascriptExecutor
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("arguments[0].checked='true';", checkbox);
		
		js.executeScript("arguments[0].click()", checkbox);
	}
}