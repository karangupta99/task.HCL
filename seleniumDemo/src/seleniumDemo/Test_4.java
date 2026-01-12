package seleniumDemo;


//Navigate function uses 


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Test_4 {
	 public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlinefeestechnocrats.in/");
		WebElement lt = driver.findElement(By.partialLinkText(""));
		lt.click();

	
		 driver.close();
	 } 
	
}
