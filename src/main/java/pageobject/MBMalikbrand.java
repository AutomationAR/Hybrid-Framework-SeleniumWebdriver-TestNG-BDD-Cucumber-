package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MBMalikbrand {
	public WebDriver driver;
	By Allname = By.cssSelector("div[class='c16H9d']");
	By ProductLinks = By.cssSelector("div[data-tracking='product-card']");

	public MBMalikbrand(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public int getMBplinkscount() {

		int ww = driver.findElements(ProductLinks).size();
		return ww;
	}

	public String getFirstName() {
		List<WebElement> qa = driver.findElements(Allname);
		String FirstName = qa.get(0).getText();
		return FirstName;
	}

}
