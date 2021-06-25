package package1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester055 extends basicsetting{
	
   public static void main (String[] args) throws IOException {
	   
	LocalDateTime ldt = LocalDateTime.now();
	String s1= ldt.toString().replace(":","-");
	System.out.println(s1);
	   
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   
	   driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	   
	  WebElement signin= driver.findElement(By.xpath("//button[@class=\"btn__primary--large from__button--floating\"]"));
	  
	  File srcFile= signin.getScreenshotAs(OutputType.FILE);
	  
	   File destFile= new File("./errorshots/"+s1+ ".png");
	   
	   FileUtils.copyFile(srcFile, destFile);
	   
	   
	   
	   
		
	}
	
	

}
