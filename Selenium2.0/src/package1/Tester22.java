package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester22 extends basicsetting{
	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	WebElement username= driver.findElement(By.id("username"));
	username.clear();
	username.sendKeys("QSP");
	

}
}
