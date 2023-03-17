package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class TestLoginWebsite {

	WebDriver driver = null;

	LoginPage login;
	@Given("browser to login")
	public void browser_to_login() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/RAMU PULLURI/Workspace/CucumberJava/drivers/chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(option);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		
	}

	@And("enter url")
	public void enter_url() {
		
		driver.navigate().to("https://www.saucedemo.com/");
		System.out.println("get url" + driver.getTitle());
	}

	@When("enter (.*) and (.*)$")
	public void enter_uid_and_password(String uid,String password) {
		
		 login = new LoginPage(driver);
		
		login.login(uid, password);

		System.out.println("Inside Step : enter uid and password");

	}

	@And("click on signin")
	public void click_on_signin() {

		System.out.println("Inside Step : clicked on signin");

	}

	@Then("user navigate to website")
	public void user_navigate_to_website() {
		
		
		login.logout();
		driver.quit();
		System.out.println("Inside Step : user navigate to website");

	}

}
