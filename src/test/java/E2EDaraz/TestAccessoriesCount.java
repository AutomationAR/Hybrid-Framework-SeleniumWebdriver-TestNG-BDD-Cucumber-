package E2EDaraz;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.Base;
import pageobject.CricketAccessories;
import pageobject.CricketPage;
import pageobject.HomePage;

public class TestAccessoriesCount extends Base{
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void StartCricketPage() throws IOException {
		driver = initializedriver();
		driver.get(pop.getProperty("url"));
		HomePage aa = new HomePage(driver);
		log.info("Nevigate to home page");
		aa.getSportsOutdoor();
		aa.getTeamSports();
		aa.geturlcricket();
	}

	@Test
	public void CountAccessories() throws InterruptedException {
		int count1=0;
		CricketPage aa = new CricketPage(driver);
		aa.getcricketAccessories();
		CricketAccessories bb= new CricketAccessories(driver);
		int count=bb.getalllinks();
		bb.getnextpage();
		while(!bb.getnextpage().getAttribute("aria-disabled").contains("true"))
		{
			bb.getnextpage().click();
			Thread.sleep(5000);
			count=bb.getalllinks();
			count=count1+count;
		}
		System.out.println(count);
		log.info("Test Is Successful");
	}

	@AfterTest
	public void ClosBrowser() {
		driver.close();
	}

	
}
