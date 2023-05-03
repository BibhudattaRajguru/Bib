package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewLeadPage {
	@FindBy(name ="lastname")
	private WebElement LastNameTb;
	@FindBy(name ="company")
	private WebElement CompanyTb;
    @FindBy(name ="leadsource")
	private WebElement leadsourceDD;
    @FindBy(css ="input[type='submit']")
   	private WebElement SaveBtn;
   	
	
	
	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}	
  public void FillupLastNameData(String lastname){
	
	LastNameTb.sendKeys(lastname);
 }
  public void FillupCompanyData(String company){

    CompanyTb.sendKeys(company);
    
 }
  public void SelectitemFromLeadsourceDD(String leadsourceoptn){
	  Select s = new Select(leadsourceDD);
		s.selectByValue(leadsourceoptn);
	  
	
	    
}
  public void ClickOnSaveButton(WebDriver driver){
	  SaveBtn.click();
  }
	  
}

	


