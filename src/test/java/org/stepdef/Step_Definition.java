package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.runner.AdactinRunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition {
	public static WebDriver driver = AdactinRunnerClass.driver;

	@Given("user Launch The Application")
	public void user_launch_the_application() {
		driver.get("https://adactinhotelapp.com/");
	}
//	@When("user Enter The Login Name")
//	public void user_enter_the_login_name() {
//		WebElement username = driver.findElement(By.id("username"));
//		username.sendKeys("RobelinR");
//	}
//	@When("user Enter The Password")
//	public void user_enter_the_password() {
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("14CSMQ");
//	}

	@When("user Enter The Login Name {string}")
	public void user_enter_the_login_name(String loginname) {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(loginname);
	}

	@When("user Enter The Password {string}")
	public void user_enter_the_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		;
	}

	@Then("user Click The Login and user Navigate To The Search Hotel")
	public void user_click_the_login_and_user_navigate_to_the_search_hotel() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@When("user Select The Location")
	public void user_select_the_location() {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("Melbourne");
	}

	@When("user Select The Hotels")
	public void user_select_the_hotels() {
		WebElement location = driver.findElement(By.id("hotels"));
		Select s = new Select(location);
		s.selectByValue("Hotel Hervey");
	}

	@When("user Select The RoomType")
	public void user_select_the_room_type() {
		WebElement location = driver.findElement(By.id("room_type"));
		Select s = new Select(location);
		s.selectByValue("Standard");
	}

	@When("user Select The NoOfRoom")
	public void user_select_the_no_of_room() {
		WebElement location = driver.findElement(By.id("room_nos"));
		Select s = new Select(location);
		s.selectByValue("2");
	}

	@When("user Enter The CheckInDate")
	public void user_enter_the_check_in_date() {
		driver.findElement(By.id("datepick_in")).sendKeys("6/10/2023");
	}

	@When("user Enter The CheckOutDate")
	public void user_enter_the_check_out_date() {
		driver.findElement(By.id("datepick_out")).sendKeys("10/10/2023");
	}

	@When("user Select The AdultPerRoom")
	public void user_select_the_adult_per_room() {
		WebElement room = driver.findElement(By.id("adult_room"));
		Select s = new Select(room);
		s.selectByValue("3");
	}

	@When("user Select The ChildrenPerRoom")
	public void user_select_the_children_per_room() {
		WebElement location = driver.findElement(By.id("child_room"));
		Select s = new Select(location);
		s.selectByValue("1");
	}

	@Then("user Click The Search and Navigate to the Select Hotel")
	public void user_click_the_search_and_navigate_to_the_select_hotel() {
		driver.findElement(By.id("Submit")).click();
	}

	@When("user Select The RadioButton")
	public void user_select_the_radio_button() {
		driver.findElement(By.id("radiobutton_0")).click();
	}

	@Then("click The ContinueButton Navigate To Book A Hotel")
	public void click_the_continue_button_navigate_to_book_a_hotel() {
		driver.findElement(By.id("continue")).click();
	}

	@When("user Enter The FirstName {string}")
	public void user_enter_the_first_name(String Name) {
		driver.findElement(By.id("first_name")).sendKeys(Name);
	}

	@When("user Enter The LastName {string}")
	public void user_enter_the_last_name(String Lname) {
		driver.findElement(By.id("last_name")).sendKeys(Lname);
	}

	@When("user Enter The Address {string}")
	public void user_enter_the_address(String Address) {
		driver.findElement(By.id("address")).sendKeys(Address);
	}

	@When("user Enter The CardNumber {string}")
	public void user_enter_the_card_number(String Number) {
		driver.findElement(By.id("cc_num")).sendKeys(Number);
	}

	@When("user Select The CardType")
	public void user_select_the_card_type() {
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s = new Select(cardtype);
		s.selectByIndex(2);
	}

	@When("user Select The Expiry Date")
	public void user_select_the_expiry_date() {
		WebElement cardtype = driver.findElement(By.id("cc_exp_month"));
		Select s = new Select(cardtype);
		s.selectByIndex(1);
	}

	@When("user Select The Expiry year")
	public void user_select_the_expiry_year() {
		WebElement cardtype = driver.findElement(By.id("cc_exp_year"));
		Select s = new Select(cardtype);
		s.selectByIndex(2);
	}

	@When("user Enter The CvvNumber {string}")
	public void user_enter_the_cvv_number(String cvv) {
		driver.findElement(By.id("cc_cvv")).sendKeys(cvv);
	}

	@Then("user Click The BookNow and Navigate to Booking Confirmation")
	public void user_click_the_book_now_and_navigate_to_booking_confirmation() {
		driver.findElement(By.id("book_now")).click();
	}

	
}
