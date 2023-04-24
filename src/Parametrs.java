import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Parametrs {
	
	static String URL ="https://magento.softwaretestingboard.com/";
     WebDriver driver;
     SoftAssert myAssert;
     Actions action;
     Random rand;
    
   
@BeforeTest
public void Search_WebSite() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");  
	 driver = new ChromeDriver(options);
//	WebDriver driver=new ChromeDriver();
	 myAssert= new SoftAssert();
	 rand = new Random();
	 action = new Actions(driver);
	
	 driver.get(URL);
	 
	driver.manage().window().maximize();

}





@AfterTest
public void Close_WebSite() {}


}
