package com.sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class VNCTest {

	@Test
	public void test() throws Exception {

		try {
			RemoteWebDriver driver;
			DesiredCapabilities cap = new DesiredCapabilities().chrome();
			cap.setCapability("version", "");
			cap.setPlatform(Platform.LINUX);
			driver = new RemoteWebDriver(new URL("http://selenium-hub:4444/wd/hub"), cap);
			driver.get("https://www.gmail.com/");
			Thread.sleep(10000);
			System.out.println("Build Succesfull Done!");
		} catch (Exception e) {
			throw new Exception();
		}
	}
}
