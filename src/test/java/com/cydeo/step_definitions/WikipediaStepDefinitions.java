package com.cydeo.step_definitions;

import com.cydeo.pages.WikiPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaStepDefinitions {

    WikiPage wikiPage = new WikiPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String string) {
        wikiPage.searchBox.sendKeys(string);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiPage.searchElement.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String string) {
        String expected = string + " - Wikipedia";
        String actual = Driver.getDriver().getTitle();
        Assert.assertEquals(expected, actual);
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String string) {
        Assert.assertTrue(wikiPage.header.isDisplayed());
        Assert.assertTrue(wikiPage.header.getText().equals(string));
    }
}
