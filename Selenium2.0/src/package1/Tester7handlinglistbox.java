package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//was to "select" and "deselect" all the options in multiselect listbox//

public class Tester7handlinglistbox extends basicsetting{
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Java%20Programs/index3.html");
		WebElement manuallistbox=driver.findElement(By.id("Manual"));
		Select select = new Select(manuallistbox);
		
		List<WebElement> options = select.getOptions();
		
		for(WebElement option: options) {
			select.selectByValue(option.getAttribute("value"));
			Thread.sleep(2000);
		}
		for(WebElement option: options) {
			select.deselectByValue(option.getAttribute("value"));
			Thread.sleep(2000);
		}
		for(WebElement option: options) {
			select.selectByVisibleText(option.getText());
			Thread.sleep(2000);
		}
		for(WebElement option: options) {
			select.deselectByVisibleText(option.getText());
			Thread.sleep(2000);
		}
		for(int i=0;i<options.size();i++) {
			select.selectByIndex(i);
		}
		for(int i=0;i<options.size();i++) {
			select.deselectByIndex(i);
		}
		for(WebElement option: options) {
			select.deselectByVisibleText(option.getText());
		}
		select.deselectAll();
		driver.close();

}
}
