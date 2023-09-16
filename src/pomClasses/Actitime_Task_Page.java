package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime_Task_Page 
{
	public WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

	//Declaration
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement Addnew;
	
	@FindBy(xpath = "(//input[@placeholder='Start typing name ...'])[2]")
	private WebElement Starttypingtextfileld;
	
	@FindBy(xpath = "//div[.='Configure columns']")
	private WebElement configurecolumns;
	
	//initialization
	public Actitime_Task_Page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);				
	}
	//utilization
	public void Addnew()
	{
			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", Addnew);
			
	}
	public void Starttyping()
	{
			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", Starttypingtextfileld);
			
	}
	public void Configurecolumn()
	{
			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", configurecolumns);
			
	}
}
