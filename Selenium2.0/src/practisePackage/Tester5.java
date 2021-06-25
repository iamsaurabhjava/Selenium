package practisePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//was to verify the URL of the current page. 
public class Tester5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		String expectedURL="https://www.amazon.in/";
		
		String currentURL=driver.getCurrentUrl();
		
		if(expectedURL.equals(currentURL)) {
			System.out.println("Test case is pass");
		}else {
			System.out.println("Test case is fail");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
