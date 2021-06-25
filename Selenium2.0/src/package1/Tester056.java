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

public class Tester056 extends basicsetting{
	
	public static void main(String[] args) throws IOException {
		
		LocalDateTime ldt= LocalDateTime.now();
		String s1= ldt.toString().replace(":","-");
		System.out.println(s1);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.cricbuzz.com/");
		
		WebElement image=driver.findElement(By.xpath("//img[@itemprop=\"image\" and @title=\"Cricbuzz Logo\"]"));
		
		File srcFile = image.getScreenshotAs(OutputType.FILE);
		
		File desFile= new File("./errorshots/"+s1+".png");
		
		FileUtils.copyFile(srcFile, desFile);	
		
	}
}
