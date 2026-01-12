package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Test_6 {
	 public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://onlinefeestechnocrats.in/LoginStudent.aspx?type=F");

	        

	        // Switch inside the frame
	       // driver.switchTo().frame("iFrame1");
	        
	       
	        
	        // Enter login ID
	        
	        WebElement uid = driver.findElement(By.xpath("//input[@id='Login1_UserName']"));
	        uid.sendKeys("0111CS221106");

	        // Enter password
	        WebElement pass = driver.findElement(By.xpath("//input[@id='Login1_Password']"));
	        pass.sendKeys("30072003");

	        // Click login button
	        WebElement btn = driver.findElement(By.xpath("//input[@id='Login1_LoginButton']"));
	        btn.click();
	        
	        try {
	        	Thread.sleep(Duration.ofSeconds(10));
	        }catch(Exception e) {
	        	Thread.currentThread();
	        }

	        driver.quit();
	 }
}