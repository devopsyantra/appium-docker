package com.sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LunchBrowser {
	@Test
	public void lunchapp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities Capabilities = new DesiredCapabilities();

		Capabilities.setCapability("automationName", "uiautomator2");
		Capabilities.setCapability("platformName", "Android");
		Capabilities.setCapability("platformVersion", "6.0.1");
		Capabilities.setCapability("deviceName", "Le 2");
		//Capabilities.setCapability("UDID", "330068713012a203");
		Capabilities.setCapability("appPackage", "com.android.calculator2");
		Capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);
		Thread.sleep(5000);

	}
}
