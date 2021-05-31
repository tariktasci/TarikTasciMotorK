package com.MotorK.pages;


import com.MotorK.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MotorKContactsPage extends BasePage {

    @FindBy(css = "a#sm-16222878953376758-9")
    public WebElement languageBar;

    @FindBy(xpath = "(//i[@class='fa'])[5]")
    public WebElement languageArrow;

    @FindBy(css="ul#sm-16222861725600076-10>:nth-of-type(1)")
    public WebElement languageEN;

    @FindBy(xpath = "(//a[@href='/'])[1]")
    public WebElement changeLangEng_xpath;

    @FindBy(xpath = "(//button[@tabindex='0'])[2]")
    public WebElement cookiesAccept;

    @FindBy(xpath = "(//span[@class='elementor-button-text'])[4]")
    public WebElement RequestDemo;

    @FindBy(xpath = "(//input[@id='mauticform_input_enformbofuwebsitecontacts_first_name'])[2]")
    public WebElement firstName;

    @FindBy(xpath = "(//input[@id='mauticform_input_enformbofuwebsitecontacts_last_name'])[2]")
    public WebElement lastName;

    @FindBy(xpath = "(//input[@id='mauticform_input_enformbofuwebsitecontacts_company'])[2]")
    public WebElement companyName;

    @FindBy(xpath = "(//input[@id='mauticform_input_enformbofuwebsitecontacts_email'])[2]")
    public WebElement email;

    @FindBy(xpath = "(//input[@id='mauticform_input_enformbofuwebsitecontacts_phone_number'])[2]")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//input[@id='mauticform_input_enformbofuwebsitecontacts_how_can_we_help_you_leave'])[2]")
    public WebElement leaveYourMessage;





}