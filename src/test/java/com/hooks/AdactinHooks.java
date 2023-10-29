package com.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AdactinHooks {

	public static WebDriver driver=null;
	@Before
	public static void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91971\\eclipse-workspace\\adactin\\driver12\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public static void tearDown(){
		driver.close();
	}
	
}
