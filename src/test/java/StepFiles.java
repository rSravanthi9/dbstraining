package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class StepFiles extends TestCase {

int a,b,c;

@Given("^Add Two numbers$")
public void Add_Two_numbers() throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	//this.a=a;
	//this.b=b;
}

@When("^(\\d+) addition (\\d+)$")
public void addition(int arg1, int arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	a=arg1;
	b=arg2;
	
}

@Then("^the total sum should be (\\d+)$")
public void the_total_sum_should_be(int arg3) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	assertEquals(arg3, new Calculation().calculate(a,b));
    
}


}
