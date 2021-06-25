package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//not done - will have to ask the teammates about this program.
public class Tester78iframe extends basicsetting{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Java%20Programs/Index2.html");
		
		WebElement frame= driver.findElement(By.id("frameid"));
		
         driver.switchTo().frame(frame);
		
		 driver.findElement(By.id("username")).sendKeys("Qspiders");
		 Thread.sleep(2000);
		 
		 driver.switchTo().parentFrame();//to transfer control from parent to child frame
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("user")).sendKeys("Noida");//enter keys in textfield inside a frame
		 driver.switchTo().frame("frame");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("username")).sendKeys("NSSAI");
		 driver.switchTo().defaultContent();//to transfer control to default webpage from any frame
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("user")).sendKeys("sector3");
		 driver.switchTo().frame("frame");
		 Thread.sleep(2000);
		 
		 driver.navigate().refresh();//to come out of any frame to default webpage
		 

}
}
