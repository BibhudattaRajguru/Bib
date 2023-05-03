package automationUtility;

import java.io.IOException;
import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepositary.HomePage;
import objectRepositary.LoginPage;

public class BaseClass {
	public TestdataUtils tdu = new TestdataUtils();
	public SharedSeleniumLib ssl = new SharedSeleniumLib();
	public WebDriver driver;
	public static WebDriver ListenerDriver;
	@BeforeClass(alwaysRun = true)
	public void openBrowser() throws IOException {
	System.out.println("Browser Lunch");
	
	WebDriverManager.chromedriver().setup();
	driver = new  ChromeDriver();
	ListenerDriver = driver;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get(tdu.Fatchdatafromproperties("Url"));
	}
	//@Parameters({"browserName"})
	//@BeforeClass(alwaysRun = true)
	//public void openBrowser(String browserName) throws IOException {
	//System.out.println("Browser Lunch");
	//if(browserName.equals("chrome")) {
	//WebDriverManager.chromedriver().setup();
	//driver = new  ChromeDriver();
	//}
	//else if(browserName.equals("edge")) {
		//WebDriverManager.edgedriver().setup();
	//driver = new EdgeDriver();
//	}
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.manage().window().maximize();
	//driver.get(tdu.Fatchdatafromproperties("Url"));
	//}
	
	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException {
		System.out.println("Login Done");
		LoginPage lp = new LoginPage(driver);
		lp.logingToApp(tdu.Fatchdatafromproperties("username"),tdu.Fatchdatafromproperties("passward"));
		
	}
	
   @AfterMethod(alwaysRun = true)
   public void logout() {
	   System.out.println("Logout Done");
	   HomePage hp = new HomePage(driver);
	   hp.logoutFromApp(driver);
	   
   }  
	@AfterClass(alwaysRun = true)
	public void closebrowser() {
		System.out.println("Browser close");
		driver.quit();
		
		
		
	}
	}











