package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebooklogin  {
	
	public WebDriver ldriver;
	public Facebooklogin(WebDriver rdriver) {

		this.ldriver = rdriver;
		
		PageFactory.initElements( rdriver,this);}
	
	@FindBy(xpath =" //input[@id='email']")
			WebElement txtEmail;
	
	
	


	@FindBy(xpath = "//input[@id='pass']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[@name='login']")
	WebElement  btnlogin;

	public void setusername(String uname) {
		
	    txtEmail.clear();
		txtEmail.sendKeys(uname);
	
	}public void setpassword(String pass) {
		txtPassword.clear();
		txtPassword.sendKeys(pass);
		
	}public void clicklogin() {
		
		
		btnlogin.click();
		
	}
}
