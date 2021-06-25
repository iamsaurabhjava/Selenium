package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//upcasting 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");  
		WebElement amazonlogo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;///downcasting
		js.executeScript("arguments[0].scrollIntoView();", amazonlogo);
	}

}
