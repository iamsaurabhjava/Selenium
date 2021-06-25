package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester47 extends basicsetting{
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.banggood.in/BlitzWolfBW-VP6-LCD-Projector-6000-Lux-Full-HD-300-inch-Native-1080P-Projector-50-Keystone-2+5W-Speakers-60Hz-Compatible-TV-Stick-2-HDMI-VGA-PC-TV-Box-for-Outdoor-Movies-Home-Theater-Projector-Beamer-p-1700344.html?rmmds=flashdeals&cur_warehouse=CN&ID=47759");
	WebElement BuynowButton=driver.findElement(By.xpath("//a[@class=\"buy-now-btn gray\"]"));
	if (BuynowButton.isEnabled()) {
	System.out.println("button is Enabled");
	}else{
	System.out.println("button is disabled");
	}
	}

}


