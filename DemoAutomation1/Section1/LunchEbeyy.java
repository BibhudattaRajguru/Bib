import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchEbeyy {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		int Links = 0 ;
		for( WebElement WE: allLinks){
		System.out.println(WE.getAttribute("href"));
		System.out.println(WE.getText());
		System.out.println("______________________________________________________");
		Links++ ;
		System.out.println( "total links ="+Links);
		
		}
}
}
