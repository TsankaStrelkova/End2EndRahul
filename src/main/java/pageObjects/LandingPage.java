package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	// to achieve encapsulation define private variables and public methods 
	// page http://www.qaclickacademy.com/
	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath= "//a[contains(@href, 'sign_in')]")
	private WebElement loginElement; 
	
	@FindBy(css="div[role='navigation']")
	private WebElement navigationBar;
	
	public LoginPage clickOnLoginElement(WebDriver driver)
	{
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
	   wait.until(ExpectedConditions.elementToBeClickable(loginElement));
	   loginElement.click();
	   LoginPage lp = new LoginPage(driver);
	   return lp;
	   
	}
	
	public WebElement navigationBar ()
	{
		return navigationBar;
	}
	

}
