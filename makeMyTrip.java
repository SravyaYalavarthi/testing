package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://makemytrip.com");
		//maximize window
		driver.manage().window().maximize();
		//finding the element using the locator
		driver.findElement(By.className("makeFlex")).click();
	    driver.findElement(By.id("username")).sendKeys("6284545455");
	    driver.findElement(By.cssSelector(".modalLogin")).click();
	    
    
	}

}
