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
import pageobject.MBMalikbrand;

public class TestASSportsBrand extends Base {
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
	public void ASSportslink() throws InterruptedException {
		CricketPage aa = new CricketPage(driver);
		aa.getASSports();
		Thread.sleep(5000);
		MBMalikbrand bb = new MBMalikbrand(driver);
		System.out.println("Product Count= "+bb.getMBplinkscount());
		System.out.println("First Name of The Product= "+bb.getFirstName());
		log.info("Test Is Successful");
	}

	@AfterTest
	public void ClosBrowser() {
		driver.close();
	}

}
