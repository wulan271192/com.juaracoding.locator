package com.juaracoding.locator.pages.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.locator.driver.DriverSingleton;

public class Dashboard {
	
	private WebDriver driver;
	
	public Dashboard() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="body > div.sidebar-nav > div > div.sidebar-menu-wrap > ul > li:nth-child(5) > a")
	private WebElement btnLogout;
	
	@FindBy(css ="body > section.dashboard-area > div > div.dashboard-bread > div > div.row.mt-4 > div:nth-child(1) > div > div > div.info-content > h4")
	private WebElement txtWallet;
	
	public void logout() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(btnLogout));
		btnLogout.click();
	}
	
	public String getWalletValue() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(btnLogout));
		return txtWallet.getText();
	}

}
