package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title 
{
     
    public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				System.out.println(driver.getTitle());

}
}