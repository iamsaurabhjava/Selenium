package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester24 extends basicsetting{

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.xpath("//button[@class=\"button buttonBlue\"]")).submit();
		
}
}
