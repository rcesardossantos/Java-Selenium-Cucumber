package com.accenture.course.selenium.cucumber;

import java.util.concurrent.TimeUnit;

import com.accenture.course.selenium.cucumber.utils.Constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;



public class TestRule {

	private static WebDriver driver;

	@Before
	public void beforeCenario() {

		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);

		// Inicia o driver do ChromeDriver e navega até a pagina inicial.
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://sampleapp.tricentis.com/101/#");
	}
	

	public static WebDriver getDriver() {
		return driver;
	}

}
