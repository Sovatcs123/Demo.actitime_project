package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delete_New_User 
{
	public WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	
	@FindBy(xpath = "//span[.='mania, sovabati']")
	private WebElement sovabati;
	
	@FindBy(xpath = "//div[@class='deleteButton actionButton']")
	private WebElement delete;
	
	//@FindBy()
	

	//initialization
			public   Delete_New_User(WebDriver driver) 
			{
				
				this.driver=driver;
				PageFactory.initElements(driver, this);				
			}
			
			//utilization			
			public void Sovabati() throws Throwable
			{
				js= (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", sovabati);
				Thread.sleep(3000);
			}
			public void Delete() throws Throwable
			{
				js= (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", delete);
				driver.switchTo().alert().accept();
				Thread.sleep(3000);
				
			}
}
