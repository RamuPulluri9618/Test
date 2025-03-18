package webdrivercommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import SeleniumLib.SeleniumLibb;

public class GetComands {
	static SeleniumLibb sib=null;
	static WebDriver driver=null;
	
	static void maincompo() throws Exception {
		
		
		List<WebElement> ab= driver.findElements(By.xpath("//div//nav[@class=\"bm-item-list\"]//a"));
		
		for(WebElement i:ab) {
			
			System.out.println("***Webelemets***"+i);
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		sib= new SeleniumLibb(driver);

		System.setProperty("webdriver.chrome.driver",
				"C://Users//RAMU PULLURI//eclipse-workspace//Selenium//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		//Conditional Commands
		
		if((username.isDisplayed())&&((password.isEnabled()))) {

		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		//isselect is for checking radio buttons and checkbox
		login.click();

		}
		WebElement text = driver.findElement(By.xpath("//span[text()='Products']"));

		String tex=text.getText();
		
		System.out.println(tex);
		
		WebElement textselect = driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		
		sib.selectByVisibletext(textselect, "Price (low to high)");
		WebElement textselect1 = driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		System.out.println("After selecting"+textselect1.getText());
		
		WebElement check=driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]"));
		
		if(check.isDisplayed()) {
		
		Actions action = new Actions(driver);
		action.clickAndHold(check);
		action.click(check);
		}
		Thread.sleep(4000);
		maincompo();	
		
		
		
		//Navigation
		
		/*driver.navigate().to("https://www.youtube.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();*/
		
		
		
		
		
		
		driver.close();

	}

}
