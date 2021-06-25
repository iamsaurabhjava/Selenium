package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tester72Actionclass extends basicsetting{
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		WebElement amazonpay=driver.findElement(By.linkText("Amazon Pay"));
		
		Actions action= new Actions(driver);
		//was to perform control click on amazon pay in amazon website.//
		 action.keyDown(Keys.CONTROL);
		 action.click(amazonpay);
		 action.keyUp(Keys.CONTROL);
		 
		 action.perform();

}
}
