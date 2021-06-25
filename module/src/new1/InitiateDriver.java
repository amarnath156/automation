package new1;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import module1.PropertyReader;



public class InitiateDriver {
	
public ChromeDriver driver;
@BeforeMethod
public void launchBrowser() throws InterruptedException, IOException {
	
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   
  
    driver= new ChromeDriver();
    

    driver.manage().window().maximize();
    driver.get(PropertyReader.applicationConfigReader("Application_URL"));

}

  @AfterMethod

public void closeBrowser()
{
	  driver.quit();
}
}

