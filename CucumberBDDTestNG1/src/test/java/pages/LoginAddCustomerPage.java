package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginAddCustomerPage {

	private WebDriver driver;

	private By UserID = By.xpath("//input[@id='Input_UsernameVal2']");
	private By Password = By.xpath("//input[@id='Input_PasswordVal2']");
	private By Loginbutton = By.xpath("//button[@type='submit']");
	private By ForgetPassword = By.xpath("//a[contains(text(), 'Forgot')]");
	private By ForgotUserName=By.xpath("//a[contains(text(), 'username')]");
	private By ForgotUserBoth=By.xpath("//a[contains(text(), 'both')]");

	public LoginAddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void EnterUserID_and_Password(String userID, String password) throws InterruptedException {

		driver.findElement(UserID).sendKeys(userID);
		System.out.println("Entered UserID");
		Thread.sleep(2000);

		driver.findElement(Password).sendKeys(password);
		System.out.println("Entered Password");
		Thread.sleep(2000);

	}

	public void ClickLoginButton() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(Loginbutton).click();
		System.out.println("Clicked on Login button");

	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public String GetCustomerPageTitle() throws InterruptedException {

		Thread.sleep(2000);
		return driver.getTitle();

	}
	
	public void clickonForgetPasswordLink() {
		driver.findElement(ForgetPassword).click();
	}
	
	public void clickonForgetUserName() {
		driver.findElement(ForgotUserName).click();
	}
	
	
	public void clickonForgetBoth() {
		driver.findElement(ForgotUserBoth).click();
	}
	
	
	
}
