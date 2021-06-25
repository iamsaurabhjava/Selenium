package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester5 extends basicsetting
 {      
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String expectedURL=("https://www.flipkart.com/");
		String actualURL=driver.getCurrentUrl();
		
		if(actualURL.equals(expectedURL)) {
			System.out.println("Test Case is Passed");
		}else {
			System.out.println("Test Case is Failed");
		}
		driver.close();
		

}
}