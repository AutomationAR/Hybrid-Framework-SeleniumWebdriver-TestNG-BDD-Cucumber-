package stepDefinations;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Resources.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.CricketAccessories;
import pageobject.CricketPage;
import pageobject.HomePage;

//@RunWith(Cucumber.class)
public class TestAccessoriesCount extends Base{
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(Base.class.getName());
	private int count;

	 @Given("^Initialize the browser to Homepage$")
	    public void initialize_the_browser_to_homepage() throws IOException, InterruptedException {
    	driver = initializedriver();
		driver.get(pop.getProperty("url"));
		HomePage aa = new HomePage(driver);
		log.info("Nevigate to home page");
		aa.getSportsOutdoor();
		aa.getTeamSports();
		Thread.sleep(5000);
		aa.geturlcricket();
       
    }

    @When("^Navigate to cricketpage$")
    public void navigate_to_cricketpage() {
    	CricketPage aa = new CricketPage(driver);
		aa.getcricketAccessories();
        
    }
    
    @When("^Navigate to Accessoriespage and count$")
    public void navigate_to_accessoriespage_and_count() throws InterruptedException  {
    	int count1=0;
    	CricketAccessories bb= new CricketAccessories(driver);
    	count=bb.getalllinks();
		bb.getnextpage();
		while(!bb.getnextpage().getAttribute("aria-disabled").contains("true"))
		{
			bb.getnextpage().click();
			Thread.sleep(5000);
			count=bb.getalllinks();
			count=count1+count;
		}
       
    }

    @Then("^Display Count the links $")
    public void display_count_the_links()  {
    	System.out.println(count);
		log.info("Test Is Successful");
        
    }

    @Then("^close browser$")
    public void close_browser()  {
    	driver.close();
        
    }

}