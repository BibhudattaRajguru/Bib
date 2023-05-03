package automationUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public TestDataUtils tdu = new TestDataUtils();
	public SharedSeleniumLib ssl = new SharedSeleniumLib();
	public WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void openBrowser() throws IOException {
	System.out.println("Browser Lunch");
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	System.out.println(tdu.Fatchdatafromproperties("URL"));
	driver.get(tdu.Fatchdatafromproperties("URL"));
	
	}
}
