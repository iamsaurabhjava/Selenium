package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 extends basicsetting{
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
			
			WebElement username= driver.findElement(By.id("username"));
			Point un= username.getLocation();
			System.out.println("Distance of username in y axis= "+un.getY());
			
			Dimension user = username.getSize();
			System.out.println("Width of username textfield= " + user.getWidth());
			System.out.println("Height of username textfield= " + user.getHeight());
			System.out.println();
			
			WebElement password= driver.findElement(By.id("password"));
			Point pt = password.getLocation();
			
			System.out.println("Distance of password in y axis= "+pt.getY());
			
			Dimension pass = password.getSize();

			System.out.println("Width of password textfield= " + pass.getWidth());
			System.out.println("Height of password textfield= " + pass.getHeight());
			
			if (pt.getY()>(un.getY()+user.getHeight())) {
				System.out.println("NO overlapping");
			}else {
				System.out.println("Overlapping is happening");

			}
			
			

}
}
