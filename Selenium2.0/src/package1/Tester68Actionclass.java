package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/* was to perform double click on + button . because it takes double click to go frm 1 to 2.  */
public class Tester68Actionclass extends basicsetting{
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://live.skillrary.com/testing-app/product.php?product=selenium-training");
		
		WebElement addButton=driver.findElement(By.id("add"));
		
		Actions action = new Actions(driver);
		action.doubleClick(addButton);
		action.perform();
		
		

}
}