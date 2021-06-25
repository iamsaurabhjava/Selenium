package package1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester63 extends basicsetting{
// to put value in disabled field and after that clear that text field- JavascriptExecutor
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://live.skillrary.com/testing-app/index.php");
		
		WebElement disabledTextfield = driver.findElement(By.xpath("//input[@class=\"form-control\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value='Qspider';", disabledTextfield);
		
		Thread.sleep(4000);
		
		js.executeScript("arguments[0].value='';", disabledTextfield);
	}
}