package practise;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

	    WebElement cancelButton = driver.findElement(By.xpath("//button[text()='✕']"));	
	    cancelButton.click();
	    
	    Actions actions = new Actions(driver);
	    WebElement mouseHovering = driver.findElement(By.partialLinkText("Fashion"));
	    actions.moveToElement(mouseHovering);
	    actions.perform();
	    
	    WebElement menShirts = driver.findElement(By.linkText("Men's Casual Shirts"));
	    menShirts.click();
	    
	    List<WebElement> allItems = driver.findElements(By.xpath("//div[@class=\"_2WkVRV\"]"));
	    for (WebElement Item : allItems ) {
	    	System.out.println(Item.getText());			
		}
	    
	    TakesScreenshot ts= (TakesScreenshot)driver;//downcasting
	    
	    String webpageScreenShot = Calendar.getInstance().getTime().toString().replace(":", ".").replace(" ", ".");
		System.out.println(webpageScreenShot);
		
	    File srcFile =ts.getScreenshotAs(OutputType.FILE);
        File destFile= new File("./screenshot/"+ webpageScreenShot+ ".png");
       
        FileUtils.copyFile(srcFile, destFile);
	}
}