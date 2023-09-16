package Oswas_Testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Oswas.Oswas_Home_Page;
import pomClasses.Oswas_login_Page;

public class Oswas_Homepage {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://oswas.gov.in//Login.zul");
		driver.manage().window().maximize();
		
	Oswas_login_Page login= new Oswas_login_Page(driver);
	login.Login();
	login.Username();
	login.Password();
	login.Loginbutton();	
	
	Oswas_Home_Page home= new Oswas_Home_Page(driver);
	home.Worklist();
	home.File();
	home.Closefile();
	
	//home.Logout();
	//home.Logoutyes();
	

	}

}
