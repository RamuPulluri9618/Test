package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//RAMU PULLURI//eclipse-workspace//Selenium//chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
		//options.addArguments("--headless");
		//options.setHeadless(true);
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/");
		
		System.out.println("Page Title is"+driver.getTitle());
		
		System.out.println("Page Title is"+driver.getTitle());

	}

}
