package org.igt.drivermanager.remote.web;

import org.igt.configfactory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Class to create instance for Chrome manager on SeleniumGrid for remote execution. 
 * Feb 22, 2023
 * @author Mandeep Sheoran
 * @version 1.0
 * @see DesiredCapabilities
 * @see RemoteWebDriver
 */
public class SeleniumGridChromeManager {

	private SeleniumGridChromeManager() {
	}

	/**
	 * Method to return Chrome driver instance for SeleniumGrid remote execution.
	 * Feb 22, 2023
	 * @author Mandeep Sheoran
	 * @version 1.0
	 */
	public static WebDriver getDriver() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "chrome");
		return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridUrl(), caps);
	}
}
