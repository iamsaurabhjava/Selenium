package practise;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");

		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();

		for (String window : allWindow) {
			if(!parentWindow.equals(window)) {
				driver.switchTo().window(window);
				driver.close();
			}			
		}
		driver.switchTo().window(parentWindow);
		
		Actions action = new Actions(driver);
		WebElement services = driver.findElement(By.xpath("(//div[text()='Services'])[1]"));//("(//div[text()='Services'])[1]"))
		action.moveToElement(services);
		action.perform();
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Marketing")));

		WebElement marketing = driver.findElement(By.linkText("Marketing"));
		marketing.click();
		
		Set<String> allPage = driver.getWindowHandles();
		for (String page : allPage) {
			if(!page.equals(parentWindow)){
				driver.switchTo().window(page);				
			}			
		}
		
		 List<WebElement> courses = driver.findElements(By.xpath("//a[@class=\"tag\"]"));
		 for (WebElement webElement : courses) {
			System.out.println(webElement.getText());
		}
		
	}
}





























//		Set<String> allPage = driver.getWindowHandles();
//		
//		for (String page : allPage) {
//			if (!page.equals(parentWindow)) {
//				driver.switchTo().window(page);
//			}
//		}		
//		
//		List<WebElement> courses = driver.findElements(By.xpath("//a[@class='tag']"));
//		for (WebElement item : courses) {
//			System.out.println(item.getText());
//		}










