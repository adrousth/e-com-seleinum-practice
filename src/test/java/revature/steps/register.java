package revature.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import revature.pages.LoginPage;

import static revature.testrunner.TestRunner.driver;
import static revature.testrunner.TestRunner.url;

public class register {
    public LoginPage loginPage;
    @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() {
        System.out.println("Registration test start!");
        loginPage = new LoginPage(driver);

    }

    @When("I type in a valid and unique email of {string}")
    public void iTypeInAValidAndUniqueEmailOf(String email) {
        loginPage.enterEmailForCreateAnAccount(email);
        loginPage.clickCreateAccountButton();
    }

    @And("I click the Create an account button")
    public void iClickTheCreateAnAccountButton() {
    }

    @And("I am taken to the Create an account page")
    public void iAmTakenToTheCreateAnAccountPage() {
    }

    @And("I type in a valid first name of {string} in your personal information")
    public void iTypeInAValidFirstNameOfInYourPersonalInformation(String arg0) {
    }

    @And("I type in a valid last name of {string} in your personal information")
    public void iTypeInAValidLastNameOfInYourPersonalInformation(String arg0) {
    }

    @And("I type in a valid password of {string} in your personal information")
    public void iTypeInAValidPasswordOfInYourPersonalInformation(String arg0) {
    }

    @And("I type in a valid first name of {string} in your address")
    public void iTypeInAValidFirstNameOfInYourAddress(String arg0) {
    }

    @And("I type in a valid last name of {string} in your address")
    public void iTypeInAValidLastNameOfInYourAddress(String arg0) {
    }


    @And("I type in a valid address of {string} in your address")
    public void iTypeInAValidAddressOfInYourAddress(String arg0) {
    }

    @And("I type in a valid city of {string} in your address")
    public void iTypeInAValidCityOfInYourAddress(String arg0) {
    }

    @And("I select a valid state of {string} in your address")
    public void iSelectAValidStateOfInYourAddress(String arg0) {
    }

    @And("I type in a valid zip code of {string} in your address")
    public void iTypeInAValidZipCodeOfInYourAddress(String arg0) {
    }

    @And("I type in a valid mobile phone of {string} in your address")
    public void iTypeInAValidMobilePhoneOfInYourAddress(String arg0) {
    }

    @And("I click the register button")
    public void iClickTheRegisterButton() {
    }

    @Then("I should be redirected to the user page")
    public void iShouldBeRedirectedToTheUserPage() {
    }

}

