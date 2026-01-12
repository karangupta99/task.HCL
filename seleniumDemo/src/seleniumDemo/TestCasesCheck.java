package seleniumDemo;


//FindElements 
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class TestCasesCheck {
	
	
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://onlinefeestechnocrats.in/");
	driver.manage().window()	.maximize();
	List<WebElement> x = driver.findElements(By.tagName("a"));
	System.out.println(x.size());
	
	for(WebElement x1: x) {
		System.out.println(x1.getAttribute("href"));
	}
}	 
}
