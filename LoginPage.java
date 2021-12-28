package com.juaracoding.locator.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.locator.driver.DriverSingleton;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	private WebElement txtUsername;
	
	@FindBy(name = "password")
	private WebElement txtPassword;
	
	
	@FindBy(css = "body > div.container > div > div.modal-content.col.align-self-center > div.modal-body > div > form > div.btn-box.pt-3.pb-4 > button")
	private WebElement btnLogin;
	
	@FindBy(css  = "body > header > div.header-top-bar.padding-right-100px.padding-left-100px > div > div > div:nth-child(2) > div > div > a.theme-btn.theme-btn-small.theme-btn-transparent.ml-1.waves-effect")
	private WebElement goLoginButton;
	
	public void login(String email, String password) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		txtUsername.sendKeys(email);
		txtPassword.sendKeys(password);
		btnLogin.click();
		
		
	}
	
	public void gotoLogin() {
		
		goLoginButton.click();
		
	}

}
