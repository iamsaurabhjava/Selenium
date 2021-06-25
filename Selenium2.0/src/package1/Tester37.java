package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester37 extends basicsetting{
	public static void main(String[] args){

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedTooltip="Do not select if this computer is shared";// this is requirement
		
		String actualTooltip= driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");//verification
		
		if(actualTooltip != null) {
			
			if(actualTooltip.equals(expectedTooltip)) {
				System.out.println("Tool tip displayed corretly");
			}else {
				System.out.println("Tool tip is not displayed corretly");				
			}
		}else {
			System.out.println("Element is not present...");
		}
	}
}
