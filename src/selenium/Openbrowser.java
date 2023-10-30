package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("www.fb.com");
}
}
