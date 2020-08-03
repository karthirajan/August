package com.telecom.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {
	
	static WebDriver driver;
	
	@Given("User launch telecom site")
	public void user_launch_telecom_site() {
	    
		System.setProperty("webdriver.chrome.driver", ".//driver//Chrome83//chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
	}

	@Given("User click on add customer button")
	public void user_click_on_add_customer_button() {
	    
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
	}

	@When("User filling up all the details")
	public void user_filling_up_all_the_details() {
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys("karthi");
		driver.findElement(By.id("lname")).sendKeys("rajan");
		driver.findElement(By.id("email")).sendKeys("karthirajan@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("64324324655");
		
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
	    
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
	}

	@Then("User will be displayed customer ID is generated")
	public void user_will_be_displayed_customer_ID_is_generated() {
	   
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		String text = driver.findElement(By.xpath("(//td[@align='center'])[2]")).getText();
		System.out.println(text);
		
		
	}



}
