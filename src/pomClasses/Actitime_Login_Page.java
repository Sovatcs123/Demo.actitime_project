package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_Login_Page 
{
public WebDriver driver;
JavascriptExecutor js;

//Declaration
@FindBy(id="username")
private WebElement usernametextfield;

@FindBy(name="pwd")
private WebElement passwordtextfield;

@FindBy(id="keepLoggedInLabel")
private WebElement checkbox;

@FindBy(id="loginButton")
private WebElement loginbutton;


@FindBy(xpath = "//a[.='Forgot your password?']")
private WebElement forgotpasswordlink;

@FindBy(xpath = "//a[.='actiTIME Inc.']")
private WebElement inclink;

@FindBy(id="logoutLink")
private WebElement logoutlink;


//initialization
public Actitime_Login_Page(WebDriver driver)
{
	this.driver= driver;
	PageFactory.initElements(driver, this);
}

//Utilization

public void login() throws Throwable
 {
	usernametextfield.sendKeys("admin");
	Thread.sleep(2000);
	passwordtextfield.sendKeys("manager");
	Thread.sleep(3000);
	
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", checkbox);
	Thread.sleep(3000);
	js.executeScript("arguments[0].click()", loginbutton);

	
	}
public void forgotpassword()
{
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", forgotpasswordlink);
}

public void inclink()
{
	js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].click()", inclink);
	
}
public void logoutlink()
{
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", logoutlink);
}
}
