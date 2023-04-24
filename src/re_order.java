import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class re_order extends Parametrs{
	@Test(priority = 1)
	public void reSIGN_UP() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("email")).sendKeys("subhimonjed@hotmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Asdfg123-");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();

		Thread.sleep(3000);

		String correct_Email_Welcome_Message = driver
				.findElement(By.xpath("//div[@class='panel header']//span[@class='logged-in'][normalize-space()='Welcome, subhi monjed!']")).getText();
		System.out.println(correct_Email_Welcome_Message);
		String Expected = "Welcome, subhi monjed!\r\n"	+ "";

		myAssert.assertNotEquals(correct_Email_Welcome_Message, Expected, "correctEmailWelcome:");
		myAssert.assertAll();

	}
	
	@Test(priority = 2)
	public void my_Account() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/a[2]")).click();
		Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
       
		Thread.sleep(10000);

       WebElement	divNext=driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div"));
       List<WebElement> buttonNext=divNext.findElements(By.tagName("button"));
       buttonNext.get(0).click();
		Thread.sleep(10000);

       WebElement	divPlaceOrder=driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div"));
   	List<WebElement> buttondivPlaceOrder=divPlaceOrder.findElements(By.tagName("button"));
   	buttondivPlaceOrder.get(0).click();
   	Thread.sleep(10000);

	WebElement	divOrderNumber=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]"));
	List<WebElement> linkOrderNumber=divOrderNumber.findElements(By.tagName("a"));
	linkOrderNumber.get(0).click();
	
	Thread.sleep(10000);

	String GrandTotal_test = driver.findElement(By.xpath("//span[normalize-space()='$484.60']")).getText();


	System.out.println(GrandTotal_test);
	//$484.60
//	String price_TextReplace =price_Text.replaceAll("\\D", "");
	String Grand_test = GrandTotal_test.replace("$","");
	
	double actual_Price= Double.parseDouble(Grand_test);
        double  expected_Price=484.6;
	myAssert.assertEquals(actual_Price, expected_Price, "Assert Test : ");
         myAssert.assertAll();

}
	}

