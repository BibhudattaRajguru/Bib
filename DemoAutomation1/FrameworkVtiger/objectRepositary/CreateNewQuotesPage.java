package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewQuotesPage {
	
	@FindBy(name  = "subject")
	private WebElement SubjectTb;

	@FindBy(xpath  = "//input[@name='account_id']/following-sibling::img")
	private WebElement OrganizationPlusBtn;

	@FindBy(id = "search_txt")
	private WebElement OrgSearchTb;
	@FindBy(name = "search")
	private WebElement OrgSearchBtn;
	@FindBy(xpath  = "//a[contains(text(),'Organization Name')]/../../following-sibling::tr/td/a")
	private WebElement OrganizationPopupSearchedname;
	@FindBy(name = "bill_street")
	private WebElement Billingadd;
	
	@FindBy(name = "ship_street")
	private WebElement Shippingadd;
	 @FindBy(css ="img[title='Products']")
	   	private WebElement productPlusBtn;
	
	 @FindBy(xpath  = "//a[contains( text() ,'Product Name')]/../../following-sibling::tr[1]/td[2]/a")
		private WebElement ProductPopupFirstname;
	 @FindBy(id = "qty1")
	private WebElement QuantityTb;
	
	 @FindBy(css ="input[type='submit']")
	   	private WebElement SaveBtn;
	   	
	
	
	
	
	
	public CreateNewQuotesPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}	
	
	
	
	
	
	public void enterSubjectName(String name) {
	SubjectTb.sendKeys(name);
	}
	
	
	public void clickOnOrganizationPlusBtn (){
		OrganizationPlusBtn.click();
		}
		
	public void SearchOrganizationName(String name) {
		OrgSearchTb.sendKeys(name);
		}
	public void clickOnOrganizationSearchButton (){
		OrgSearchBtn.click();
		}
	public void clickOnOrganizationPOPupSearchedName (){
		OrganizationPopupSearchedname.click();
		}
	
	public void enterBillingAdress(String adress) {
		Billingadd.sendKeys(adress);
		}
	public void enterShippingAdress(String adress) {
		Shippingadd.sendKeys(adress);
		}
	
	public void clickOnProductPlusButton (){
		productPlusBtn.click();
		}
	public void clickOnProductPopupFirstName (){
		ProductPopupFirstname.click();
		}
	
	public void enterQuantityinfo(String data ) {
		QuantityTb.sendKeys(data);
		}
	
	public void ClickOnSaveButton(WebDriver driver){
		  SaveBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}