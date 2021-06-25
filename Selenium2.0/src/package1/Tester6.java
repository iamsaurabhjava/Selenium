package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester6 
{
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();//to maximize the current window
		Thread.sleep(5000);
		driver.manage().window().fullscreen();//converts current window into full screen window().fullscreen(); 
		Thread.sleep(5000);
		driver.close();
		
		
		
	}
	

}
