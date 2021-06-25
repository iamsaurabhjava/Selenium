package practise;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		TakesScreenshot ts= (TakesScreenshot) driver;//downcasting
		
		String dateStamp = Calendar.getInstance().getTime().toString().replace(":", ".").replace(" ", ".");
		System.out.println(dateStamp);
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshot/"+dateStamp+".png");
		
		FileUtils.copyFile(srcFile, destFile);
		
		
		

	}

}
