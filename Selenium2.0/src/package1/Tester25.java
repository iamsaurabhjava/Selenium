package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester25 extends basicsetting{
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("manager");
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary btn-block\"]")).submit();

}
}
//In the above script,form tag has action="javascript:void(0);" 
//so it is mandatory to enter data in UserName and pwd textfield,to use submit() 
