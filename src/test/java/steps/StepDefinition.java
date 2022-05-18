package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BackGroundPage;
import pages.BasePage;


public class StepDefinition extends BasePage {

	BackGroundPage backGroundPage;
	
	@Before
	public void beforeRun() {
		initDriver();
		backGroundPage = PageFactory.initElements(driver, BackGroundPage.class);
	}
	
	@Given("^user is on Techfios Page$")
	public void user_is_on_Techfios_Page(){
		driver.get("https://techfios.com/test/101/index.php");
	}

	@When("^user click the skyblue button$")
	public void user_click_the_skyblue_button() {
		backGroundPage.clickBlueButton();
	}

	@Then("^Background color will change to sky blue$")
	public void background_color_will_change_to_sky_blue() {
	   
	}
	
	@When("^user click the white button$")
	public void user_click_the_white_button() {
		backGroundPage.clickWhiteButton();
	}

	@Then("^Background color will change to white blue$")
	public void background_color_will_change_to_white_blue() {

	}
	
//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
