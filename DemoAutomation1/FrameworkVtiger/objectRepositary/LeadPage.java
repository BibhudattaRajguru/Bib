package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
	@FindBy(css = "img[title ='Create Lead...']")
	private WebElement  creatLead;
	
	
	public LeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
		
public void clickonCreatlink(){
	creatLead.click();
	

}
}