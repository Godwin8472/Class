package org.cucumber.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	WebDriver chromeDriver;
	@Given("^user intialize the chrome browser$")
	public void user_intialize_the_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\personal work\\eclipse-workspace\\Godwin\\Driver\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
	}

	@When("^user launch the facebook application$")
	public void user_launch_the_facebook_application() throws Throwable {
		chromeDriver.get("https://www.facebook.com");
		chromeDriver.manage().window().maximize();
	}

	@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password() throws Throwable {
		WebElement username=chromeDriver.findElement(By.name("email"));
		username.sendKeys("wingod97@gmail.com");
		WebElement password=chromeDriver.findElement(By.name("pass"));
		password.sendKeys("chennaitotrichy");
	}

	@Then("^user clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		WebElement login=chromeDriver.findElement(By.xpath("//input[@value='Log In']"));
		login.click();
		
	}


	
}
