package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import pom.Swaglabsformating;

public class LoginTest {

	@Test
	public void Testing(){
		// TODO Auto-generated method stub

		WebDriver driver = null;
		try {

			ChromeDriverManager.getInstance().setup();
			driver = new ChromeDriver();

			driver.get("https://www.saucedemo.com/");

			driver.manage().window().maximize();

			WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));

			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

			WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));

			username.sendKeys("standard_user");
			password.sendKeys("secret_sauce");
			login.click();

			Swaglabsformating sl = new Swaglabsformating(driver);
			// sl.selectthedropdown("Price (low to high)");
			sl.checkp();

			String actual_title = "Swag Labs";

//		System.out.println("Page Title is"+driver.getTitle());
			String expected_title = driver.getTitle();

			if (expected_title.equals(actual_title) == true) {

				System.out.println("Login is sucessful");

			}

			else {
				System.out.println("Login is not sucessful");
			}
			
			sl.logout();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			 driver.close();
		}
	}

}
