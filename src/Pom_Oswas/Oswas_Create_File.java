package Pom_Oswas;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oswas_Create_File 
{
	 public WebDriver driver;
		JavascriptExecutor js;

		//Declaration
		@FindBy(xpath = "//span[.='Create File']")
		private WebElement createfile;
		
		@FindBy(xpath = "//input[@value='OSWAS Test Department']")
		private WebElement department;
		
		@FindBy(xpath = "(//li[@class='z-comboitem z-comboitem-selected'])[6]")
		private WebElement oswasdepartment;
		
		@FindBy(xpath = "//a[@id='vJKA89-btn']")
		private WebElement postdropdown;
		
		@FindBy(xpath = "//li[@title='OSWAS Help Desk User']")
		private WebElement postselect;
		
		
		@FindBy(xpath = "//a[@id='t6PWl3-btn']")
		private WebElement sectiondropdown;
		
		@FindBy(xpath = "//li[@id='t6PW98']")
		private WebElement sectionclick;
		
		@FindBy(xpath = "//span[@title='Please Select the Branch Subject.']")
		private WebElement subjectsearch;
		
		@FindBy(xpath = "//div[@id='t6PWie-cave']")
		private WebElement subjectselect;
		
		@FindBy(xpath = "//input[@id='t6PWr6-real']")
		private WebElement collectionsearch;
		
		@FindBy(xpath = "//li[@id='t6PWnf']")
		private WebElement collectionclick;
		
		
		@FindBy(xpath = "//textarea[@title='Please Enter File Description.']")
		private WebElement description;
		
		@FindBy(xpath = "//button[@id='t6PWw5']")
		private WebElement createfile1;
		
		//initialization
		
			public Oswas_Create_File(WebDriver driver) 
			{
				this.driver=driver;
				PageFactory.initElements(driver, this);
						
			}
			//Utilization
			public void Createfile() throws Throwable
			{
					js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", createfile);
					Thread.sleep(3000);					
			}
			public void Department() throws Throwable
			{
					js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", department);
					Thread.sleep(4000);				
			}
			public void Oswasdepartment() throws Throwable
			{
					js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", oswasdepartment);
					Thread.sleep(4000);				
			}
			public void Postdropdown() throws Throwable
			{
					js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", postdropdown);
					Thread.sleep(4000);				
			}
			public void Postselect() throws Throwable
			{
					js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", postselect);
					Thread.sleep(4000);				
			}
			public void Sectiondropdown() throws Throwable
			{
					js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", sectiondropdown);
					Thread.sleep(4000);				
			}
			public void Sectionclick() throws Throwable
			{
					js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", sectionclick);
					Thread.sleep(3000);					
			}
			public void Subjectsearch() throws Throwable
			{
					js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", subjectsearch);
					Thread.sleep(3000);					
			}
			public void Subjectselect() throws Throwable
			{
					js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", subjectselect);
					Thread.sleep(3000);					
			}
			public void Collectionsearch() throws Throwable
			{
					js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", collectionsearch);
					Thread.sleep(3000);					
			}
			public void  Collectionclick() throws Throwable
			{
					js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", collectionclick);
					Thread.sleep(3000);					
			}
			public void Description() throws Throwable
			{
					description.sendKeys("testing");
					Thread.sleep(3000);					
			}
			public void Createfile1() throws Throwable
			{
					js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", createfile1);
					Thread.sleep(3000);					
			}

}
