package Step_Pak;

import Base_Pak.Base_Class;
import Pom_Pak.Pom_class;
import Runner_Pak.Runner_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Step_class extends Base_Class {


    WebDriver driver= Runner_class.driver;
    Pom_class pc=new Pom_class(driver);


    @Given("user launches the url and user is on the home page")
    public void user_launches_the_url_and_user_is_on_the_home_page() {
        driver.get("https://magento.softwaretestingboard.com/");
        maximize(driver);


    }

    @Given("user clicking the sign in link")
    public void user_clicking_the_sign_in_link() {
       clk(pc.getSignin());

    }

    @When("user enters the valid {string} and valid {string}")
    public void user_enters_the_valid_and_valid(String string, String string2) {
        credentials(pc.getEnteringemail(),string);
        credentials(pc.getEnteringpwd(),string2);

    }

    @When("user clicking the login button")
    public void user_clicking_the_login_button() {
        clk(pc.getClickinglogin());

    }

    @When("user taking the screenshot of the login page")
    public void user_taking_the_screenshot_of_the_login_page() throws IOException, InterruptedException {
        Thread.sleep(4000);
        snapshot(driver,"homepage");

    }

    @Then("user logout of homepage")
    public void user_logout_of_homepage() {
        clk(pc.getClickingdropdown());
        clk(pc.getClickinglogout());

    }

    @When("user enters the Invalid {string} and valid {string}")
    public void user_enters_the_invalid_and_valid(String string, String string2) {

        credentials(pc.getEnteringemail(),string);
        credentials(pc.getEnteringpwd(),string2);

    }

    @Then("Take the screenshot of the error")
    public void take_the_screenshot_of_the_error() throws IOException, InterruptedException {
        Thread.sleep(3000);
        snapshot(driver,"Error");

    }













}
