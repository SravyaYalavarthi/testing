package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedinProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://linkedin.com");
		//maximize window
		driver.manage().window().maximize();
		//finding the element using the locator
		//driver.findElement(By.name("session_key")).sendKeys("Sowmya@gmail.com");
	    //driver.findElement(By.name("session_password")).sendKeys("Sfg454sdsf");
		driver.findElement(By.cssSelector("body > nav > a.nav__button-secondary")).click();
		 driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Sowmya@gmail.com");
       driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("fghfhujy6");
       driver.findElement(By.cssSelector("#app__container > main > div > form > div.login__form_action_container > button")).click();
	}

}
