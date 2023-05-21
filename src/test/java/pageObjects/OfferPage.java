package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfferPage {
	
	public WebDriver driver;
	
	public OfferPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement search(String path) {
	
	return driver.findElement(By.xpath("//input[@type='"+path+"']")); 
   }
	
	public WebElement tableData(String name) {
		return driver.findElement(By.xpath("//td[text()='"+name+"']"));
	}


}
