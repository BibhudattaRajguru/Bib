import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToactitime {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
    Thread.sleep(3000);
    
    driver.findElement(By.id("container_users")).click();
    driver.findElement(By.className("components_button_label")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("Piyush");
    Thread.sleep(4000);
    driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("Rajguru");
    Thread.sleep(3000);
    driver.findElement(By.id("createUserPanel_emailField")).sendKeys("piyushrajguru222@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text() ='Save & Send Invitation']")).click();
    driver.quit();
	
}
}
