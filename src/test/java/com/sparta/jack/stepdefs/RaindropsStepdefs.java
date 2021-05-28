package com.sparta.jack.stepdefs;

import com.sparta.jack.RaindropsClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class RaindropsStepdefs {

    String response;
    RaindropsClass raindropsClass;

    @Given("I have a raindrops class")
    public void iHaveARaindropsClass() {
        raindropsClass = new RaindropsClass();

    }

    @When("I pass in {int}")
    public void iPassIn(int n) {
        response = raindropsClass.raindrops(n);

    }

    @Then("I am returned {string}")
    public void iAmReturned(String expected) {
        Assertions.assertEquals(expected, response);
    }
}
