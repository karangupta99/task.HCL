package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test_1 {
    public static void main(String[] args) {

        // If chromedriver is not added to PATH, use this:
        // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://technocratsgroup.edu.in/");
        driver.quit();
    }
}

// here wbdriver is a interface and driver is a reference ;