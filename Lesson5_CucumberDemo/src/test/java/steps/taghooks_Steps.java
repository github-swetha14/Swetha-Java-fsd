package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class taghooks_Steps {

	@Given("this is the first step")
	public void this_is_the_first_step() {
	  System.out.println("This is my first step"); 
	}

	@When("this is the second step")
	public void this_is_the_second_step() {
	  System.out.println("This is my second step");  
	}

	@Then("this is the third step")
	public void this_is_the_third_step() {
	  System.out.println("This is my third step");
	}

}
