package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
public class Uploadfile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("uploadFile"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].style.display= 'block'", element);


		
		element.sendKeys("C:\\Users\\karan\\OneDrive\\Desktop");
		  
		  
		  driver.close();
}
	
}
