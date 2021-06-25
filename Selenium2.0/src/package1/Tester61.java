package package1;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Tester61 extends basicsetting{
	//to perform action on hidden element on face-book application - JavascriptExecutor
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.linkText("Create New Account")).click();
			
			WebElement genderTextfield = driver.findElement(By.name("custom_gender"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].value='Qspider';", genderTextfield);
		}
	}

