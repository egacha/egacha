package com.qualitystream.PruebaChoucair;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Choucairtesting_AutomatedTest {
	
	private WebDriver driver;
	By choucairLinkLocator = By.linkText("Empleos");
	By choucairpagelocator = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2020/11/150.jpg']");
	By choucairLinkbtn1 = By.className("elementor-animation-grow");
	
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void ingresoEmpleos() throws InterruptedException {
		driver.findElement(choucairLinkLocator).click();
		Thread.sleep(6000);
		if(driver.findElement(choucairpagelocator).isDisplayed()) {
		   driver.findElement(choucairLinkbtn1).click();
		
	
		}
		else System.out.print("choucair pages was not foud");
		
	}

}




