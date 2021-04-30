package stepDefinition;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Pages.BaseClass;
import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinitions extends BaseClass {

	HomePage homepage = new HomePage();

	@Given("On the Google Search Page")
	public static void google_homepage() throws Throwable {
		initialization();
	}

	@When("Type Ducks and click on the Search")
	public void search_word() throws Throwable {
		homepage.searchWord();
	}

	@Then("Check for the Search Results")
	public void verifySearchResults() throws Throwable {
		Assert.assertTrue("Verified Successfully", homepage.linkIsPresent());
	}

	@Then("Click the search link")
	public void click_link() throws Throwable {
		homepage.clickLink();
	}

	@When("Type Eagle and click on the Search")
	public void searchOtherWord() throws Throwable {
		homepage.searchOtherWord();
	}

	@When("Type special characters and click on the Search")
	public void searchSpecialCharacters() throws Throwable {
		homepage.searchSpecialChars();
	}

	@Then("Verify the Other Search Results")
	public void verify_link() throws Throwable {
		Assert.assertTrue("Verified Successfully", homepage.linkIsPresent());

	}

	@After
	public static void teardown() {
		closeApplication();
	}

}
