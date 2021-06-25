package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester77iframe extends basicsetting{
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Java%20Programs/Index2.html");
		//this version of frame is used to transfer the control of a frame by locating the "frame"
		WebElement frame= driver.findElement(By.id("frameid"));
				
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("username")).sendKeys("Qspiders");

}
}
