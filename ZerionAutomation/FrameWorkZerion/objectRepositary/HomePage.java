package objectRepositary;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	@FindBy(css ="i.icon-minti-search")
	private WebElement SearchButton;
	@FindBy(xpath ="//input[@name='s']")
	private WebElement SearchTypeBar;
	@FindBy(xpath ="//ul[@id= 'nav']/li[6]/a")
	private WebElement SignInButton;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void ClickOnSearch(WebDriver driver) {
		SearchButton.click();
		
	}
	public void TypeOnSearch(String Data) {
		SearchTypeBar.sendKeys(Data,Keys.ENTER);
		
}
	public void ClickOnSignIn(WebDriver driver) {
		SignInButton.click();	
 }
}	
	
	
	
	
	