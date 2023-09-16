package Testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.Actitime_Homepage;
import pomClasses.Actitime_Login_Page;
import pomClasses.Actitime_Setting_Page;
import pomClasses.Create_TypesOf_Work;

public class Click_setting_Page
{

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		Actitime_Login_Page login= new Actitime_Login_Page(driver);
        login.login();
        
        Actitime_Homepage set= new Actitime_Homepage(driver);
        set.settingclick();
        
        Actitime_Setting_Page work= new Actitime_Setting_Page(driver);
        work.Typesofwork();
        
        Create_TypesOf_Work create= new Create_TypesOf_Work(driver);
        create.Creatework();
        create.name();
        create.Createtypeofwork();
        create.Delete();      
	}

}
