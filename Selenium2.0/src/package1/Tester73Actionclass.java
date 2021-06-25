package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester73Actionclass extends basicsetting{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://trello.com/en/login");
		
		driver.findElement(By.id("user")).sendKeys("santosh.shriramoj3024@gmail.com");
		WebElement passwordtextfield=driver.findElement(By.id("password"));
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.invisibilityOf(passwordtextfield));
		
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("santosh24");
		driver.findElement(By.id("login-submit")).click();
		
		driver.findElement(By.xpath("//div[@class=\"board-tile-details is-badged\"]")).click();
}
}
