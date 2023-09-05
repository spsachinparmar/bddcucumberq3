package Stepdefinations;

import org.openqa.selenium.chrome.ChromeDriver;

import Pageobject.FormA;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefination extends Base  {

	
	    
	@Given("User hit  Chrome Browser")
	public void user_hit_chrome_browser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sparmar\\Downloads\\Software folder\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		niit=new FormA(driver);
	   Thread.sleep(2000);

	}
	

	@When("user open url {string}")
	public void user_open_url(String URL) throws Exception {
	 driver.get(URL);
	 Thread.sleep(2000);
	}

	@When("user enter Name as\"Sachin\"")
	public void user_enter_name_as_sachin( ) throws Exception {
	    niit.setName("Sachin");
	    Thread.sleep(3000);
	    
	
		
	}

	@When("user enter Email as\"Sachin1999685@test.com\"")
	public void user_enter_email_as_sachin1999685_test_com()throws Exception {
	   niit.setEmai("Sachin1999685@test.com");
	Thread.sleep(2000);
	}

	@When("user enter Mobile numnber as {string}")
	public void user_enter_mobile_numnber_as(String mobile) throws Exception {
	  niit.setMobile(mobile);
	  Thread.sleep(2000);
	}

	@When("user enter city as\"Gwalior\"")
	public void user_enter_city_as_gwalior() throws Exception {
		niit.setcity("Gwalior");
		 Thread.sleep(2000);
	   
	}

	@When("user Click on submit Butoon")
	public void user_click_on_submit_butoon() throws Exception {
	 niit.ClickSubmit();
	 Thread.sleep(2000);;
	}

	
	
	
}


