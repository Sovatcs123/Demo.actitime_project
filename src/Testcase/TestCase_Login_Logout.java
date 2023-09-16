package Testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.Actitime_Login_Page;

public class TestCase_Login_Logout {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		Actitime_Login_Page login= new Actitime_Login_Page(driver);
		//login.inclink();
	//login.forgotpassword();	
		login.login();
		login.logoutlink();
		}
}
