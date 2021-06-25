package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tester71Actionclass extends basicsetting{//was to perform drag and drop in dhtml goodies.com //
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement washington=driver.findElement(By.id("box3"));
		 WebElement unitedstates=driver.findElement(By.id("box103"));
		 
		 WebElement seoul=driver.findElement(By.id("box5"));
		WebElement southKorea=driver.findElement(By.id("box105"));
		
		WebElement madrid=driver.findElement(By.id("box7"));
		WebElement spain=driver.findElement(By.id("box107"));
		 
		  Actions action= new Actions(driver);
		  
		  action.dragAndDrop(washington, unitedstates);
		  action.dragAndDrop(seoul, southKorea);
		  action.dragAndDrop(madrid, spain);
		  
		  action.perform();
		 
}
}
