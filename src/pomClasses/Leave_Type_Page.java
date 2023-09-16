package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leave_Type_Page
{
	public WebDriver driver;
	JavascriptExecutor js;
	//Declaration
	
	@FindBy(xpath = "//span[.='Create Leave Type']")
	private WebElement Createleavetype;
	
	@FindBy(id="leaveTypeLightBox_nameField")
	private WebElement Leavetypename;
	
	@FindBy(xpath = "//div[@class='buttonIcon']")
	private WebElement createleavetype1;
	
	@FindBy(xpath = "(//span[.='Sova'])[1]/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement delete;
	
	
	
	//initialization
	public Leave_Type_Page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);				
	}
	//utilization
	public void Createleavetype()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Createleavetype);
	}
	public void Leavetypename()
	{
		Leavetypename.sendKeys("Sova");
	}
	public void createleavetype1()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",createleavetype1);
		
	}
	public void Deleteleave()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",delete);
		driver.switchTo().alert().accept();
		
	}
}

