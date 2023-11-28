package cucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountStepDefinitions {

    private int balance;
    
    @Given("the user balance is {int} dollars")
    public void the_user_balance_is_dollars(Integer balance) {
        this.balance = balance;
    }

    @When("user deposits {int} dollars")
    public void user_deposits_dollars(Integer amount) {
        balance += amount;
    }

    @Then("balance is {int} dollars")
    public void balance_is_dollars(Integer expectedAnswer) {
        assertEquals(expectedAnswer, balance);
    }
}
