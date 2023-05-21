package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String productName;
	public PageObjectManager pageObjectmanager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws IOException {
		testBase=new TestBase();
		pageObjectmanager= new PageObjectManager(testBase.WebDriverManager());
		genericUtils= new GenericUtils(testBase.WebDriverManager());
	}
	}


