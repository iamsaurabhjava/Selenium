package practisePackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("file:///D:/Java%20Programs/index3.html");
		
	 WebElement	javalistbox =driver.findElement(By.id("Java"));
	 
	   			Select select = new Select(javalistbox);
	   			 List<WebElement> option = select.getOptions();
	   					
	   	for(WebElement list: option) {
	   		System.out.println(list.getText());
	   	}
	 		
		
	}

}
