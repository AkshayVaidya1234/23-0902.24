package Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.Addcart;
import pageobjects.Pagelass;

public class Carttest extends Base{
	
	@BeforeMethod
	
	public void setup(){
		Pagelass pg= new Pagelass(driver);
		pg.performSomeAction("Admin", "admin123");
		
	}
	
	@Test
	
	public void cart() {
		Addcart ac= new Addcart(driver);
		
		ac.addcart();
		
	}
	

}
