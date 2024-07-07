package Utiity;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author mahen
 *
 */
public class WebDriverHelper {
	
	static WebDriver driver;
	static WebDriverHelper helper;
	
	public static WebDriverHelper getWebDriverHelper() {
		if(helper==null) {
			helper=new WebDriverHelper();
		}
		return helper;
	}
	
	public WebDriver webdriverInitilizer() {
		
		System.setProperty("Webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public void getURL(String URL) {
		driver.get(URL);
	}
	public void closeDriver() {
		driver.quit();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		WebDriverHelper.driver = driver;
	}
	
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}


	
}
