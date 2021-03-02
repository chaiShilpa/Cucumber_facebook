package com.quinbay.cucumber.steps;

import com.quinbay.cucumber.CucumberHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

/**
 * @author kumar on 12/01/21
 * @project X-search
 */

public class LoginSteps  {
  CucumberHooks base=new CucumberHooks();

  //WebDriver driver;
  @Given("^I am on Facebook login page$")
  public void goToFacebook() throws InterruptedException {
    Thread.sleep(3000);

    System.out.println("Test Facebook Page");

    base.driver.get("https://facebook.com/");

  }

  @When("^I enter username as \"(.*)\"$")
  public void enterUserName(String userName) {
    System.out.println("UserName:" + userName);
    base.driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
  }

  @And("^I enter password as \"(.*)\"$")
  public void iEnterPasswordAs(String password) {
    System.out.println("UserName:" + password);
    base.driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
  }

  @Then("Login should fail")
  public void loginShouldFail() {
    System.out.println("Login Failed");
    base.driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
  }

  @Then("this is a test")
  public void m2(){

  }

}
