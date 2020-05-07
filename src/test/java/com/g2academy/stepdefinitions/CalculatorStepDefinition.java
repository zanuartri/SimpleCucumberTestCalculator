package com.g2academy.stepdefinitions;

import com.g2academy.Calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CalculatorStepDefinition {
    private Calculator calculator;
    private int total;

    @Before
    private void init() {
        total = 0;
        calculator = null;
    }

    @Given("^I have a calculator$")
    public void calculatorInit() {
        calculator = new Calculator();
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void testAdd(int a, int b) {
        total = calculator.add(a, b);
    }

    @When("^I subtract (\\d+) by (\\d+)$")
    public void testSubtract(int a, int b) {
        total = calculator.subtract(a, b);
    }

    @When("^I multiply (\\d+) by (\\d+)$")
    public void testMultiply(int a, int b) {
        total = calculator.multiply(a, b);
    }

    @When("^I divide (\\d+) by (\\d+)$")
    public void testDivide(int a, int b) {
        total = calculator.divide(a, b);
    }

    @Then("^the result should be (\\d+)$")
    public void assertTotal(int result) {
        Assert.assertThat(total, Matchers.equalTo(result));
    }
}
