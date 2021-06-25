package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester46 extends basicsetting{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		String expectedTagname="ing";
		String actualTagname=driver.findElement(By.xpath("//img[@title=\"Flipkart\"]")).getTagName();
		
		if(actualTagname.equals(expectedTagname)) {
			System.out.println("Flipkart logo is an image");
			
		}else {
			System.out.println("Flipkart logo is an image");
			
		}
		

}
}
