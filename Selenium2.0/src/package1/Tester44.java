package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester44 extends basicsetting{
	 public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://demo.actitime.com/login.do");
			
			WebElement password= driver.findElement(By.name("pwd"));
			Point pt = password.getLocation();
			
			System.out.println(pt.getX());
						
			WebElement username= driver.findElement(By.id("username"));
			 Point un=username.getLocation();
			 
			 System.out.println(un.getX());
			 
			 if (pt.getX()==un.getX()) {
					System.out.println(" The Distance is same");
					
				}else {
					System.out.println(" The Distance is different");
				}
				
			 
			

}
}
