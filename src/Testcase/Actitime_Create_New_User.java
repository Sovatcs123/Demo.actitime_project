package Testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.Actitime_Homepage;
import pomClasses.Actitime_Login_Page;
import pomClasses.Create_New_User;
import pomClasses.Delete_New_User;

public class Actitime_Create_New_User
{

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		Actitime_Login_Page login= new Actitime_Login_Page(driver);
		login.login();
		
		Actitime_Homepage user= new Actitime_Homepage(driver);
		user.Users();
		
		Create_New_User create= new Create_New_User(driver);
		create.Newuser();
		create.Firstname();
		create.Lastname();
		create.Email();
		create.downiconmethod();
		create.hrfinancemethod();
		create.savemethod();
		create.closemethod();
		
		Delete_New_User del= new Delete_New_User(driver);
		del.Sovabati();
		del.Delete();
		
		
		
		
		
		
		
		
		
		
	}

}
