package Testscripts;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import automationUtility.BaseClass;


import java.io.IOException;
@Listeners(automationUtility.ExecutionMoniter.class)
public class LoginToVtiger extends BaseClass {
	@Test(groups = {"system"})
	public void HomepageValidation() throws IOException {
		WebElement homeEle = driver.findElement(By.xpath("//a[contains (text () ,'Home') ]"));
		String homeText = tdu.FatchdatafromExcel("TestCaseData", 1, 2);
		if( homeEle.getText().contains(homeText)){
			System.out.println("Login to Vtiger is Pass");
		}else {
			System.out.println("login to Vtiger is fail");
		}
	}
	

}
