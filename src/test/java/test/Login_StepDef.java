package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Login_StepDef {
	WebDriver driver;
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chromedriver", "chromedriver");
		 
		
	    driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
	}
	
	@After
	public void teardown() {
		
		driver.quit();
	}

	@Given("^user has opened amazon wevsite on chrome browser$")
    public void user_has_opened_amazon_wevsite_on_chrome_browser() throws Throwable {
		
		
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
    }

    @When("^user enters the correct username and paasword$")
    public void user_enters_the_correct_username_and_paasword() throws Throwable {
    	 WebElement lnkLogin = driver.findElement(By.linkText("Log in"));
 		
 		lnkLogin.click();
 		
 		//driver.quit();
 		
 		WebElement welcomeback = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]")); //to find a string
 		//*[contains(text(),'Welcome')]
 		WebElement editUsername = driver.findElement(By.xpath("//input[@name='user_login']"));
 		
 		editUsername.sendKeys("abc@xyz.com");
 		
 		WebElement editpwd = driver.findElement(By.xpath("//input[@name='user_pwd']"));
 		
 		editpwd.sendKeys("123");
 		

 		
 		WebElement btnlgn = driver.findElement(By.xpath("//input[@name='btn_login']"));
 		
 		btnlgn.click();


    	
    }
    @When("^User enters correct \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_correct_something_and_something(String username, String password) throws Throwable {
    	 WebElement lnkLogin = driver.findElement(By.linkText("Log in"));
  		
  		lnkLogin.click();
  		
  		//driver.quit();
  		
  		WebElement welcomeback = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]")); //to find a string
  		//*[contains(text(),'Welcome')]
  		WebElement editUsername = driver.findElement(By.xpath("//input[@name='user_login']"));
  		
  		editUsername.sendKeys(username);
  		
  		WebElement editpwd = driver.findElement(By.xpath("//input[@name='user_pwd']"));
  		
  		editpwd.sendKeys(password);
  		

  		
  		WebElement btnlgn = driver.findElement(By.xpath("//input[@name='btn_login']"));
  		
  		btnlgn.click();
  	

    }


    @When("^user enters the incorrect username and paasword$")
    public void user_enters_the_incorrect_username_and_paasword() throws Throwable {
       
    }

    @Then("^user should be able to login$")
    public void user_should_be_able_to_login() throws Throwable {
      
    }

    @Then("^user should not be able to login$")
    public void user_should_not_be_able_to_login() throws Throwable {
     
    }

}

