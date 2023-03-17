package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;

public class Base {

	public WebDriver driver;
	public void setup() {
		
		
		
		try {
			System.setProperty("webdriver.chrome.driver","C:/Users/RAMU PULLURI/Workspace/CucumberJava/drivers/chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver(option);
			
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			driver.get("https://www.saucedemo.com/");
			
			driver.manage().window().maximize();
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}

		
	}
	
	
	
}
