package Section1automation;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class LunchEdge {
		public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver","D:\\Automation\\Browser Server2\\msedgedriver.exe");
			
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.shaadi.com//");
			System.out.println("title :"+driver.getTitle());
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://www.naukri.com//");
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.google.com.//");
			driver.quit();
		}
}
