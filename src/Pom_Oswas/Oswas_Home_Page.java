package Pom_Oswas;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oswas_Home_Page
{
    public WebDriver driver;
	JavascriptExecutor js;

	//Declaration
	@FindBy(xpath = "//span[.=' Worklist']")
	private WebElement worklist;
	
	@FindBy(xpath = "//span[.=' Files Room']")
	private WebElement filesroom;
	
	@FindBy(xpath = "//span[.=' Reference Docs']")
	private WebElement referencedocs;
	
	@FindBy(xpath = "//span[.=' Dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath = "//div[@title='Logout']")
	private WebElement logout;
	
	@FindBy(xpath = "//button[.='Yes']")
	private WebElement logoutyes;
	
	@FindBy(xpath = "(//span[.='OSWAS-A-OLA -0026-2023'])[1]")
	private WebElement fileclick;
	
	@FindBy(xpath = "//div[@title='Close']")
	private WebElement closefile;
	
	//initialization
	
		public Oswas_Home_Page(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
					
		}
		//Utilization
		public void Worklist() throws Throwable
		{
				js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", worklist);
				Thread.sleep(3000);
							
		}
		public void Filesroom()
		{
				js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", filesroom);
							
		}
		public void Referencedocument()
		{
				js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", referencedocs);
							
		}
		public void Dashboard()
		{
				js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", dashboard);
							
		}
		public void Logout()
		{
				js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", logout);
							
		}
		public void Logoutyes()
		{
				js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", logoutyes);
							
		}
		public void File()
		{
				js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", fileclick);
							
		}
		public void Closefile()
		{
				js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", closefile);
							
		}


}
