package Pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormA {
	public WebDriver ldriver;
	public FormA(WebDriver rdriver) {

		this.ldriver = rdriver;
		
		PageFactory.initElements( rdriver,this);}
	
	
	
	@FindBy(xpath =" (//input[@Placeholder='Name'])[2]")
	WebElement textName;
	
	
@FindBy(xpath =" (//input[@Placeholder='Email'])[2]")
WebElement textEmail;

@FindBy(xpath = "(//input[@Placeholder='Mobile Number'])[3]")
WebElement textMobile;
@FindBy(xpath = "(//input[@Placeholder='City (Type min 3 characters)'])[2]")
WebElement textcity;
@FindBy(xpath = "(//input[@name='op'])[5]")
WebElement Btnsubmit;
public void setName(String name) {
	
    textName.clear();
	textName.sendKeys(name);
}public void  setEmai(String email) {
	
	 textEmail.clear();
	textEmail.sendKeys(email);
	
}public void setMobile(String mobile) {
	
	textMobile.clear();
	textMobile.sendKeys(mobile);
}public void setcity(String City) {
	
	textcity.clear();
	textcity.sendKeys(City);
}public void ClickSubmit() {
	
	Btnsubmit.click();
}


}