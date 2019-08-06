package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class LoginPage extends Base_Page
{
@FindBy (id="username")
private WebElement untbox;
@FindBy (name="pwd")
private WebElement pswtbox;
@FindBy (xpath="//div[.='Login ']")
private WebElement loginbutton;
@FindBy (xpath="(//span[@class='errormsg'])[1]")
private WebElement emsg;
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	public void setUserName(String un)
	{
		untbox.sendKeys(un);
	}
	public void setPassword(String psw)
	{
		pswtbox.sendKeys(psw);
	}
	public void clickLogin()
	{
		loginbutton.click();
	}
	public void verifyErrorMsg()
	{
		verifyElement(emsg);
	}
	public void verifyLoginPage(String lp_title)
	{
		verifyTitle(lp_title);
	}
}
