package Section1automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Lunchchrome {
public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
		Navigation nav = driver.navigate();
		nav.to("https://eu.actitime.com/rami/login.do");
		driver.manage().window().maximize();
		
		
	}
} 