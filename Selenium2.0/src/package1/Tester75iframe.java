package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//was to control to a frame based on frame//
public class Tester75iframe extends basicsetting{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Java%20Programs/Index2.html");
		
		driver.switchTo().frame("frame");
		driver.findElement(By.id("username")).sendKeys("Qspiders");

}
}