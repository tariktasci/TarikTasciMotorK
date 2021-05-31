package com.MotorK.step_definitions;

import com.MotorK.pages.MotorKContactsPage;
import com.MotorK.utilities.BrowserUtils;
import com.MotorK.utilities.ConfigurationReader;
import com.MotorK.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import javax.swing.*;

public class MotorKdemoDefs {


    @Given("the user go to MotorK's main page")
    public void the_user_go_to_MotorK_s_main_page() {

        String url = ConfigurationReader.get("url");
        //WebDriwer driver =Driver.get();
        Driver.get().get(url);
    }

    @And("the user change the page language to English")
    public void the_user_change_the_page_language_to_English() {

    //    WebDriver driver = Driver.get();
        MotorKContactsPage motorKcontact = new MotorKContactsPage();

        //accept the cookies
        motorKcontact.cookiesAccept.click();
        BrowserUtils.waitFor(2);

        //Switch to iframe
        Driver.get().switchTo().frame(1);
        BrowserUtils.waitFor(2);

        //hover over the mouse to language bar
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(motorKcontact.languageArrow).click().perform();

        BrowserUtils.waitFor(2);
        motorKcontact.changeLangEng_xpath.click();
        Driver.get().switchTo().parentFrame();

    }

    @When("the user navigates to {string}")
    public void the_user_navigates_to(String contact) {

        MotorKContactsPage motorKcontact = new MotorKContactsPage();
        BrowserUtils.waitFor(1);
        motorKcontact.cookiesAccept.click();

     //   Driver.get().switchTo().frame(1);

        BrowserUtils.waitFor(1);
     //   motorKcontact.contactPage.click();
        motorKcontact.RequestDemo.click();

        Driver.get().switchTo().parentFrame();


    }

    @Then("The user complete the form and leave message here")
    public void the_user_complete_the_form_and_leave_her_his_message_here() {
        MotorKContactsPage contactInfo = new MotorKContactsPage();
        contactInfo.firstName.sendKeys("TARIK");
        contactInfo.lastName.sendKeys("TASCI");
        contactInfo.companyName.sendKeys("MOTOR_K");
        contactInfo.email.sendKeys("tsctarik@gmail.com");
        contactInfo.phoneNumber.sendKeys("389 668 40 65");
        contactInfo.leaveYourMessage.sendKeys("I am a good Guy and I would like to be your new team mate :-)");

        BrowserUtils.waitFor(10);
    }


}
