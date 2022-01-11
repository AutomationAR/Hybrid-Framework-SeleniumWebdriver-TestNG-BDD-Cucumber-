package E2EDaraz;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Resources.Base;
import pageobject.HomePage;

public class TestTSlinks extends Base {
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(Base.class.getName());
	@Test
	public void TTSlinks() throws IOException {
		driver = initializedriver();
		driver.get(pop.getProperty("url"));
		HomePage aa = new HomePage(driver);
		log.info("Home Page");
		aa.getSportsOutdoor();
		aa.getTeamSports();
		System.out.println("TeamSports has link= " + aa.getTSlink());
		log.info("Test Is Successful");
		aa.geturlcricket();
	}

}
