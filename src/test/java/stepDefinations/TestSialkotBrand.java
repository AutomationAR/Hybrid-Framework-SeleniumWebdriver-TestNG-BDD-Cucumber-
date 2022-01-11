package stepDefinations;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Resources.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.CricketPage;
import pageobject.HomePage;
import pageobject.Sialkotbrand;

public class TestSialkotBrand extends Base {
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(Base.class.getName());
	
	 @Given("^Initialize Homepage$")
	    public void initialize_homepage() throws IOException, InterruptedException{
		 driver = initializedriver();
			driver.get(pop.getProperty("url"));
			HomePage aa = new HomePage(driver);
			log.info("Nevigate to home page");
			aa.getSportsOutdoor();
			aa.getTeamSports();
			aa.geturlcricket();
	       // throw new PendingException();
	    }

	 @When("User navigate to Accessories page")
	 public void user_navigate_to_accessories_page() throws InterruptedException {
	    	CricketPage bb = new CricketPage(driver);
			bb.getSialkotSports();
			Thread.sleep(5000);
	        //throw new PendingException();
	    }

	 @Then("Verify that SialkotBrand has - links")
	 public void verify_that_sialkot_brand_has_links()  {
	    	Sialkotbrand cc = new Sialkotbrand(driver);
			System.out.println("Sialkot brand has products= "+cc.getSplinkscount());
			log.info("Test Is Successful");
	       // throw new PendingException();
	    }

	}


