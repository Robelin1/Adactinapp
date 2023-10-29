package org.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.runner.TestRunner;

import com.hooks.AdactinHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLogin {
	public static WebDriver driver=AdactinHooks.driver;
	
	@Given("Launch The Url")
	public void launch_the_url() {
		driver.get("https://adactinhotelapp.com/");
	   
	}
	@When("user Enter the {string} in the Field")
	public void user_enter_the_in_the_field(String username) {
		WebElement name = driver.findElement(By.name("username"));
         name.sendKeys(username);
	}
	
	@When("user Enter the password {string} in the last Field")
	public void user_enter_the_password_in_the_last_field(String password) {
		WebElement passwrd = driver.findElement(By.name("password"));
	    passwrd.sendKeys(password);
	}

	
	@Then("user click Login and Navigage to the NewsFeed")
	public void user_click_login_and_navigage_to_the_news_feed() throws InterruptedException {
		WebElement login = driver.findElement(By.name("login"));
         login.click();  

         
	}
}