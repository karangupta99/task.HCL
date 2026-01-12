package SleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Slenium1day {
public static void main(String[] args)  throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.get("https://onlinefeestechnocrats.in/");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
	driver.manage().window().maximize();
	System.out.println(driver.getWindowHandle());

	
	try {
	    Thread.sleep(3000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	
	driver.close(); // close the current window 
	
}
}

