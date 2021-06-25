package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4 
{      
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
            String actualTitle= driver.getTitle();
			if(actualTitle.equals(expectedTitle)) {
				System.out.println("Test Case is passed");
			}else{
				System.out.println("Test case is failed");
			}
			//driver.close();
			//
		 	//System.out.println(driver.getTitle());
}
}
