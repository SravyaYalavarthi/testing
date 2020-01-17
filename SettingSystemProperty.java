package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SettingSystemProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://google.com");
//maximize window
driver.manage().window().maximize();
//finding the element using the locator
driver.findElement(By.name("q")).sendKeys("Sowmya Deloitte Bangalore is a genius girl");

	}

}
