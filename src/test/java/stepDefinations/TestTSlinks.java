package stepDefinations;

import pageobject.HomePage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Resources.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//@RunWith(Cucumber.class)
public class TestTSlinks extends Base{
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(Base.class.getName());

	 @Given("Initialize the browser and Navigate to Homepage")
	 public void initialize_the_browser_and_navigate_to_homepage() throws IOException {
    	driver = initializedriver();
		driver.get(pop.getProperty("url"));
    }

	 @When("User navigate to Team Sports")
	 public void user_navigate_to_team_sports() {
    	HomePage aa = new HomePage(driver);
		log.info("Home Page");
		aa.getSportsOutdoor();
		aa.getTeamSports();
    }

	 @Then("Verify that team sports has six links")
	 public void verify_that_team_sports_has_six_links() {
    	HomePage aa = new HomePage(driver);
    	System.out.println("TeamSports has link= " + aa.getTSlink());
		log.info("Test Is Successful");
    }


}