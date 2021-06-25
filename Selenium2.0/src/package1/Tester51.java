package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester51 extends basicsetting{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://live.skillrary.com/testing-app/login.php?type=login");
		
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();
		
		driver.navigate().to("https://live.skillrary.com/testing-app/admin/sales.php");
		
		WebElement previousButton= driver.findElement(By.id("example1_previous"));
		
		String value= previousButton.getAttribute("class");
		
		if(value.contains("gray")||value.contains("disabled")){
			System.out.println("Element is disabled");
			
			}else {
				System.out.println("Element is enabled");	
			}
}
}