package Selenium.webdriver.basictests;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.Swaglabsformating;

public class LoginTest extends Baseclass{

	@Test
	public void Testing(){
		// TODO Auto-generated method stub

		try {
			
			test = extent.createTest("Test2");

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
			 System.out.println("AM HAPPY");
		}
	}

}
