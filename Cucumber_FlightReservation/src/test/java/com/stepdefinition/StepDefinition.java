package com.stepdefinition;

import com.library.Library;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Library {
	@Before
	public void setUp() throws Throwable {
		openBrowser();
	}

	@After
	public void tearDown() {
		CloseBrowser();
	}

	@Given("^user is in the registerpage$")
	public void user_is_in_the_registerpage() throws Throwable {
		clickonRegister();
	}

	@When("^user enters details as(.+),(.+),(.+),(.+),(.+) and (.+)$")
	public void user_enters_details_as_and(String fname, String lname, String phone, String email, String uname,
			String pwd){
		contactinfo(fname, lname, phone, email);
		userinfo(uname, pwd);
	}

	@Then("^successfully account should be created with customer name(.+)$")
	public void successfully_account_should_be_created_with_customer_name(String uname){
		verifysucessmsg(uname);
	}

	@And("^clicks on submit$")
	public void clicks_on_submit() throws Throwable {
		clickonSubmit();
	}

}
