package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester8 extends basicsetting{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String source=driver.getPageSource();
		
		System.out.println(source);
		if(source.contains("Please identify yourself")) {
			System.out.println("Test case is passed");
		
		}else {
			System.out.println("Test Case failed");
		}
		
		
	}

}
