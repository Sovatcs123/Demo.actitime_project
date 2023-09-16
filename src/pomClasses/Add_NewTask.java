package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_NewTask 
{
	public WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

	//Declaration
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement Newcustomer;
	
	@FindBy(xpath = "//div[@class='item createNewProject']")
	private WebElement Newproject;
	
	@FindBy(xpath = "//div[@class='item createNewTasks']")
	private WebElement Newtasks;
	
	@FindBy(xpath = "//div[@class='item importTasks']")
	private WebElement importtask;
	//initialization
		public Add_NewTask(WebDriver driver) throws Throwable 
		{
			
			this.driver=driver;
			PageFactory.initElements(driver, this);	
			Thread.sleep(3000);
		}
		//utilization
		public void Newcustomer() throws Throwable
		{
				js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", Newcustomer);	
				Thread.sleep(4000);
		}
		public void Newproject()
		{
				js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", Newproject);				
		}
		public void Newtasks()
		{
				js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", Newtasks);				
		}
		public void Importtask()
		{
				js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", importtask);				
		}
		
}
