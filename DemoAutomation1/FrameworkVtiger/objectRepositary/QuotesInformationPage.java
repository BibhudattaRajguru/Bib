package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotesInformationPage {


	@FindBy(css ="span.lvtHeaderText")
	private WebElement QuotesInfoMsg;
	
	public QuotesInformationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public String getQuotesInfoMsg() {
		return QuotesInfoMsg.getText();
      

}
}