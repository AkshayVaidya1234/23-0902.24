package Framework.Datadrivern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hello {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
	}

}
