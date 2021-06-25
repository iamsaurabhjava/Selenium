package package1;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester20 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://demo.actitime.com/login.do");
			System.out.println(driver.getTitle());		
			WebElement username = driver.findElement(By.id("username"));
			if(username.isDisplayed()) {
				System.out.println("Username Text field is Displayed");
			}else {
				System.out.println("Username Text field is not Displayed");
			}

			WebElement password=driver.findElement(By.name("pwd"));
			if(password.isDisplayed()) {
				System.out.println("Password text field is Displayed");
			}else {
				System.out.println("Password text field is not Displayed");
			}

			WebElement loginButton=driver.findElement(By.id("loginButton"));
			if(loginButton.isDisplayed()) {
				System.out.println("LoginButton is Displayed");	

			}else {
				System.out.println("LoginButton is not Displayed");
			}
			username.sendKeys("admin");
			password.sendKeys("manager");
			loginButton.click();
			
			Thread.sleep(4000);
			try {
				WebElement logoutlink=driver.findElement(By.id("logoutLink"));
				if(logoutlink.isDisplayed()) {
					System.out.println("Home Page is displayed");
				}else {
					System.out.println("Home Page is not displayed");
					
				}
			}catch (NoSuchElementException e) {
				System.out.println("element is not present");
			}
}
}

