package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	
	public WebDriver driver;
	public String productName;
	public LandingPage landingpage;
	TestContextSetup testcontextsetup;
	
	
	public LandingPageStepDefinition(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		landingpage=testcontextsetup.pageObjectmanager.getlandingPage();
	}
		
	@Given("user is on Greencard landing page")
	public void user_is_on_greencard_landing_page() throws IOException  {
	
		//testcontextsetup.testBase.WebDriverManager();
	}
	@When("user search with shortname {string} and extracted actual name of the")
	public void user_search_with_shortname_and_extracted_actual_name_of_the(String name) throws InterruptedException {
				landingpage.SearchItem(name);
				 productName=landingpage.getProductText().split("-")[0].trim();
		   System.out.println(productName + " is extracted from Home page");	
		  landingpage.TopDeals().click();
	}
	
	@When("^user search with shortname (.+) and extracted actual name of the exp$")
    public void user_search_with_shortname_and_extracted_actual_name_of_the_exp(String names) throws Throwable {
				landingpage.SearchItem(names);
				 productName=landingpage.getProductText().split("-")[0].trim();
		   System.out.println(productName + " is extracted from Home page");	
		   landingpage.TopDeals().click();
		
    }
	
	@When("^user click on \"([^\"]*)\"$")
	    public void user_click_on_something(String object) throws InterruptedException {
				 landingpage.clickable(object).click();
		 	    }
	@When("user search with vegetable name {string}")
	public void user_search_with_vegetable_name(String name) throws InterruptedException {
				landingpage.SearchItem(name);
					}
	@When("user clears text in search")
	public void user_clears_text_in_search() {
				landingpage.clearText();
	}

@Then("user click on {string} icon")
public void user_click_on_icon(String iconname) {	
	landingpage.iconClick(iconname).click();
}

@Then("user checks {string}")
public void user_checks(String checkBox) throws InterruptedException {
		landingpage.checkBox(checkBox).click();
	}

@Then("user types {string} into text box {string}")
public void user_types_into_text_box(String text, String placeholder) throws InterruptedException {
		landingpage.textBox(placeholder).sendKeys(text);
	 
}

@When("user clears textbox {string}")
public void user_clears_textbox(String placeholder) throws InterruptedException {
		landingpage.textBox(placeholder).clear();	
}
		
}
