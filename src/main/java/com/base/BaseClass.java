package com.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.utility.PropertiesUtils;

public class BaseClass {
	
	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger(BaseClass.class);
	public static void intialization() throws Exception {
		
		String browser = PropertiesUtils.readProperty("browser");
		log.info("reading a browse name from config" +browser);
		if(browser.equals("chrome")) {
		log.info("reading driver name from config >>>> Chrome " );	
			
			System.setProperty("webdriver.chrome.driver", "chromedriver103.exe");
			driver = new ChromeDriver();
		}else if (browser.equals("firefox")){
			log.info("reading driver name from config >>>> FireFox " );	

			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		log.info(" Opening the url " );	

		driver.get(PropertiesUtils.readProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	

}
