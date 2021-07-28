package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {

    @Given("^The user is on NetBanking page$")
    public void The_user_is_on_NetBanking_page(){
    // navigate to netbank page
        System.out.println("Given step");
    }

    // this is not feasible when have to be parametrised
    /* @When("^The user login using username and password")
    public void login_using_usn_pwd(){
        // login methos
        System.out.println("when step");
    }*/
// here tidy gherkin will create the regular expressions whenever double qutoes are there in the Feature file
    // for ex  : The user login using username  "King" and password "retjkel"
    @When("^The user login using username  \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void the_user_login_using_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {

       System.out.println("username : "+strArg1);
        System.out.println("password : "+strArg2);
    }


    @Then("^Home page gets populated$")
    public void Home_page(){
        // Home Page Navigation
        System.out.println("Then step");
    }

    // @Then("The account information shown is {string}}") // this can also be written instead of reg expression
    @Then("The account information shown is \"([^\"]*)\"$")
    public void the_account_information_shown_is(String string){
        // login methos
        System.out.println("And step "+string);

    }

}
