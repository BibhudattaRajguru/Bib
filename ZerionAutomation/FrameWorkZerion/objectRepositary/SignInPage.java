package objectRepositary;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	@FindBy(xpath ="//input[@id= 'username']")
	private WebElement UserNameField;
	@FindBy(xpath ="//span[contains(text(),\"Please check username\")]")
	private WebElement SignInErrorText;
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void EnterUserName(String username) {
		UserNameField.sendKeys(username,Keys.ENTER);
		
	}
	public String getSignInErrorMsg() {
		return SignInErrorText.getText();
    
 }
}
