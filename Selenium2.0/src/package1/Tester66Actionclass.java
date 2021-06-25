package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*was to perform mouse hovering and click on [webinar in resource] a element in vtiger app */
public class Tester66Actionclass extends basicsetting{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		driver.get("https://www.vtiger.com/");
		
		WebElement resources=driver.findElement(By.id("navbarDocumentation"));
		
		Actions action = new Actions(driver);
		action.moveToElement(resources);
		action.perform();
		driver.findElement(By.partialLinkText("Webinars")).click();
		


}
}
