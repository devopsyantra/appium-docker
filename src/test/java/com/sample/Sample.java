package com.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Sample {

	
	@Test
	public void test(){
		
		WebDriver wDriver=null;
		ChromeDriverManager.getInstance().setup();
		wDriver = new ChromeDriver();
		wDriver.get("https://www.facebook.com/");
		wDriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
	}
}
