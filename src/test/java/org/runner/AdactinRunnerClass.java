package org.runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\91971\\eclipse-workspace\\adactin\\src\\test\\java\\featureFiles\\adactin.feature", glue = "org.stepdef")
public class AdactinRunnerClass {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
//		WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91971\\eclipse-workspace\\adactin\\driver12\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
