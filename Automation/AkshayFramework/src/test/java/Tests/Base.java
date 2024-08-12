package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	
	    protected WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	       
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Replace with your target URL
	    
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    
	   

}

