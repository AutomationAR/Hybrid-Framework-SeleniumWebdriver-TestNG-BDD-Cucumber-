package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	public WebDriver driver;

	By SportsOutdoor = By.cssSelector("li[id='Level_1_Category_No11']");
	By TeamSports = By.cssSelector("a[href*='team-sports']");
	By TSLinks = By.cssSelector("ul[data-spm='cate_11_4'] a");

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebDriver getSportsOutdoor() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(SportsOutdoor)).build().perform();
		return driver;
	}

	public WebDriver getTeamSports() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(TeamSports)).build().perform();
		return driver;
	}

	public int getTSlink() {

		List<WebElement> ss = driver.findElements(TSLinks);
		int count = ss.size();
		return count;
	}

	public WebDriver geturlcricket() {

		List<WebElement> ss = driver.findElements(TSLinks);
		ss.get(0).click();
		;
		return driver;
	}
}
