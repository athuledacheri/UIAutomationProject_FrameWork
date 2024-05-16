package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    protected By TxtUserName = By.id("user-name");
    protected By TxtPassword = By.id("password");

    protected By login = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver=driver;

    }

    public void enterUsername(String username)
    {
        driver.findElement(TxtUserName).sendKeys(username);
    }

    public void enterPassword(String password)
    {
        driver.findElement(TxtPassword).sendKeys(password);
    }

    public void Login()
    {
        driver.findElement(login).click();
    }
}
