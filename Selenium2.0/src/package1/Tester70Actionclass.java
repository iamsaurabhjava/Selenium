package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// was to perform mouse hovering in actitime by moveoffset method using coordinates .

public class Tester70Actionclass extends basicsetting{
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.actitime.com/");
		
		Actions action= new Actions(driver);
		action.moveByOffset(994,38);
		action.perform();

}
}
