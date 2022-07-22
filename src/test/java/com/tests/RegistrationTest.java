package com.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.RegistrationPage;
import com.utility.PropertiesUtils;


 @Listeners(com.listener.MyListener.class)
public class RegistrationTest extends BaseClass {

	public RegistrationPage rg = null;
	
	
	@BeforeSuite
	public void setUp() throws Exception {
		intialization();
		rg = new RegistrationPage(driver);
		
	}

	@Test(priority = 0)
	public void firstName() throws Exception {
		log.info( "Enter the First Name" );
		String FirstName = PropertiesUtils.readProperty("firstName");

		rg.enterFirstName(FirstName);
		
		log.error( "Unable to enter the First Name" );

	}

	@Test (priority = 1)
	public void lastName() throws Exception {

		String LastName = PropertiesUtils.readProperty("lastName");
		log.info( "Enter the Last Name" );

		rg.enterLastName(LastName);
	}

	@Test (priority = 2)
	public void address() throws Exception {
		String add = PropertiesUtils.readProperty("address");
		log.info( "Enter the Address" );

		rg.enterAddress(add);
	}

	@Test (priority = 3)
	public void email() throws Exception {

		String emailID = PropertiesUtils.readProperty("email");
		log.info( "Enter the EmailID" );

		rg.enterEmail(emailID);
	}

	@Test (priority = 4)
	public void mobile() throws Exception {
		String mobileNO = PropertiesUtils.readProperty("mobile");
		log.info( "Enter the Mobile Number" );

		rg.enterMobile(mobileNO);
	}

	@Test (priority = 5)
	public void password() throws Exception {
		String pass = PropertiesUtils.readProperty("password");
		log.info( "Enter the Password" );

		rg.enterPassword(pass);
	}

	@Test (priority = 6)
	public void confirmPassword() throws Exception {
		String conpass = PropertiesUtils.readProperty("confirmpassword");
		log.info( "Enter the Confirmation Password" );

		rg.enterConfPass(conpass);
	}

	@AfterSuite
	public void tearDown() {
		log.info( "Driver is closing now" );

		driver.close();
		log.info( "Driver is closed now" );

	}
}
