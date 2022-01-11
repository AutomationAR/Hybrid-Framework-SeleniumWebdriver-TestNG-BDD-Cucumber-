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
import pageobject.MBMalikbrand;

public class TestASSportsBrand extends Base {
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(Base.class.getName());

    @Given("^Initialize Homepage and nevigate to cricketpage$")
    public void initialize_homepage_and_nevigate_to_cricketpage() throws IOException, InterruptedException {
    	driver = initializedriver();
		driver.get(pop.getProperty("url"));
		HomePage aa = new HomePage(driver);
		log.info("Nevigate to home page");
		aa.getSportsOutdoor();
		aa.getTeamSports();
		aa.geturlcricket();
       // throw new PendingException();
    }

    @When("^User navigate to ASSports page $")
    public void user_navigate_to_assports_page() throws InterruptedException  {
    	CricketPage aa = new CricketPage(driver);
		aa.getASSports();
		Thread.sleep(5000);
        //throw new PendingException();
    }

    @Then("^display that ASSports has - links and first name  $")
    public void display_that_assports_has_links_and_first_name()  {
    	MBMalikbrand bb = new MBMalikbrand(driver);
		System.out.println("Product Count= "+bb.getMBplinkscount());
		System.out.println("First Name of The Product= "+bb.getFirstName());
		log.info("Test Is Successful");
       // throw new PendingException();
    }

}