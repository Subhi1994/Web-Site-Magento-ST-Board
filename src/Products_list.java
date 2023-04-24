import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Products_list extends Parametrs{
	@Test()
	public void  number_Products() {
		
		driver.get(URL);
		
	WebElement olProducts=	driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol"));
	List<WebElement> imgProducts =olProducts.findElements(By.tagName("img"));
	
	System.out.println(imgProducts.size());
	
	for(int i=0; i<imgProducts.size();i++) {
	String img_Pro=	imgProducts.get(i).getAttribute("alt");
	System.out.println(img_Pro);

	}
		
	}
	

}
