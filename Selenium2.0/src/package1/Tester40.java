package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Tester40 extends basicsetting{
	
	public static void main(String[] args){

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		String colorvalue= driver.findElement(By.id("username")).getCssValue("color");
		 
		System.out.println(colorvalue);
		
		String expectedhexadecimalCode="#000000";
		String actualHexadecimalCode=Color.fromString(colorvalue).asHex();
		System.out.println(actualHexadecimalCode);
		
		if(actualHexadecimalCode.equals(expectedhexadecimalCode)) {
			System.out.println("Test case is passed");
			
		}else {
			System.out.println("Test case is failed");
			
		}

}
}
