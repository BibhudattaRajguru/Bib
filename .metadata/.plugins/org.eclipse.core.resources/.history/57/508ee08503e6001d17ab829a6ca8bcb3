package objectRepositary;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	
		
		@FindBy(xpath =" //div[text() = 'No results found']")
		private WebElement SearchResultText;
		
		
		
		public SearchResultPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
		}
		public String getResultMsg() {
			return SearchResultText.getText();
	    
		
	}
}
