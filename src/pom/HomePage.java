package pom;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.Base_Page;
import junit.framework.Assert;

public class HomePage extends Base_Page
{
	@FindBy (xpath="//input[@name='q']")
	private WebElement searchbox;
	
	@FindBy (xpath="//button[@class='_2AkmmA _29YdH8'][contains(.,'✕')]")
	private WebElement closeicon;
	


	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	public void search(String mobilename) throws AWTException
	{
		searchbox.sendKeys(mobilename);
		searchbox.sendKeys(Keys.ENTER);
		
		
	}
	public void closelog() 
	{
		closeicon.click();
		
		
		
	}

	public void verifyHomePage(String hp_title)
	{
		verifyTitle(hp_title);
	}

	}


