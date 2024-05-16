package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginSteps {
    WebDriver driver = null;
    LoginPage login;

    @Given("Launch Website")
    public void i_am_on_the_login_page() {

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }


    @When("I enter my username {string} and password {string}")
    public void iEnterMyUsernameAndPassword(String username,String password) {
        login = new LoginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
    }
    @And("I click the login button")
    public void i_click_the_login_button() {
        login.Login();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        System.out.println("success");
    }


}
