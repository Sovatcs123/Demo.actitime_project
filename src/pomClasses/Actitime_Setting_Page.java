package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_Setting_Page
{
	public WebDriver driver;
	JavascriptExecutor js;
	//Declaration
	@FindBy(id="popup_menu_item_6")
	private WebElement Generalsetting;
	
	@FindBy(xpath = "//a[.='Workflow Settings']")
	private WebElement Workflowsetting;
	
	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement Typesofwork; 
	
	@FindBy(xpath = "//a[.='Notifications']")
	private WebElement Notification;
	
	@FindBy(xpath = "//a[.='Leave Types']")
	private WebElement Leavetype;
	
	@FindBy(xpath = "//a[.='Logo Settings']")
    private WebElement Logosetting;
	//initialization
	
	public Actitime_Setting_Page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	//Utilization
	public void Generalsetting()
	{
			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", Generalsetting);
			
	}
	public void Workflowsetting()
	{
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Workflowsetting);
	}
	public void Typesofwork()
	{
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Typesofwork);
	}
	public void Notification()
	{
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Notification);
	}
	public void Leavetype()
	{
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Leavetype);
	}
	public void Logiosetting()
	{
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Logosetting);
		
	}
}
