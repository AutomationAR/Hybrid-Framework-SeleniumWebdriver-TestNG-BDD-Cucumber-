package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CricketPage {
	public WebDriver driver;

	By ASSports = By.xpath("//span[contains(text(),'AS Sports')]");
	By SialkotSports = By.xpath("//span[contains(text(),'SIALKOT SPORTS DIRECT')]");
	By CricketAccessories = By.xpath("//div[contains(text(),'Accessories')]");

	public CricketPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebDriver getcricketAccessories() {

		driver.findElement(CricketAccessories).click();
		return driver;
	}

	public WebDriver getSialkotSports() {

		driver.findElement(SialkotSports).click();
		return driver;
	}

	public WebDriver getASSports() {

		driver.findElement(ASSports).click();
		return driver;
	}

}
