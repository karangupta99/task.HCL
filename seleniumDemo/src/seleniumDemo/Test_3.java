package seleniumDemo;

//Navigate function uses 


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Test_3 {
  public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  
	  driver.navigate().to("https://www.facebook.com");
	  try {
		  Thread.sleep(1000);
	  }catch(InterruptedException e) {
		e.printStackTrace();
		
	  }
	  driver.navigate().back();
	  try {
		  Thread.sleep(1000);
		  
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
	  driver.navigate().forward();
	  try {
		  Thread.sleep(1000);
		  
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
	  driver.navigate().back();
	  try {
		  Thread.sleep(1000);
		  
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
	  
	  driver.navigate().refresh();
	  try {
		  Thread.sleep(1000);
	  }catch(InterruptedException e) {
		e.printStackTrace();
		 
		
	  }
	  
	  driver.quit()	;
	  
	  }
}
