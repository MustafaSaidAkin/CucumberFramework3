package com.saucelabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleLoginStepDef {
    WebDriver driver;
    By usernameInput = By.id("txtusername");
    By passwordInput = By.id("txtpassword");
    By loginButton = By.id("btnLogin");


    @Given("User wil be on login page")
    public void given1() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.get("https://opensource-demo.orangehrmlive.com/");


    }

    @When("User enter correct username and password and click login")
    public void when1() {

        driver.findElement(usernameInput).sendKeys("Admin");
        driver.findElement(passwordInput).sendKeys("admin123");
        driver.findElement(loginButton).click();


    }

    @Then("Verifiy login")
    public void then1() {

        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard", driver.getCurrentUrl());


    }
}
