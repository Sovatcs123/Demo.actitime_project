package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oswas_login_Page
{
public WebDriver driver;
		JavascriptExecutor js;

		//Declaration
		@FindBy(xpath = "//b[@id='loginBtn']")
		private WebElement login;
		
		@FindBy(id="username")
		private WebElement username;
		
		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(id="loginButton")
		private WebElement loginbutton;
		
		//initialization
		public Oswas_login_Page(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);				
		}
		//utilization
		public void Login()
		{
			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", login);
		}
		public void Username() throws Throwable
		{
			username.sendKeys("etcpm4448h");
			Thread.sleep(3000);
		}
		public void Password() throws Throwable
		{
            password.sendKeys("Mituna@143");
            Thread.sleep(3000);
		}		
		public void Loginbutton()
		{

			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", loginbutton); 
		}		
		
	}


