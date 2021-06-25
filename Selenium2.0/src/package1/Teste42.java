package package1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste42 extends basicsetting{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username=driver.findElement(By.id("username"));
		  Dimension dim = username.getSize();
		
	System.out.println("Width of username textfield= " + dim.getWidth());
	System.out.println("Height of username textfield= " + dim.getHeight());
	
	WebElement password= driver.findElement(By.name("pwd"));
	Dimension pt = password.getSize();
	
	System.out.println("Width of password textfield= " + dim.getWidth());
	System.out.println("Height of password textfield= " + dim.getHeight());
	
	driver.close();
		

}
}
