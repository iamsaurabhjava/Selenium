package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester5Handlinglistbox extends basicsetting{
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Java%20Programs/index3.html");
		
		WebElement manuallistbox=driver.findElement(By.id("Manual"));
		Select select = new Select(manuallistbox);
		
		if(select.isMultiple()) {
			System.out.println("This is multiselect listbox");
		}else {
			System.out.println("This is single Select listbox");
		}

}
}