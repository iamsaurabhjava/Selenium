package practisePackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//was to see the pagesource of the actitime , we use this pagesource() method on some of the banking or other websites,
//where right click option is not available to see the pagesource//
public class Tester7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.getPageSource());
		//*System.out.println(driver.getWindowHandle());
		
		//Set<String> windows= driver.getWindowHandles();
		
		//for(String window:windows) {
			//driver.switchTo().window(window);
			//System.out.println(driver.getTitle());
		
	//}
		}

}
