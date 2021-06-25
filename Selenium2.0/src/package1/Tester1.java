package package1;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("");
	}
}
