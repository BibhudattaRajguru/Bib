package Testscripts;



import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import automationUtility.BaseClass;
import junit.framework.Assert;
import objectRepositary.CreateNewQuotesPage;
import objectRepositary.HomePage;
import objectRepositary.QuotesInformationPage;
import objectRepositary.QuotesPage;
@Listeners(automationUtility.ExecutionMoniter.class)
public class CreateQuotes extends BaseClass {
	@Test(groups = {"smoke","sanity"})
	public void QuotesCreation() throws IOException, InterruptedException {
		HomePage hp = new HomePage(driver);
		QuotesPage Qp = new QuotesPage(driver);
		CreateNewQuotesPage CNQP =new CreateNewQuotesPage(driver);
		QuotesInformationPage QIP = new QuotesInformationPage(driver);
		hp.mouseOnMoreDD(driver);
		hp.clickonQuoteslink();
	   Qp.clickonCreateQuotesPlusBtn();
	   CNQP.enterSubjectName(tdu.FatchdatafromExcel("TestCaseData", 4, 2));
	   CNQP.clickOnOrganizationPlusBtn();
	   
	   ssl.switchDriverFocusToChild(driver);
	   CNQP.SearchOrganizationName(tdu.FatchdatafromExcel("TestCaseData",4, 3));
	   CNQP.clickOnOrganizationSearchButton();        
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.alertIsPresent());
	  
       CNQP.clickOnOrganizationPOPupSearchedName();
       ssl.acceptAlert(driver);
       ssl.switchDriverFocusToMain(driver);
       
       CNQP.enterBillingAdress(tdu.FatchdatafromExcel("TestCaseData",4, 4));
       CNQP.enterShippingAdress(tdu.FatchdatafromExcel("TestCaseData",4, 5));
       CNQP.clickOnProductPlusButton();
       
       ssl.switchDriverFocusToChild(driver);
       CNQP.clickOnProductPopupFirstName(); 
       ssl.switchDriverFocusToMain(driver);
       
       CNQP.enterQuantityinfo(tdu.FatchdatafromExcel("TestCaseData",4, 6));
        CNQP.ClickOnSaveButton(driver);
         String QuotesInfomsg = QIP.getQuotesInfoMsg();
         Assert.assertTrue(QuotesInfomsg.contains(tdu.FatchdatafromExcel("TestCaseData",4, 7)));
		
      
 		}
	}


//