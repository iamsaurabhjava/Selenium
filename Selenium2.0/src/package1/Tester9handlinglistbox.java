package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester9handlinglistbox extends basicsetting{
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Java%20Programs/index3.html");
		
		WebElement manuallistbox=driver.findElement(By.id("Manual"));
		
		Select select = new Select(manuallistbox);
		
		List<WebElement> options = select.getOptions();
		for(WebElement WebElement:options) {
			select.selectByValue(WebElement.getAttribute("Value"));
			Thread.sleep(2000);
		}
		
		List<WebElement> selectedoptions=select.getAllSelectedOptions();
		for(WebElement WebElement:selectedoptions) {
			System.out.println(WebElement.getText());
			Thread.sleep(5000);
		}
		driver.close();
}
}
