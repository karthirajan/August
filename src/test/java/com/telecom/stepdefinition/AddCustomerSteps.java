package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps {
	
	static WebDriver driver;
	
	@Given("User launch telecom site")
	public void user_launch_telecom_site() {
	    
		System.setProperty("webdriver.chrome.driver", ".//driver//Chrome83//chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/telecom/");
	}

	@Given("User click on add customer button")
	public void user_click_on_add_customer_button() throws InterruptedException {
		handleFrame();
	    
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
	}

	@When("User filling up all the details")
	public void user_filling_up_all_the_details() throws InterruptedException {
		
		handleFrame();
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys("karthi");
		driver.findElement(By.id("lname")).sendKeys("rajan");
		driver.findElement(By.id("email")).sendKeys("karthirajan@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("64324324655");
		
	}
	
	@When("User filling up all the details with one dim list")
	public void user_filling_up_all_the_details_with_one_dim_list(DataTable datas) throws InterruptedException {
		
		List<String> cusDatas = datas.asList();
		
          handleFrame();
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(cusDatas.get(0));
		driver.findElement(By.id("lname")).sendKeys(cusDatas.get(1));
		driver.findElement(By.id("email")).sendKeys(cusDatas.get(2));
		driver.findElement(By.name("addr")).sendKeys(cusDatas.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(cusDatas.get(4));
	   
	}
	
	@When("User filling up all the details with one dim map")
	public void user_filling_up_all_the_details_with_one_dim_map(DataTable datas) throws InterruptedException {
		
		Map<String, String> cusDatas = datas.asMap(String.class, String.class);
		
          handleFrame();
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(cusDatas.get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(cusDatas.get("Lname"));
		driver.findElement(By.id("email")).sendKeys(cusDatas.get("mail"));
		driver.findElement(By.name("addr")).sendKeys(cusDatas.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(cusDatas.get("phno"));
	   
	}



	@When("User click on submit button")
	public void user_click_on_submit_button() {
	    
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
	}

	@Then("User will be displayed customer ID is generated")
	public void user_will_be_displayed_customer_ID_is_generated() throws InterruptedException {
		    handleFrame();
	   
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		String text = driver.findElement(By.xpath("(//td[@align='center'])[2]")).getText();
		System.out.println(text);
		driver.close();
		
		
	}
	
	public void handleFrame() throws InterruptedException {
		
			 Thread.sleep(5000);
			    driver.switchTo().frame("flow_close_btn_iframe");
			    driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
			    driver.switchTo().defaultContent();

		}



}
