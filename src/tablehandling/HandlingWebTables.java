package tablehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWebTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//RAMU PULLURI//eclipse-workspace//Selenium//chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("file:///C:/Users/RAMU%20PULLURI/Documents/Html_Table.html");
		
		System.out.println(driver.getCurrentUrl());
		
		int r= driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		
		System.out.println("rows"+r);
		
		int c=driver.findElements(By.xpath("/html/body/table/tbody/tr/th")).size();
		
		System.out.println("column"+c);
		
		for(int i=2;i<=r;i++) {
			
			for(int j=1;j<=c;j++)
			{
				
				System.out.print(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText()+ "  ");
			}
			System.out.println();
		}
		
		//driver.close();

	}

}
