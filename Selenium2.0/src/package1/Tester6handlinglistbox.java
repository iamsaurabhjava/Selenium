package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//was to select and deselect options in multisellect listbox

public class Tester6handlinglistbox extends basicsetting{
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Java%20Programs/index3.html");
		
		WebElement manuallistbox=driver.findElement(By.id("Manual"));
		Select select = new Select(manuallistbox);
		
		select.selectByIndex(0);
		Thread.sleep(2000);
		
		select.deselectByIndex(0);
		Thread.sleep(2000);
		
		select.selectByValue("s");
		Thread.sleep(2000);
		
		select.deselectByValue("s");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Exploratory");
		Thread.sleep(2000);
		
		select.deselectByVisibleText("Exploratory");
		Thread.sleep(2000);
		
		driver.close();

}
}
