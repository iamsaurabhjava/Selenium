package practisePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		String actualTitle= driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test case is passes");
		}else {
			System.out.println("Test case is failed");
		}
		Thread.sleep(30000);
		driver.close();
	}

	
}