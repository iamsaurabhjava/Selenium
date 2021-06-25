package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester35 extends basicsetting{

	public static void main(String[] args){

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox= driver.findElement(By.id("keepLoggedInCheckBox"));
		checkbox.click();
		
		if(checkbox.isSelected()) {
			System.out.println("Checkbox is Selected");
		}else {
			System.out.println("Checkbox is not Selected");
		}

		
}
}
