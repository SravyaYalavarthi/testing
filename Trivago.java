package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trivago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://trivago.com");
		//maximize window
		driver.manage().window().maximize();
		//finding the element using the locator
		driver.findElement(By.cssSelector("#js_navigation > div > div.pos-relative.has-popover > button > span")).click();
		 driver.findElement(By.xpath("//*[@id=\"check_email\"]")).sendKeys("Sowmya100@gmail.com");
       driver.findElement(By.cssSelector("#login_email_submit")).click();
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//*[@id=\"register_password\"]")).sendKeys("Sowmya1");
driver.findElement(By.cssSelector("#register_email_submit")).click();

	}

}
