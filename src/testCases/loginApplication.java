package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.rediffLoginPage;

public class loginApplication {
	
	@Test
	public void Login ()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anila\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		rediffLoginPage rdflogin = new rediffLoginPage();
		rdflogin.rediffLoginPage(driver);
		
		
	}

}
