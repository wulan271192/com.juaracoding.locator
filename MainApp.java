package com.juaracoding.locator.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.locator.driver.DriverSingleton;
import com.juaracoding.locator.pages.dashboard.Dashboard;
import com.juaracoding.locator.pages.login.LoginPage;

public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("https://www.phptravels.net/");
		
		
		LoginPage login = new LoginPage();
		
		login.gotoLogin();
		
		/*
		 * Email user@phptravels.com
           Password demouser
		 */
		login.login("user@phptravels.com", "demouser");
		
		Dashboard dashboard = new Dashboard();
		
		System.out.println("Nilainya adalah " +dashboard.getWalletValue());
		
		dashboard.logout();

	}

}
