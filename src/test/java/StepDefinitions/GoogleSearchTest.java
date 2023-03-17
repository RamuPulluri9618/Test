package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchTest {

	
	WebDriver driver= null;
	
	@Given("browser is open")
	public void browser_is_open() {
	   
		System.out.println("Inside Step - browser is open");
		
//		String projpath= System.getProperty("user.dir");
//		
//		System.out.println("Project path"+projpath);
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/RAMU PULLURI/Workspace/CucumberJava/drivers/chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);
        
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		//System.out.println("browser is opened");
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Inside Step - user is on google search page");
	}

	@When("user enters a text in serach box")
	public void user_enters_a_text_in_serach_box() {
		
		WebElement sendtxt=driver.findElement(By.xpath("//input[@title='Search']"));
		sendtxt.sendKeys("https://www.saucedemo.com/");
		
		System.out.println("Inside Step - user enters a text in serach box");
	}

	@And("hits enter")
	public void hits_enter() {
		WebElement clickbox=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		clickbox.click();
		System.out.println("Inside Step - hits enter");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("get title   "+driver.getTitle());
		driver.close();
		driver.quit();
		System.out.println("Inside Step - user is navigated to search results");
	}

}
