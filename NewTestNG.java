package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestNG {
	public String baseUrl="http://demo.guru99.com/test/newtours/";
  @Test
  public void verifyHomepageTitle() {
	  System.out.println("launching chrome browser");
	  System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		driver.get(baseUrl);
		String expectedTitle="Welcome Mercury Tours";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
		
		
	  
  }
}
