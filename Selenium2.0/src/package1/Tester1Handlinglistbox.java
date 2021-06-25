package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester1Handlinglistbox extends basicsetting{//was to provide all the options present in textbox
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Java%20Programs/index3.html");
		
		WebElement javalistbox = driver.findElement(By.id("Java"));
		
		Select select = new Select(javalistbox);
		
		List< WebElement > options = select.getOptions();
		
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
}
}
