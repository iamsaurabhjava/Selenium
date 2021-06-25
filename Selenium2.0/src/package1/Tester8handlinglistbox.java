package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester8handlinglistbox extends basicsetting{
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement monthslistbox=driver.findElement(By.id("month"));
		
		Select select = new Select(monthslistbox);
		
		List<WebElement> options = select.getOptions();
		for(WebElement option:options) {
			select.selectByValue(option.getAttribute("Value"));
		}
		


}
}
