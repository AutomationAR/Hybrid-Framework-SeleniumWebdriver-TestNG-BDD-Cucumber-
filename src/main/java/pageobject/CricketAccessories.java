package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CricketAccessories {
	public WebDriver driver;
	By NextPage = By.cssSelector("li[title='Next Page']");
	By ProductLinks = By.cssSelector("div[data-tracking='product-card']");

	public CricketAccessories(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public int getalllinks() {

		int ww = driver.findElements(ProductLinks).size();
		return ww;
	}

	public WebElement getnextpage() {
	WebElement	nextpagebutton=driver.findElement(NextPage);
		return nextpagebutton;
	}

}
