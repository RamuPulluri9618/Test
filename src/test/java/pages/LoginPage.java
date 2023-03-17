package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver= driver;
	}

	private By username = By.xpath("//input[@id='user-name']");

	private By password = By.xpath("//input[@id='password']");

	private By clickbtn = By.xpath("//input[@id='login-button']");
	
	
	private By optnbtn = By.xpath("//button[text()='Open Menu']");
	
	private By logoutbtn = By.xpath("//nav//a[text()='Logout']");
	

	private void enterusername(String uid) {

		driver.findElement(username).sendKeys(uid);

	}

	private void enterpswd(String passwordd) {

		driver.findElement(password).sendKeys(passwordd);

	}
	
	private void click() {

		driver.findElement(clickbtn).click();

	}
	
	public void login(String uid,String passwordd) {
		
		enterusername(uid);
		enterpswd(passwordd);
		click();
	}
	
	public void logout()  {
		
		driver.findElement(optnbtn).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(logoutbtn).click();
	}
	

}
