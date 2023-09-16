package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime_Homepage 
{
public WebDriver driver;
JavascriptExecutor js;
WebDriverWait wait;

//Declaration

@FindBy(id="container_tt")
private WebElement Timetrack;

@FindBy(id="container_tasks")
private WebElement Tasks;

@FindBy(id="container_reports")
private WebElement Reports;

@FindBy(id="container_users")
private WebElement Users;

@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
private WebElement settings;

//Initialization
public Actitime_Homepage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
//utilization
public void Timetrack()
{
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", Timetrack);
}
public void Tasks()
{
	js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].click()",Tasks);
}
public void Reports()
{
	js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].click()", Reports);
}
public void Users()
{   
	js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].click()", Users);
}

public void settingclick() throws Throwable
{

			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", settings);
		}

	
}
