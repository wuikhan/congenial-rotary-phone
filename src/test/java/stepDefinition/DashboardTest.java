package stepDefinition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseClass;

public class DashboardTest extends BaseClass {

	@Given("^I open \"([^\"]*)\" browser$")
	public void i_open_browser(String browser)  {
		setup(browser);
	}

	@Given("^I go to \"([^\"]*)\" environment$")
	public void i_go_to_environment(String env)  {
	    if(env.equalsIgnoreCase("qa")) {
	    	driver.get("https://login.salesforce.com/");
	    }
	}

	@Given("^I enter \"([^\"]*)\" username$")
	public void i_enter_username(String username)  {
	   driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("^I enter \"([^\"]*)\" password$")
	public void i_enter_password(String password)  {
	    driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^I click the \"([^\"]*)\" button$")
	public void i_click_the_button(String btn) {
	   driver.findElement(By.xpath("//input[@id='"+btn+"']")).click();
	}

	@Then("^I should see the \"([^\"]*)\" link$")
	public void i_should_see_the_link(String link)  {
	   driver.findElement(By.linkText(link)).isDisplayed();
	}

	@Then("^I quit the browser$")
	public void i_quit_the_browser()  {
	   driver.quit();
	}
}
