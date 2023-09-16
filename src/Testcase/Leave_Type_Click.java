package Testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.Actitime_Homepage;
import pomClasses.Actitime_Login_Page;
import pomClasses.Actitime_Setting_Page;
import pomClasses.Leave_Type_Page;

public class Leave_Type_Click {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		Actitime_Login_Page login= new Actitime_Login_Page(driver);
        login.login();
        
        Actitime_Homepage set= new Actitime_Homepage(driver);
        set.settingclick();
        
        Actitime_Setting_Page setting= new Actitime_Setting_Page(driver);
        setting.Leavetype();
        
        Leave_Type_Page leave= new Leave_Type_Page(driver);
        leave.Createleavetype();
        leave.Leavetypename();
        leave.createleavetype1();
        leave.Deleteleave();
	}

}
