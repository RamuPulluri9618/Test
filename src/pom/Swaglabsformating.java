package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumLib.SeleniumLibb;
import dev.failsafe.internal.util.Assert;

public class Swaglabsformating {

	WebDriver driver=null;
	SeleniumLibb sel=null;
	
	public Swaglabsformating(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@class=\"product_sort_container\"]")
    private WebElement ordershortlist;
	
	@FindBy(xpath="//span[text()='Products']")
    private WebElement txtProducts;
	
	//String x="Name (Z to A)";
	
	public void selectthedropdown(String x) throws InterruptedException {
		
		
		ordershortlist.click();
		Thread.sleep(5000);
		sel.selectByVisibletext(ordershortlist, x);
		
	}
	
	public void checkp() {
		
		if(txtProducts.isDisplayed()) {
			
			String ele= txtProducts.getText();
//			String Actualtitle=ele;
//			String Expectedtitle="PRODUCTS";
			
			System.out.println("am present");
			System.out.println(ele);
		}
		else {
			System.out.println("am not there");
		}
	}
	
}
