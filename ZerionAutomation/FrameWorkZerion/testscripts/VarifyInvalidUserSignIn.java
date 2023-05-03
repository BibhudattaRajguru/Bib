package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationUtility.BaseClass;
import junit.framework.Assert;
import objectRepositary.HomePage;
import objectRepositary.SignInPage;

public class VarifyInvalidUserSignIn extends BaseClass{
	
		@Test
		public void VarifySignInFeature() throws IOException{
			HomePage hp = new HomePage(driver);
			SignInPage SIP = new SignInPage(driver);
			hp.ClickOnSignIn(driver);
			SIP.EnterUserName(tdu.FatchdatafromExcel("TestDataIn",5,2));
			String SignInErrorMsg = SIP.getSignInErrorMsg();
		    Assert.assertTrue(SignInErrorMsg.contains(tdu.FatchdatafromExcel("TestDataIn",5, 3)));
 }
}