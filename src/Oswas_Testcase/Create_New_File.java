package Oswas_Testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Oswas.Oswas_Create_File;
import Pom_Oswas.Oswas_Home_Page;
import pomClasses.Oswas_login_Page;

public class Create_New_File {

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
	
	Oswas_Home_Page create= new Oswas_Home_Page(driver);
	create.Worklist();
	
	Oswas_Create_File file= new Oswas_Create_File(driver);
	file.Createfile();
	file.Sectiondropdown();
	file.Sectionclick();
	file.Subjectsearch();
	file.Subjectselect();
	file.Collectionsearch();
	file.Collectionclick();
	file.Description();
	file.Createfile1();
		

	}

}
