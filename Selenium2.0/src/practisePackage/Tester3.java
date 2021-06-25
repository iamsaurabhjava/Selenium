package practisePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//was to verify the title of the web page amazon.//
public class Tester3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		String actualTitle= driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test case is passed");
		}else {
			System.out.println("Test case is failed");
		}
		
	}

}
