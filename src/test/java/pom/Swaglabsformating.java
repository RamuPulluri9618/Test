package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumLib.SeleniumLibb;

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
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
    private WebElement link;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
    private WebElement logout;
	
	
	
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
	
	public void logout() {
		
		
		try {
			link.click();
			Thread.sleep(2500);
			logout.click();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
