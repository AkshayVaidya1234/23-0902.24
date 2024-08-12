package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagelass {

	
	
	 private WebDriver driver;

	    @FindBy(name = "username")
	    private WebElement usname;
	    
	    @FindBy(name = "password")
	    private WebElement pwd;
	    
	    @FindBy(xpath = "//button[@type='submit']")
	    private WebElement btn;
	    

	    public Pagelass(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void performSomeAction(String username,String passwords) {
	      
	    	usname.sendKeys(username);
	    	pwd.sendKeys(passwords);
	    	btn.click();
	    }
	}
	


