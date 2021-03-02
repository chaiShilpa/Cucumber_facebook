package com.quinbay.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author kumar on 12/01/21
 * @project X-search
 */

public class CucumberHooks {
 public WebDriver driver;

  @Before
  public void Launch_Browser() {
    System.out.println("facebook");
    System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver_mac64/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();

  }


  @After
  public void Quit(){
    driver.close();

  }
}
