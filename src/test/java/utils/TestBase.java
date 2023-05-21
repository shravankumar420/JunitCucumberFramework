package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String browser_property=prop.getProperty("browser");
		//below line is used to get the browser name from cmd
		String browser_maven=System.getProperty("browser");
		
		//Termary options results = testcondition ? value1 : value 2
		String browser = browser_maven != null ? browser_maven : browser_property ;
		
		if (driver == null) {
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--start-maximized","incognito","disable-infobars","disable-infobars","--headless=new");
			    driver =new ChromeDriver(options);
			    }
			else if(browser.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				EdgeOptions options= new EdgeOptions();
				options.addArguments("--start-maximized","incognito","disable-infobars","disable-infobars","--headless=new");
			    driver =new EdgeDriver(options);			    
			}
			
			else {
				System.out.println("slet the browser");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);			
			}
		
	    return driver;	
	    
	}	
	

}
