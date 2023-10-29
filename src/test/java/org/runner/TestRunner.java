package org.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\java\\featureFiles\\LoginFeature.feature",
glue={"org.stepdef","com.hooks"})
public class TestRunner {
	
	
//	@AfterClass
//	public static void tearDown(){
//		driver.close();
//	}

}
