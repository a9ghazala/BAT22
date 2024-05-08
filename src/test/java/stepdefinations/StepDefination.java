package stepdefinations;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminPage;
import utilities.ReadConfig;

public class StepDefination extends Base{
	@Before
	public void setUp() throws Exception {
		System.out.println("set up method execution before each scenario");
		readconfig=new ReadConfig();
		String browser=readconfig.getBrowser();
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			 
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
		}else if(browser.equalsIgnoreCase("IE")) {
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
		}
	}
	@Given("User Lanch Chrome Browser")
	public void user_lanch_chrome_browser() {
	    driver=new ChromeDriver();
	    admin=new AdminPage(driver);
	    
	}

	@When("User open url {string}")
	public void user_open_url(String url) {
	   driver.get(url);
	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws Exception {
	   admin.SetEmail(email);
	   admin.setPassword(password);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
	    admin.clickOnLogin();
	}

	@Then("User verify page title should be {string}")
	public void user_verify_page_title_should_be(String string) {
	    
	}

	@Then("close browser")
	public void close_browser() {
	    
	}
      @After
      public void tearDown(Scenario sc) throws Exception {
    	   if(sc.isFailed()==true) {
    		   String filepath="C:\\Users\\ghaza\\eclipse-workspace\\MavenCucumberProject\\ScreenShot\\failedScreenshot.png";
    		   TakesScreenshot scrShot=(TakesScreenshot)driver;
    		   File scrFile=scrShot.getScreenshotAs(OutputType.FILE);
    		   Thread.sleep(2000);
    		   File desFile=new File("filepath");
    		   FileUtils.copyFile(scrFile,desFile);
    		   Thread.sleep(2000);
    		   driver.quit();
    		   
    		   
    		   
    		   
    		   
    	   }
      }


}
