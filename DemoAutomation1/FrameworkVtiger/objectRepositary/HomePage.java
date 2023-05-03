package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationUtility.SharedSeleniumLib;

public class HomePage {
	@FindBy(xpath ="//span[@class ='userName']/../following-sibling::td[1]/img")
	private WebElement administrator;
	@FindBy(linkText = "Sign Out")
	private WebElement signOut;
	@FindBy(linkText = "Leads")
	private WebElement leadlink;
	@FindBy(xpath = "// a[ contains (text() ,'More' )]")
	private WebElement moreDD;
	@FindBy(xpath = "// a[ (@ name = \"Quotes\")]")
	private WebElement Quoteslink;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void logoutFromApp(WebDriver driver) {
		SharedSeleniumLib ssl = new SharedSeleniumLib()	;
	    ssl.moveMouseOnElement(driver,administrator);
		
	}
   public void clickonLeadslink(){
	leadlink.click();
	
}
  
    public void  mouseOnMoreDD(WebDriver driver){
    SharedSeleniumLib ssl = new SharedSeleniumLib()	;
    ssl.moveMouseOnElement(driver,moreDD);
    	
    	
}
    public void clickonQuoteslink(){
		Quoteslink.click(); 
}
}