package ru.inger;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Step {

   WebDriver webDriver;

    @Given("^Open the Firefox and launch the application$")
    public void openTheFirefoxAndLaunchTheApplication() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/home/inger/webDriver/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("http://demo.guru99.com/v4/");
    }

    @When("^Enter the (.+) and (.+)")
    public void enterTheUsernameUserAndPasswordPassword(String username, String password) throws Throwable {
        webDriver.findElement(By.name("uid")).sendKeys(username);
        webDriver.findElement(By.name("password")).sendKeys(password);
    }

    @Then("^Reset the credential$")
    public void resetTheCredential() throws Throwable {
        webDriver.findElement(By.name("btnReset")).click();
    }
}
