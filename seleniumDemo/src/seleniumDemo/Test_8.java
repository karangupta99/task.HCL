package seleniumDemo;

import java.time.Duration;
import java.util.List;   // IMPORTANT import
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_8 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // NEW form URL (Latest DemoQA)
        driver.get("https://demoqa.com/automation-practice-form");

        // Find all checkboxes
        List<WebElement> w = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement x : w) {

            // Print values for debugging
            System.out.println(x.getAttribute("value"));

            // Select checkboxes by "value"
            if (x.getAttribute("value").equals("1") || 
                x.getAttribute("value").equals("2")) {  
                x.click();
            }
        }
    }
}
