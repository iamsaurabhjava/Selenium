package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {
public static void main(String[] args) throws Throwable {
		
		/*Date dateObj= new Date();
		System.out.println(dateObj.toString());
		//Wed Jun 23 21:10:17 IST 2021
		// 0   1   2    3      4    5
		
		String todaysDate= dateObj.toString();
		String arr[] = todaysDate.split(" ");
		
		String day=arr[0];
		String month=arr[1];
		String date=arr[2];
		String year=arr[5];
		
		String currentDate= day+" "+month+" "+date+" "+year+" ";
		System.out.println(currentDate);
		*/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");

		WebElement src = driver.findElement(By.id("fromCity"));
		src.sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='BLR']")).click();
		
		WebElement dest = driver.findElement(By.id("toCity"));
		dest.sendKeys("Delhi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='DEL']")).click();
		
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@class=\"'"+currentDate+"'\"]")).click();
		
		
	
		

	}

}


