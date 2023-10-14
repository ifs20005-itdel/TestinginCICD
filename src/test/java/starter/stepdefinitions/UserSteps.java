package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Delete;
import starter.user.Get;
import starter.user.Post;
import starter.user.Put;

public class UserSteps {
    @Steps
    Get get;

    @Steps
    Post post;

    @Steps
    Put put;

    @Steps
    Delete delete;

    @Given("I set GET endpoints")
    public void setGetApiEndpoint(){
        get.setApiEndpoint();
    }
    @When("I send a POST HTTP request to create a new user")
    public void sendGetHttpRequest(){
        get.sendGetHttpRequest();
    }

    @Then("I receive a valid HTTP response code 201")
    public void receiveValidHttpResponseCode(){
        get.validateHttpResponseCode200();
    }
    @And("I receive valid data for the new user")
    public void receiveValidDataForDetailUser(){
        get.validateDataDetailUser();
    }

    @Given("I set POST endpoints")
    public void setPostApiEndpoint(){
        post.setPostApiEndpoint();

    }
    @When("I send a GET HTTP request to retrieve user details")
    public void sendPostHTTPRequest(){
        post.sendPostHttpRequest();

    }

    @Then("I receive a valid HTTP response code 200")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();

    }

    @And("I receive valid data for the user details")
    public void validateDataNewUser(){
        post.validateDatanewUser();

    }

    @Given("I set PUT endpoints")
    public void setPutEndpoint(){
        put.setPutEndpoint();

    }

    @When("I send a PUT HTTP request to update an existing user")
    public void sendPutHttpRequest(){
        put.sendPutHttpRequest();

    }

    @And("I receive valid data for the updated user")
    public void validateDataForExistingUser(){
        put.ValidateDataForExistingUser();

    }

    @Given("I set DELETE endpoints")
    public void setDeleteEndpoint(){
        delete.setDeleteEndpoint();


    }
    @When("I send a DELETE HTTP request to delete an existing user")
    public void sendDeleteHttpRequest(){
        delete.sendDeleteHttpRequest();

    }

    @Then("I receive a valid HTTP response code 204")
    public void validHttpResponseCode204(){
        delete.validHttpresponseCode204();

    }
}

