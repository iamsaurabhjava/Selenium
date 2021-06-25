package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester38 extends basicsetting{
	
	public static void main(String[] args){

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedTooltip="Username";// this is requirement
		
		String actualTooltip= driver.findElement(By.id("username")).getAttribute("placeholder");//verification
		
		if(actualTooltip != null) {
			
			if(actualTooltip.equals(expectedTooltip)) {
				System.out.println("PlaceHolder displayed");
			}else {
				System.out.println("PlaceHolder is not displayed");				
			}
		}else {
			System.out.println("Element is not present...");
		}
	}
}
