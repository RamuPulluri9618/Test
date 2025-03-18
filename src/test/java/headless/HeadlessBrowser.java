package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class HeadlessBrowser {

	@Test
	public void starttest() {
		WebDriver driver;

		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();

		System.out.println("Page Title is" + driver.getTitle());

		System.out.println("Page Title is" + driver.getTitle());

		driver.close();

	}

//	public static void main(String[] args) {
//
//	}

}
