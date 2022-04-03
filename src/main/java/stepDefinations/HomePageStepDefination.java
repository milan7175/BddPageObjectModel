package stepDefinations;

import org.junit.Assert;

import amazonPages.AmazonSignInPage;
import amazonPages.Amazonpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilitiesFiles.BaseClass;

public class HomePageStepDefination extends BaseClass {
	
	public HomePageStepDefination() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	Amazonpage amazonpage;
	AmazonSignInPage signIn;
	
	
	@Given("^User opens browser$")
	public void User_opens_browser() throws Exception {
		initialization();
		amazonpage = new Amazonpage();
		signIn= new AmazonSignInPage();
		
	}
	

@Then("page title is Amazon.ca: Low Prices – Fast Shipping – Millions of Items")
public void page_title_is_amazon_ca_low_prices_fast_shipping_millions_of_items() {
    String title = driver.getTitle();
    System.out.println(title);
    //Assert.assertEquals(title, "Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
    
}
@Then("user hovers to signIn button and click")
public void user_hovers_to_sign_in_button_and_click() throws Throwable  {
//amazonpage = new Amazonpage();
	amazonpage.goToSignIn();
}
@Then("enter emailId and continue")
public void enter_email_id_and_continue() throws Exception {
	//signIn = new AmazonSignInPage();
	signIn.verifyEmailId(prop.getProperty("username"));
    
}
@Then("enter password and continue")
public void enter_password_and_continue() throws Exception {
	//signIn = new AmazonSignInPage();
    signIn.verifyPassword(prop.getProperty("password"));
}

	
	
@Then("validate home page")
public void validate_home_page() {

	String title = driver.getTitle();
	Assert.assertEquals(title, "Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
}
@Then("close the browser")
public void close_the_browser() {
    driver.quit();
}


//	public HomePageStepDefination() throws Exception {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	

}
