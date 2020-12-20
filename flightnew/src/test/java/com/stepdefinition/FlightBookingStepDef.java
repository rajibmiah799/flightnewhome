package com.stepdefinition;

import com.common.Base;
import com.pageobjectmodel.FlightbookingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightBookingStepDef extends Base {
	FlightbookingPage fb;

	@Given("^User is on expedia home page$")
	public void user_is_on_expedia_home_page() throws Throwable {
		getDriver();

	}

	@When("^user click on flight$")
	public void user_click_on_flight() throws Throwable {
		fb = new FlightbookingPage(driver);
		fb.clickFlight();

	}

	@When("^user click on roundtrip$")
	public void user_click_on_roundtrip() throws Throwable {
		fb.clickround();

	}

	@When("^user choose economy class$")
	public void user_choose_economy_class() throws Throwable {
		fb.ecoClass();

	}

	@When("^user enter depart airport$")
	public void user_enter_depart_airport() throws Throwable {
		fb.enterDepair();
		

	}

	@When("^user enter arival airport$")
	public void user_enter_arival_airport() throws Throwable {
		fb.enterArrive();

	}

	@When("^user choose departing month-date$")
	public void user_choose_departing_month_date() throws Throwable {
		fb.enterdepDate();

	}

	@When("^user choose returning month-date$")
	public void user_choose_returning_month_date() throws Throwable {

	}

	@When("^user click on scearch buttom$")
	public void user_click_on_scearch_buttom() throws Throwable {

	}

	@Then("^user see some relevant results$")
	public void user_see_some_relevant_results() throws Throwable {

	}

}
