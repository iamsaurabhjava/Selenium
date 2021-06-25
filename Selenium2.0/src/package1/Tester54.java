package package1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester54 {
	public static void main(String[] args)throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		LocalDateTime ldt= LocalDateTime.now();
	           String s1= ldt.toString().replace(":","-");
	           System.out.println(s1);
	           
	           WebDriver driver= new ChromeDriver();
	           driver.manage().window().maximize();
	           driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	           
	           driver.get("https://in.linkedin.com/");
	           
	           TakesScreenshot ts= (TakesScreenshot) driver;
	           File srcFile= ts.getScreenshotAs(OutputType.FILE);
	           
	           File destFile= new File("./errorshots/"+s1+".png");
	           
	           FileUtils.copyFile(srcFile, destFile);
	           driver.close();
	           
	           
	           
	           
	                     
	}

}
