package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Tester41 extends basicsetting{
	
	public static void main(String[] args){

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		String actualfontWeight= driver.findElement(By.id("adminCredentialHeader")).getCssValue("font.weight");
		String expectedfontWeight="700";
		
		if(actualfontWeight.equals(expectedfontWeight)) {
			System.out.println("Administrative text is bold");
		}else {
			System.out.println("Administrative text is not bold");
		}
		
		

}
}
