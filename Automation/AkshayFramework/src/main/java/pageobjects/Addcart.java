package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcart {
	 private WebDriver driver;

	@FindBy (id = "")
	
	WebElement cart;
	
	public Addcart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void addcart() {
		cart.click();
	}

}
