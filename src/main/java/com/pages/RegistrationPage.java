package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement FirstName;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement LastName;
	@FindBy(xpath = "//textarea[@ng-model='Adress']")
	WebElement Address;
	@FindBy(xpath = "//input[@type='email']")
	WebElement EmailId;
	@FindBy(xpath = "//input[@type='tel']")
	WebElement MobileNo;
	@FindBy(xpath = "//input[@type='radio']")
	WebElement Gender;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement Hobby;
	@FindBy(id = "msdd")
	WebElement Language;
	@FindBy(xpath = "//a[@class='ui-corner-all']")
	List<WebElement> lang;
	@FindBy(id = "Skills")
	WebElement Skill;
	@FindBy(id = "country")
	WebElement Country;
	@FindBy(id = "yearbox")
	WebElement Year;
	@FindBy(xpath = "//select[@placeholder='Month']")
	WebElement Month;
	@FindBy(id = "daybox")
	WebElement Date;
	@FindBy(id = "firstpassword")
	WebElement Password;
	@FindBy(id = "secondpassword")
	WebElement Conpass;

	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterFirstName(String firstName) {
		FirstName.sendKeys(firstName);

	}

	public void enterLastName(String lastName) {
		LastName.sendKeys(lastName);

	}

	public void enterAddress(String address) {
		Address.sendKeys(address);

	}

	public void enterEmail(String email) {
		EmailId.sendKeys(email);
	}

	public void enterMobile(String mobileNo) {
		MobileNo.sendKeys(mobileNo);
	}

	public void selectGender() {

	}

	public void selectHobby() {

	}

	public void selectLanguage() {

	}

	public void selectSkill() {

	}

	public void selectCountry() {

	}

	public void selectDate() {

	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
	}

	public void enterConfPass(String conpass) {
		Conpass.sendKeys(conpass);
	}
}
