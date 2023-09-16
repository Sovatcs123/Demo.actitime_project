package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Add_NewCustomer_Task_page
{
	public WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

	//Declaration
	@FindBy(xpath = "//div[@class='customerNameDiv']")
	private WebElement customernametextfield;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement description;
	
	@FindBy(xpath = "//div[@class='emptySelection']")
	private WebElement selectcustomerdropdown;
	
	@FindBy(xpath = "(//div[.='Big Bang Company'])[2]")
	private WebElement bigbangcomapany;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcustomer;
	//initialization
			public Add_NewCustomer_Task_page(WebDriver driver) 
			{
				this.driver=driver;
				PageFactory.initElements(driver, this);
				
			}
			//utilization
			public void Customername() throws Throwable
			{
			    Thread.sleep(3000);
				customernametextfield.sendKeys("Sova");
				Thread.sleep(3000);
			}
	public void Description() throws Throwable
	{
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Enter Customer Description']")));
		description.sendKeys("Job");
		Thread.sleep(3000);
	}
	public void Selectcustomerdropdown() throws Throwable
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].ckick()", selectcustomerdropdown);
		Thread.sleep(3000);
	}
	public void Bigbangcompany() throws Throwable
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].ckick()", bigbangcomapany);
		Thread.sleep(3000);
	}
	public void Createcustomer() throws Throwable
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].ckick()", createcustomer);
		Thread.sleep(3000);
	}

}

