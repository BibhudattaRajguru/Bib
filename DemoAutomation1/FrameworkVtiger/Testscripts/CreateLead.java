package Testscripts;

import java.io.IOException;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import automationUtility.BaseClass;
import junit.framework.Assert;
import objectRepositary.CreateNewLeadPage;
import objectRepositary.HomePage;
import objectRepositary.LeadPage;
import objectRepositary.LeadinformationPage;
@Listeners(automationUtility.ExecutionMoniter.class)
public class CreateLead extends BaseClass {
	
	@Test(groups = {"smoke"})
	public void LeadCreation()throws IOException {
		HomePage hp = new HomePage(driver);
		hp.clickonLeadslink();
		
		LeadPage lp = new LeadPage(driver);
		lp.clickonCreatlink();
		CreateNewLeadPage CNLP = new CreateNewLeadPage(driver);
		CNLP.FillupLastNameData(tdu.FatchdatafromExcel("TestCaseData",10,2));
		CNLP.FillupCompanyData((tdu.FatchdatafromExcel("TestCaseData",10,3)));
	
		CNLP.SelectitemFromLeadsourceDD(tdu.FatchdatafromExcel("TestCaseData",10,4));
		CNLP.ClickOnSaveButton(driver);
					// driver.findElement(By.cssSelector("input[type='submit']")).click();
					 LeadinformationPage Lifp = new LeadinformationPage(driver);
					 String LeadInfomsg = Lifp.getLeadsInfoMsg();
					 Assert.assertTrue(LeadInfomsg.contains(tdu.FatchdatafromExcel("TestCaseData",10,5)));
					 	
						
			       //  if( LeadInfomsg.contains(tdu.FatchdatafromExcel("TestCaseData",10,5))){
			 	
					
}
}