package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "//a [@title ='Facebook']")
    private WebElement FacebookLogo;


  public HomePage(WebDriver driver) {
   PageFactory.initElements(driver, this);
}
  
  
  public void ClickOnFB(WebDriver driver) {
	  FacebookLogo.click();
  }
  
  }