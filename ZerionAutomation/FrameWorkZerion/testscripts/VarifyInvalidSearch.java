package testscripts;



import java.io.IOException;

import org.testng.annotations.Test;



import automationUtility.BaseClass;
import junit.framework.Assert;
import objectRepositary.HomePage;
import objectRepositary.SearchResultPage;

public class VarifyInvalidSearch extends BaseClass{
 @Test
 public void VarifySearchResult() throws IOException{
	HomePage hp = new HomePage(driver);
	SearchResultPage SRP = new SearchResultPage(driver);
	hp.ClickOnSearch(driver);
	hp.TypeOnSearch(tdu.FatchdatafromExcel("TestDataIn", 1 , 2));
	String SearchresultMsg = SRP.getResultMsg();
    Assert.assertTrue(SearchresultMsg.contains(tdu.FatchdatafromExcel("TestDataIn",1, 3)));
	
 }
}