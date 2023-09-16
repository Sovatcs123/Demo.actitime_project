package Testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.Actitime_Homepage;
import pomClasses.Actitime_Login_Page;
import pomClasses.Add_NewCustomer_Task_page;
import pomClasses.Add_NewTask;

public class Createnew_Customer_Task_Page {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Actitime_Login_Page login= new Actitime_Login_Page(driver);
		login.login();
		
		Actitime_Homepage task= new Actitime_Homepage(driver);
		task.Tasks();
		
	Add_NewTask customer= new Add_NewTask(driver);
	customer.Newcustomer();
		
		Add_NewCustomer_Task_page newcustomer= new Add_NewCustomer_Task_page(driver);
		newcustomer.Customername();
		newcustomer.Description();
		newcustomer.Selectcustomerdropdown();
		newcustomer.Bigbangcompany();
		newcustomer.Createcustomer();

	}

}
