package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginFunctionalitySteps {
    WebDriver driver=Hooks.getDriver();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage(){
        driver.get("https://rahulnxttrendz.ccbp.tech/login");
    }

    @When("I enter valid username and password")
    public void enterValidUsernameAndPassword(){
        driver.findElement(By.id("username")).sendKeys("rahul");
        driver.findElement(By.id("password")).sendKeys("rahul@2021");
    }

    @And("I click on the login button")
    public void clickLoginButton(){
        driver.findElement(By.className("login-button")).click();
    }

    @Then("I should be redirected to the home page")
    public void redirectToHomePage(){
        String expectedUrl="https://rahulnxttrendz.ccbp.tech/";

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));

        String currentUrl=driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,currentUrl,"URLS do not match");
    }
}
