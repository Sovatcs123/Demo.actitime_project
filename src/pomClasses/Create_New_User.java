package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_New_User

{
	public WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	
	@FindBy(xpath = "//div[.='New User']")
	private WebElement newuser;
	
	 @ FindBy(id="createUserPanel_firstNameField")
	 private WebElement firstname;
	 
	 @ FindBy(id="createUserPanel_lastNameField")
	 private WebElement lastname;
	 
	 @ FindBy(id="createUserPanel_emailField")
	 private WebElement email;
	 
	 @FindBy(xpath="(//div[@class='downIcon'])[5]")
		private WebElement downicon;
		
		@FindBy(xpath="(//div[.='HR & Finance'])[3]")
		private WebElement hrfinancebutton;
		
		@FindBy(xpath="//div[@class='components_switcher small off animated']")
		private WebElement timetrackicon;
		
	 
	 @FindBy(xpath = "//div[.='Save & Send Invitation']")
	 private WebElement saveandsend;
	 
	 @FindBy(xpath="(//span[.='Close'])[1]")
		private WebElement closebuttton;

	//initialization
			public  Create_New_User(WebDriver driver) 
			{				
                this.driver=driver;
				PageFactory.initElements(driver, this);				
			}
			
			//utilization
			
			public void Newuser() throws Throwable
			{
				js= (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", newuser);
				Thread.sleep(5000);
			}
			public void Firstname() throws Throwable 
			{
		    //js= (JavascriptExecutor)driver;
		    //js.executeScript("arguments[0].value='Sovabati'",firstname);
			firstname.sendKeys("sovabati");
			Thread.sleep(3000);
			}
			public void Lastname() throws Throwable
			{
			// js= (JavascriptExecutor)driver;
			 //js.executeScript("arguments[0].value='mania'",lastname);
			lastname.sendKeys("mania");
			Thread.sleep(3000);
			}
			public void Email() throws Throwable
			{
				// js= (JavascriptExecutor)driver;
				 //js.executeScript("arguments[0].value='sovabatimania@gmail.com'",email);
			email.sendKeys("sovabatimania@gmail.com");
			Thread.sleep(3000);
			
			}
			public void downiconmethod() throws InterruptedException
			{
			  downicon.click();
			  Thread.sleep(4000);
			}
			public void hrfinancemethod() throws InterruptedException
			{
			hrfinancebutton.click();
			Thread.sleep(2000);
			}	
			public void timetrackmethod()
			{
			timetrackicon.click();
			}	
			public void savemethod() throws InterruptedException
			{
			saveandsend.click();
			Thread.sleep(5000);
			}
			public void closemethod() throws InterruptedException
			{
			closebuttton.click();
			Thread.sleep(5000);
			//driver.switchTo().alert().accept();
			}	
	 
	 
	 
	 
	 

}
