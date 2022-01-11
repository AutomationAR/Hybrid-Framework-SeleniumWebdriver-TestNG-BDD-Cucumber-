package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;
	public Properties pop;

	public WebDriver initializedriver() throws IOException {
		pop = new Properties();
		FileInputStream hh = new FileInputStream(System.getProperty("user.dir")+"\\Data-File");
		pop.load(hh);
		String browserName = pop.getProperty("browser");
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public void getscreenshotpath(String testname, WebDriver driver) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)(driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		String localsource=System.getProperty("user.dr")+"//reports//"+testname+".png";
		FileUtils.copyFile(source, new File(localsource));
	}

}
