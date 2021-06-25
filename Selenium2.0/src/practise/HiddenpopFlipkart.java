package practise;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenpopFlipkart {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		WebElement popup = driver.findElement(By.xpath("//button[text()='✕']"));
		popup.click();
		
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.sendKeys("APPLE iPhone 12 (Purple, 128 GB)", Keys.ENTER);
		WebElement iphone = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Purple, 128 GB)']"));
		iphone.click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for (String window : allWindow) {			
			if (!parentWindow.equals(window)) {			
				driver.switchTo().window(window);
			}
		}
		
		WebElement modelName = driver.findElement(By.xpath("//span[text()='APPLE iPhone 12 (Purple, 128 GB)']"));
		System.out.println(modelName.getText());
	
		WebElement price = driver.findElement(By.xpath("//div[text()='₹84,900']"));
		System.out.println(price.getText());
		
		
	}

}
