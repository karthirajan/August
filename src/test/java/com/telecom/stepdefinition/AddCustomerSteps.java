package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps {
	
	
	
	
	@Given("User click on add customer button")
	public void user_click_on_add_customer_button() throws InterruptedException {
		handleFrame();
	    
		WebElement ele = Hook.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
		ele.click();
		
		
	}

	@When("User filling up all the details")
	public void user_filling_up_all_the_details() throws InterruptedException {
		
		handleFrame();
		
		Hook.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hook.driver.findElement(By.id("fname")).sendKeys("karthi");
		Hook.driver.findElement(By.id("lname")).sendKeys("rajan");
		Hook.driver.findElement(By.id("email")).sendKeys("karthirajan@gmail.com");
		Hook.driver.findElement(By.name("addr")).sendKeys("chennai");
		Hook.driver.findElement(By.id("telephoneno")).sendKeys("64324324655");
		
	}
	
	@When("User filling up all the details with one dim list")
	public void user_filling_up_all_the_details_with_one_dim_list(DataTable datas) throws InterruptedException {
		
		List<String> cusDatas = datas.asList();
		
          handleFrame();
		
		Hook.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hook.driver.findElement(By.id("fname")).sendKeys(cusDatas.get(0));
		Hook.driver.findElement(By.id("lname")).sendKeys(cusDatas.get(1));
		Hook.driver.findElement(By.id("email")).sendKeys(cusDatas.get(2));
		Hook.driver.findElement(By.name("addr")).sendKeys(cusDatas.get(3));
		Hook.driver.findElement(By.id("telephoneno")).sendKeys(cusDatas.get(4));
	   
	}
	
	@When("User filling up all the details with one dim map")
	public void user_filling_up_all_the_details_with_one_dim_map(DataTable datas) throws InterruptedException {
		
		Map<String, String> cusDatas = datas.asMap(String.class, String.class);
		
          handleFrame();
		
		Hook.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hook.driver.findElement(By.id("fname")).sendKeys(cusDatas.get("Fname"));
		Hook.driver.findElement(By.id("lname")).sendKeys(cusDatas.get("Lname"));
		Hook.driver.findElement(By.id("email")).sendKeys(cusDatas.get("mail"));
		Hook.driver.findElement(By.name("addr")).sendKeys(cusDatas.get("address"));
		Hook.driver.findElement(By.id("telephoneno")).sendKeys(cusDatas.get("phno"));
	   
	}
	
	@When("User filling up all the details with two dim list")
	public void user_filling_up_all_the_details_with_two_dim_list(DataTable datas) throws InterruptedException {
		
		List<List<String>> cusDatas = datas.asLists();
		
          handleFrame();
		
		Hook.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hook.driver.findElement(By.id("fname")).sendKeys(cusDatas.get(1).get(0));
		Hook.driver.findElement(By.id("lname")).sendKeys(cusDatas.get(3).get(1));
		Hook.driver.findElement(By.id("email")).sendKeys(cusDatas.get(2).get(2));
		Hook.driver.findElement(By.name("addr")).sendKeys(cusDatas.get(2).get(3));
		Hook.driver.findElement(By.id("telephoneno")).sendKeys(cusDatas.get(2).get(4));
	   
	}
	
	@When("User filling up all the details with two dim map")
	public void user_filling_up_all_the_details_with_two_dim_map(DataTable datas) throws InterruptedException {
		
		List<Map<String, String>> cusDatas = datas.asMaps(String.class, String.class);
		
          handleFrame();
		
		Hook.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hook.driver.findElement(By.id("fname")).sendKeys(cusDatas.get(1).get("FirstN"));
		Hook.driver.findElement(By.id("lname")).sendKeys(cusDatas.get(3).get("LastN"));
		Hook.driver.findElement(By.id("email")).sendKeys(cusDatas.get(2).get("Mail"));
		Hook.driver.findElement(By.name("addr")).sendKeys(cusDatas.get(2).get("Addr"));
		Hook.driver.findElement(By.id("telephoneno")).sendKeys(cusDatas.get(2).get("Phno"));
	   
	}

	
	@When("User filling up all the details {string},{string},{string},{string},{string}")
	public void user_filling_up_all_the_details(String fna, String lna, String mail, String add, String ph) throws InterruptedException {
	    
                        handleFrame();
		
		Hook.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hook.driver.findElement(By.id("fname")).sendKeys(fna);
		Hook.driver.findElement(By.id("lname")).sendKeys(lna);
		Hook.driver.findElement(By.id("email")).sendKeys(mail);
		Hook.driver.findElement(By.name("addr")).sendKeys(add);
		Hook.driver.findElement(By.id("telephoneno")).sendKeys(ph);
		
	}


	@When("User click on submit button")
	public void user_click_on_submit_button() {
	    
		Hook.driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
	}

	@Then("User will be displayed customer ID is generated")
	public void user_will_be_displayed_customer_ID_is_generated() throws InterruptedException {
		    handleFrame();
	   
		Assert.assertTrue(Hook.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		String text = Hook.driver.findElement(By.xpath("(//td[@align='center'])[2]")).getText();
		System.out.println(text);
		//Hook.driver.close();
		
		
	}
	
	public void handleFrame() throws InterruptedException {
		
		try{
			 Thread.sleep(5000);
			    Hook.driver.switchTo().frame("flow_close_btn_iframe");
			    Hook.driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
			    Hook.driver.switchTo().defaultContent();
		}catch (Exception e) {
			// TODO: handle exception
		}
		}



}
