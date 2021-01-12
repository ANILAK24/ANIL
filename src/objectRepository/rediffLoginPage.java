package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class rediffLoginPage {
	
	WebDriver driver;
	
	public void rediffLoginPage (WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	By username= By.xpath("//input[id='login1']");
	By password= By.xpath("//input[name='passwd']");
	By signin= By.xpath("//input[name='proceed']");
}
