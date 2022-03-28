package com.cydeo.step_definitions;

import com.cydeo.pages.BigTaskOrderPage;
import com.cydeo.pages.BigTaskPages;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BigTaskStep {

    BigTaskPages bigTaskPages = new BigTaskPages();
    BigTaskOrderPage bigTaskOrderPage = new BigTaskOrderPage();

    @Given("user is already logged in to web table app")
    public void user_is_already_logged_in_to_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        bigTaskPages.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        bigTaskPages.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        bigTaskPages.btnButton.click();
    }
    @When("user is on the “Order” page")
    public void user_is_on_the_order_page() {

    }
    @Then("user enters appropriate test data")
    public void user_enters_appropriate_test_data() {

    }
    @Then("Product")
    public void product() {

    }
    @Then("Quantity")
    public void quantity() {

    }
    @Then("Customer name")
    public void customer_name() {

    }
    @Then("Street")
    public void street() {

    }
    @Then("City")
    public void city() {

    }
    @Then("State")
    public void state() {

    }
    @Then("Zip")
    public void zip() {

    }
    @Then("Payment info:")
    public void payment_info() {

    }
    @Then("Card type: Visa_MasterCard_American Express")
    public void card_type_visa_master_card_american_express() {

    }
    @Then("Card No")
    public void card_no() {

    }
    @Then("Expire date")
    public void expire_date() {

    }
    @Then("user clicks to “Process Order”")
    public void user_clicks_to_process_order() {

    }
    @Then("user should see new order in the table on “View all orders” page")
    public void user_should_see_new_order_in_the_table_on_view_all_orders_page() {

    }

}
