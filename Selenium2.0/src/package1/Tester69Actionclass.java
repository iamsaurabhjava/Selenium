package package1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//was to perform mousehovering by using overload.moveToElement(element,x,y) method in actitime.app . 

public class Tester69Actionclass extends basicsetting{
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.actitime.com/");
		
		WebElement pricing= driver.findElement(By.linkText("Pricing"));
		
		Dimension dim = pricing.getSize();
		int centreY = dim.getHeight()/2; 
		int centreX = dim.getWidth()/2;
		
		Actions action= new Actions(driver);
		action.moveToElement(pricing, centreX+100, centreY);
		action.perform();
		

}
}
