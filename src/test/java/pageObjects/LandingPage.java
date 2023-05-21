package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
		
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By search=By.xpath("//input[@type='search']");
	By productname= By.xpath("//h4[contains(@class,'product-name')]");
	
	public void SearchItem(String name) {
		
		driver.findElement(search).sendKeys(name);
		
	}
public String getSearchText(String name) {
		
		return driver.findElement(search).getText();
		
	}
public String getProductText() {
	
	return driver.findElement(productname).getText();
	
}
public WebElement FlightBooking() {
	
	return driver.findElement(By.xpath("//a[text()='Flight Booking']")); 
}
public WebElement Items(String path) {
	
	return driver.findElement(By.xpath("//input[@type='"+path+"']")); 
}

public WebElement TopDeals()
{
	return driver.findElement(By.xpath("//a[text()='Top Deals']"));
		
}
public WebElement clickable(String object) {
	
	return driver.findElement(By.xpath("//*[text()='"+object+"']"));
}
public void clearText() {
	 driver.findElement(search).clear();
}
public WebElement iconClick(String iconeName) {
	return driver.findElement(By.xpath("//*[contains(@src,'"+iconeName+"')]"));
}

public WebElement checkBox(String checkBox) {
	return driver.findElement(By.xpath("//*[contains(@*,'"+checkBox+"')]"));
}

public WebElement textBox(String textBox) {
	return driver.findElement(By.xpath("//*[contains(@placeholder,'"+textBox+"')]"));
}


}