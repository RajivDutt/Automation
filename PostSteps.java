package Cucumber.feature.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.PendingException;



public class PostSteps {@Given("^User should be logged in and should be present in the user wall$")
public void user_should_be_logged_in_and_should_be_present_in_the_user_wall() throws Throwable {
    System.out.println("User should be logged in");
}

    @When("^I type the message in the box$")
    public void i_type_the_message_in_the_box() throws Throwable {
        System.out.println("I type the message in the box");
    }

    @Then("^message gets posted$")
    public void message_gets_posted() throws Throwable {
        System.out.println("message gets posted");
    }

    @And("^click on post$")
    public void click_on_post() throws Throwable {
        System.out.println("click on post");
    }

}
