package uiautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UITest {

	WebDriver driver;
	
	@BeforeMethod()
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/RAMU PULLURI/Workspace/CucumberJava/drivers/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);
        
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		
	}
	
	@Test(priority=1)
	
	public void test1() {
		
		driver.get("https://www.saucedemo.com/");
		
		System.out.println("Title is"+driver.getTitle());
		
		String actualtitle= driver.getTitle();
		
		String expectedtitle= "Swag Labs";
		
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	@Test(priority=2)
	
	public void test2() {
		
		driver.get("https://www.google.com/");
		
		System.out.println("Title is"+driver.getTitle());
		
		String expectedtitle= driver.getTitle();
		
		String actualtitle= "Google";
		
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	@AfterMethod()
	
	public void endtest() {
		
		driver.quit();
		System.out.println("end test");
	}
	
}
