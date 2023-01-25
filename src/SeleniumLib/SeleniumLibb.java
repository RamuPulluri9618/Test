package SeleniumLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumLibb {
	
private WebDriver driver;
	public long timewait=30;
	public SeleniumLibb(WebDriver driver) {
		
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	}
	
	public void selectByVisibletext(WebElement element, String text) {
		
		Select se= new Select(element);
		se.selectByVisibleText(text);
			
		
	}
	
	public void scrolldown(WebElement element, String text) {
		
		Select se= new Select(element);
		se.deselectByVisibleText(text);
			
		
	}
	
	public WebElement waitforelementtobeclickable(WebElement ele,Duration timewait) {
		try {
			new WebDriverWait(driver, timewait).until(ExpectedConditions.visibilityOf(ele));
			
		}
		catch(Exception e) {
			}
	
	return null;

}}
