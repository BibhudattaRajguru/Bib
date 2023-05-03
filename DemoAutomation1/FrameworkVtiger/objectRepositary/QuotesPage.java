package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotesPage {

		@FindBy(css = "img[title ='Create Quote...']")
		private WebElement  createQuotes;
		
		
		public QuotesPage (WebDriver driver) {
			PageFactory.initElements(driver,this);
			
		}
		
			
	public void clickonCreateQuotesPlusBtn(){
		createQuotes.click();

	}
}
	