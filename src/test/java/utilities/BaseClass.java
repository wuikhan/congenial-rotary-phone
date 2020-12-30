package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {
public static WebDriver driver;
	// this is going to accept a browser name as an argument and based on the
	// operating system it will select the driver stored in the Drivers folder
	public static void setup(String browserName) {
		String osName = System.getProperty("os.name"); // Mac or Windows or Linux

		if (osName.equalsIgnoreCase("Mac OS X")) {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
				 driver = new ChromeDriver();
			}
		} else if (osName.equalsIgnoreCase("Windows 10")) {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
				 driver = new ChromeDriver();
			}
		} else if (osName.equalsIgnoreCase("Linux")) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setJavascriptEnabled(true); // not really needed: JS enabled by default
			caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
					System.getProperty("user.dir") + "/Drivers/phantomjs");
			 driver = new PhantomJSDriver(caps);
		} else {
			System.out.println("Driver is not configured for this Operating System.");
		}
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
