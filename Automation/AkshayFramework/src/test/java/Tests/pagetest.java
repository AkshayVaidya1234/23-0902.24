package Tests;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.Pagelass;
import org.testng.annotations.Listeners;


public class pagetest extends Base{

	

	    @Test
	    public void testHomePage() {
	    	Pagelass pg= new Pagelass(driver);
	    	
	    	pg.performSomeAction("Admin", "admin123");
	    	Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	       
	    	
	    }
	}
	

