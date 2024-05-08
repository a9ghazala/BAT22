package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
WebDriver ldriver;
	
	public AdminPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	// java project
	// WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));

	// Maven project
	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmail;// email text field

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement btnLogin;

	// user defined method to perform opeartion on above web element

	public void SetEmail(String uname) throws Exception {
		txtEmail.clear();
		Thread.sleep(2000);
		txtEmail.sendKeys(uname);
	}

	public void setPassword(String pwd) throws Exception {
		txtPassword.clear();
		Thread.sleep(2000);

		txtPassword.sendKeys(pwd);
	}

	public void clickOnLogin() {
		btnLogin.click();
	}
}


