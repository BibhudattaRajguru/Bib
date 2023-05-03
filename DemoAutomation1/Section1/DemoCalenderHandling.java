import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCalenderHandling {
	public static void main(String[] args) throws InterruptedException {
		String date ="7";
		String month ="November";
		String year = "1997";		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		driver.findElement(By.id("datepicker")).click();
		while(true){
			String cal_month = driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText();
			String cal_year = driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();
			if(cal_month.equals(month) && cal_year.equals(year)) {
				break;
				
			}
			else {
				driver.findElement(By.className("ui-icon ui-icon-circle-triangle-w")).click();
			}
		}
		driver.findElement(By.linkText(date)).click();
}
	}
