package Assessment.UrbanLadderAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(" https://www.urbanladder.com/signup");
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class='signup-link authention_popup']")).click();
		driver.findElement(By.xpath("//input[@class='textfiled email rwquired input_authontiction email-suggest']")).sendKeys("kamalnath123@gmail.com");
		driver.findElement(By.xpath("//input[@class='textfiledrequired input_authentication']")).sendKeys("K@mal123ram");
		driver.findElement(By.xpath("//input[@value='signup']")).click();
	}

}
