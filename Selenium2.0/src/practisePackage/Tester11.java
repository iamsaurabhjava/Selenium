package practisePackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("file:///D:/Java%20Programs/index3.html");

		WebElement manuallistbox = driver.findElement(By.id("Manual"));
		
		Select select = new Select(manuallistbox);
		List<WebElement> options = select.getOptions();
		for(WebElement option:options) {
			select.selectByValue(option.getAttribute("value"));
			Thread.sleep(2000);
		}
		for(WebElement option:options) {
			select.deselectByValue(option.getAttribute("value"));
			Thread.sleep(2000);	
	}
		for(WebElement option:options) {
			select.selectByVisibleText(option.getText());
		}
		for(WebElement option:options) {
			select.deselectByVisibleText(option.getText());
		}
		for(int i=0;i<options.size();i++) {
			select.selectByIndex(i);
		}
		for(int i=0;i<options.size();i++) {
			select.deselectByIndex(i);
		}
		for(WebElement option:options) {
			select.selectByVisibleText(option.getText());
		}
          select.deselectAll();
          driver.close();


}
}
