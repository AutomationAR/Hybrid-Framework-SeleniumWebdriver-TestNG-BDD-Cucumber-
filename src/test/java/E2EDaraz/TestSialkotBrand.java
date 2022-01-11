package E2EDaraz;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;
import pageobject.CricketPage;
import pageobject.HomePage;
import pageobject.Sialkotbrand;

public class TestSialkotBrand extends Base {
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
	public void ProductCountBsialkot() throws InterruptedException {
		CricketPage bb = new CricketPage(driver);
		bb.getSialkotSports();
		Thread.sleep(5000);
		Sialkotbrand cc = new Sialkotbrand(driver);
		System.out.println("Sialkot brand has products= "+cc.getSplinkscount());
		log.info("Test Is Successful");

	}

	@AfterTest
	public void Closebrowser() {
		driver.close();
	}

}
