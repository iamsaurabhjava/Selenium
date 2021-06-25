package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester36 extends basicsetting{
	
	public static void main(String[] args){

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@name=\"sex\" and @value=\"1\"]"));
		radiobutton.click();
		
		if (radiobutton.isSelected()) {
			System.out.println("RadioButton is selected");
			
		}else {
			System.out.println("RadioButton is not selected");
		}
	driver.close();

}
}
