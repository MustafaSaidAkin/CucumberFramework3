package com.saucelabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleFirstStepDefinition {


    @Given("This is Given {int}")
    public void method1(int integer){
  System.out.println("This is given method1" + integer);


    }


    @When("This is {String}")
    public void method2(){
        System.out.println("This is when method2");
    }

    @Then("This is Then")
    public void method3(){
        System.out.println("This is then method3");
    }
}
