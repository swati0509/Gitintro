package scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excel;
import pom.HomePage;

public class validLoginLogout extends Base_Test 
{
	@Test

	public void testvalidLoginLogout() throws AWTException, InterruptedException
	{
		HomePage hm=new HomePage(driver);
		Thread.sleep(3000);
		hm.closelog();
		Thread.sleep(3000);
		hm.search("mobile");
		//String un = Excel.getCellValue(PATH, "validLoginLogout", 0, 0);
		
	}
	

}