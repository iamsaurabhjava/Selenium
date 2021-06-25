package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//use to transfer control to a frame based on id or frame//

public class Tester76iframe extends basicsetting{
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Java%20Programs/Index2.html");
		
		driver.switchTo().frame("frameid");
		driver.findElement(By.id("username")).sendKeys("Qspiders");

}
}
