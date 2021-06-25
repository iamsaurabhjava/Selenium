package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("irristable19@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("saurabhkumarfacebook");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@type=\"search\"]"));
		search.sendKeys("Abhisek Gupta");
		
		WebElement abhisek = driver.findElement(By.xpath("//span[text()='Abhisek']"));
		abhisek.click();
		
		WebElement messageIcon = driver.findElement(By.xpath("//span[text()='Message']"));
		messageIcon.click();
		
		WebElement msgbox = driver.findElement(By.xpath("//div[@class='ntk0jbrt pfnyh3mw']/../../..//div[@class='_1mf _1mj']"));
		msgbox.click();
		
		msgbox.sendKeys("This message has been sent to you by automation script,By Roll number 1",Keys.ENTER);

	
	
	}

}
