package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadinformationPage {
	@FindBy(css ="span.dvHeaderText")
	private WebElement leadsInfoMsg;
	
	public LeadinformationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public String getLeadsInfoMsg() {
		return leadsInfoMsg.getText();
      
}
}