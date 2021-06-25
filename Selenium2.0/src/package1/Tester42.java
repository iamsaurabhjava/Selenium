package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester42 extends basicsetting{

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://demo.actitime.com/login.do");
			String actualCursorValue = driver.findElement(By.id("username")).getCssValue("cursor");
			System.out.println("Actual cursor value = "+actualCursorValue);
			String expectedCursorValue = "text";
			
			if (actualCursorValue.equals(expectedCursorValue)) {
				System.out.println("Verified = Cursor value of username is text.");
			}else {
				System.out.println("Cursor value of username is other then text.");
			}
		}
	}


