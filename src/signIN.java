import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import bsh.ParseException;

public class signIN extends Parametrs {
	@Test(priority = 1)
	public void SIGN_UP() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("email")).sendKeys("subhimonjed@hotmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Asdfg123-");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();

		Thread.sleep(3000);

		String correct_Email_Welcome_Message = driver
				.findElement(By.xpath("//div[@class='panel header']//span[@class='logged-in'][normalize-space()='Welcome, subhi monjed!']")).getText();
		//div[@class='panel header']//span[@class='logged-in'][normalize-space()='Welcome, subhi monjed!']
		System.out.println(correct_Email_Welcome_Message);
		String Expected = "Welcome, subhi monjed!\r\n"	+ "";

		myAssert.assertNotEquals(correct_Email_Welcome_Message, Expected, "correctEmailWelcome:");
		myAssert.assertAll();

	}

	@Test(priority = 2)
	public void search_RANDOMLY() throws InterruptedException {
		String[] productItems = { "Jacket", "t-shirt", "jeans for men", "jeans for women", "pants" };
		int search_RAN = rand.nextInt(5);
		WebElement text = driver.findElement(By.xpath("//*[@id=\"search\"]"));
		text.sendKeys(productItems[search_RAN]);
		String selected_item = text.getAttribute("value");

		System.out.println(selected_item);
	}

	@Test(priority = 3, invocationCount = 3)
	public void Radiant_tee() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement divS = driver.findElement(By
				.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/div/div[3]/div[1]/div"));

		List<WebElement> divSize = divS.findElements(By.tagName("div"));
		System.out.println(divSize.size());

		WebElement divC = driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/div/div[3]/div[2]"));
		List<WebElement> divColor = divC.findElements(By.tagName("div"));
		System.out.println(divColor.size());

		int randomIndexS = rand.nextInt(divSize.size());
		divSize.get(randomIndexS).click();

		Thread.sleep(2000);

		int randomIndexC = rand.nextInt(divColor.size());
		divColor.get(randomIndexC).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/div/div[4]/div/div[1]/form/button"))
				.click();

	}
//
	@Test(priority = 4, invocationCount = 2)
	public void breathe_easy_tank() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement divS = driver.findElement(By
				.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/div/div[3]/div[1]/div"));

		List<WebElement> divSize = divS.findElements(By.tagName("div"));

		System.out.println(divSize.size());

		WebElement divC = driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/div/div[3]/div[2]"));
		List<WebElement> divColor = divC.findElements(By.tagName("div"));
		System.out.println(divColor.size());

		int randomIndexS = rand.nextInt(divSize.size());
		divSize.get(randomIndexS).click();

		Thread.sleep(2000);

		int randomIndexC = rand.nextInt(divColor.size());
		divColor.get(randomIndexC).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/div/div[4]/div/div[1]/form/button"))
				.click();

	}
//
////	@Test(priority = subhi)
////
////	public void Test3RandomAddition() throws InterruptedException {
////
////		// Add Radiant Tee
////		driver.findElement(
////				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/a/span/span/img"))
////				.click();
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
////
////		WebElement DivContainSize = driver
////				.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
////		List<WebElement> Size = DivContainSize.findElements(By.tagName("div"));
////		System.out.println(Size.size());
////
////		WebElement DivContaincolors = driver
////				.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
////		List<WebElement> Color = DivContaincolors.findElements(By.tagName("div"));
////
////		System.out.println(Color.size());
////
////		for (int i = 0; i < 3; i++) {
////
////			int RandomSize = rand.nextInt(Size.size());
////			Thread.sleep(3000);
////			Size.get(RandomSize).click();
////
////			Thread.sleep(3000);
////
////			int RandomColor = rand.nextInt(Color.size());
////			Thread.sleep(3000);
////			Color.get(RandomColor).click();
////
////			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
////
////			Thread.sleep(3000);
////
////		}
////	}
//
	@Test(priority = 5, invocationCount = 4)
	public void Argus_All_Weather_Tank() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement divS = driver.findElement(By
				.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div/div/div[2]/div[1]/div"));

		List<WebElement> divSize = divS.findElements(By.tagName("div"));

		System.out.println(divSize.size());

		WebElement divC = driver.findElement(By
				.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div/div/div[2]/div[2]/div"));
		List<WebElement> divColor = divC.findElements(By.tagName("div"));
		System.out.println(divColor.size());

		int randomIndexS = rand.nextInt(divSize.size());
		divSize.get(randomIndexS).click();

		Thread.sleep(2000);

		int randomIndexC = rand.nextInt(divColor.size());
		divColor.get(randomIndexC).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div/div/div[3]/div/div[1]/form/button"))
				.click();

	}

	@Test(priority = 6)
	public void Hero_Hoodie() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement divS = driver.findElement(By
				.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div/div/div[2]/div[1]/div"));

		List<WebElement> divSize = divS.findElements(By.tagName("div"));

		System.out.println(divSize.size());

		WebElement divC = driver.findElement(By
				.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div/div/div[2]/div[2]/div"));
		List<WebElement> divColor = divC.findElements(By.tagName("div"));
		System.out.println(divColor.size());

		int randomIndexS = rand.nextInt(divSize.size());
		divSize.get(randomIndexS).click();

		Thread.sleep(2000);

		int randomIndexC = rand.nextInt(divColor.size());
		divColor.get(randomIndexC).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div/div/div[3]/div/div[1]/form/button"))
				.click();

	}

////	@Test(priority = 7, invocationCount = 5)
////	public void Fusion_Backpack() throws InterruptedException {
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
////        
////		WebElement div=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div"));
////		action.moveToElement(div).perform();
////		
////		
////		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/div/div[3]/div/div[1]/form/button")).click();
////		Thread.sleep(2000);
////	}

	@Test(priority = 7)
	public void Fusion_Backpack() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/a/span/span/img"))
				.click();

		Thread.sleep(3000);
		WebElement div = driver
				.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]"));

		List<WebElement> divImage = div.findElements(By.tagName("img"));

		System.out.println(divImage.size());

		Thread.sleep(2000);
		for (int i = 1; i <= 5; i++) {

			int randomIndex = rand.nextInt(divImage.size());
			Thread.sleep(3000);
			divImage.get(randomIndex);
//
////			if (randomIndex == 0 || randomIndex==1) {
////				divImage.get(randomIndex).click();
////				driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
////				Thread.sleep(2000);
////                System.out.println(randomIndex);
////			} 
//
			if (randomIndex == 0) {
				WebElement divIndex1 = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]"));
				action.moveToElement(divIndex1).click().perform();

				Thread.sleep(2000);
				System.out.println(randomIndex);

			}

			else {
				WebElement divIndex2 = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[3]"));

				action.moveToElement(divIndex2).click().perform();

				Thread.sleep(2000);
				System.out.println(randomIndex);

			}
			driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();

		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='counter-number']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
	}

	@Test(priority = 8)
	public void Shipping_Address() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://magento.softwaretestingboard.com/checkout/#shipping");
		Thread.sleep(10000);
		
		WebElement CountryDiv = driver.findElement(By.xpath("//*[@id=\"shipping-new-address-form\"]/div[8]"));
		List<WebElement> CountrySelect = CountryDiv .findElements(By.tagName("select"));
		Select MySelect = new Select(CountrySelect .get(0));
		MySelect.selectByValue("JO");
		
		
	WebElement	divStreetAddress=driver.findElement(By.xpath("//div[@name='shippingAddress.street.0']//div[@class='control']"));
		List<WebElement> inputStreetAddress=divStreetAddress.findElements(By.tagName("input"));
	inputStreetAddress.get(0).sendKeys("Queen Noor Street");
	
	
	WebElement	divCity=driver.findElement(By.xpath("//div[@name='shippingAddress.city']//div[@class='control']"));
		List<WebElement> inputCity=divCity.findElements(By.tagName("input"));
	inputCity.get(0).sendKeys("zarqa");
	
	WebElement	divZipCode =driver.findElement(By.xpath("//div[@name='shippingAddress.postcode']//div[@class='control']"));
	List<WebElement> inputZipCode=divZipCode.findElements(By.tagName("input"));
inputZipCode.get(0).sendKeys("13110");



WebElement	divPhoneNumber=driver.findElement(By.xpath("//div[@class='control _with-tooltip']"));
List<WebElement> inputPhoneNumber=divPhoneNumber.findElements(By.tagName("input"));
inputPhoneNumber.get(0).sendKeys("0776283752");
	
Thread.sleep(5000);

WebElement	divNext=driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div"));
List<WebElement> buttonNext=divNext.findElements(By.tagName("button"));
buttonNext.get(0).click();
	}
	
@Test(priority = 9)
public void Payment() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://magento.softwaretestingboard.com/checkout/#payment");
	Thread.sleep(10000);

	String price_Text = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[4]/td/strong/span")).getText();


	System.out.println(price_Text);
	//$484.60
//	String price_TextReplace =price_Text.replaceAll("\\D", "");
	String price = price_Text.replace("$","");
	
	double  actual_Price= Double.parseDouble(price);
        
         
      //  System.out.println(actual_Price+1000);
  
	WebElement	divPlaceOrder=driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div"));
	List<WebElement> buttondivPlaceOrder=divPlaceOrder.findElements(By.tagName("button"));
	buttondivPlaceOrder.get(0).click();
	
	Thread.sleep(10000);

	WebElement	divOrderNumber=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]"));
	List<WebElement> linkOrderNumber=divOrderNumber.findElements(By.tagName("a"));
	linkOrderNumber.get(0).click();
	
	String GrandTotal_test = driver.findElement(By.xpath("//span[normalize-space()='$484.60']")).getText();


	System.out.println(GrandTotal_test);
	//$484.60
//	String price_TextReplace =price_Text.replaceAll("\\D", "");
	String Grand_test = GrandTotal_test.replace("$","");
	
	double  expected_Price= Double.parseDouble(Grand_test);
        
	myAssert.assertEquals(actual_Price, expected_Price, "Assert Test : ");
         myAssert.assertAll();

}

	
//	@Test(priority = 9)
//	public void checkout_Successfully() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(3));
//
//		Thread.sleep(10000);
//
//		String actual_Complete_CheckOut = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span"))
//				.getText();
//		String expected_Complete_CheckOut = "Thank you for your purchase!";
//		myAssert.assertEquals(actual_Complete_CheckOut, expected_Complete_CheckOut);
//		myAssert.assertAll();
//
//	}
}
