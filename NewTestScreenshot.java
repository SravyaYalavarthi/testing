package SeleniumDeloitteDemoPackage;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class NewTestScreenshot {
    @Test

    public void testGuru99TakeScreenShot() throws Exception{

		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
    	driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/V4/");

        //Call take screenshot function

        this.takeSnapShot(driver, "c://test.png") ;     

    }

   
    public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                Files.copy(SrcFile, DestFile);

    }

  
}
