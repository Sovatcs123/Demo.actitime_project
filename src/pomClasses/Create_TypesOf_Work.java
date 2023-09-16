package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_TypesOf_Work
{
	public WebDriver driver;
	JavascriptExecutor js;
	//Declaration
	@FindBy(xpath = "//span[.='Create Type of Work' ]")
	private WebElement Creatework;
	
	@FindBy(id="name")
	private WebElement Nametextfileld;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement Createtypeofwork;
	
	@FindBy(xpath = "//a[.='sad']/../..//td[@class='listtblcell lastInRow']")
	private WebElement Delete;
	

	//Initialization
	public Create_TypesOf_Work(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void Creatework()
	{

		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Creatework);
			}
	
	public void name()
	{
	Nametextfileld.sendKeys("sad");	
	}
	
	public void Createtypeofwork()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Createtypeofwork);
		
	}
	public void Delete()
	{
		js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Delete);
	}
	

}
