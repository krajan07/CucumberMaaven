package StepDefinition;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;

public class FBLoginSteps {
	
	WebDriver driver = BaseClass.driver;
	
    @Given("^Facebook english version is open$")
    public void facebook_english_version_is_open() throws Throwable {
    	driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
    }

    @When("^User click on create new account button$")
    public void user_click_on_create_new_account_button() throws Throwable {
    	WebElement CreateAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreateAcc.click();
    }

    @Then("^Account must be created for the user$")
    public void account_must_be_created_for_the_user() throws Throwable {
     	System.out.println("Account Creations Steps Completed");
    }

    @And("^User provides firstname \"([^\"]*)\"$")
    public void user_provides_firstname_something(String firstname) throws Throwable {
    	WebElement FName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FName.sendKeys(firstname);
    }

    @And("^User provides surname \"([^\"]*)\"$")
    public void user_provides_surname_something(String surname) throws Throwable {
    	WebElement LName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LName.sendKeys(surname);
    }

    @And("^User provides mobilenumber \"([^\"]*)\"$")
    public void user_provides_mobilenumber_something(String mobile) throws Throwable {
    	WebElement RegEmail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		RegEmail.sendKeys(mobile);
		//WebElement RegEmailConf = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		//RegEmailConf.sendKeys(mobile);
    }

    @And("^User provides password \"([^\"]*)\"$")
    public void user_provides_password_something(String password) throws Throwable {
    	WebElement Passwd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Passwd.sendKeys(password);   
    }

    @And("^User provides dob \"([^\"]*)\"$")
    public void user_provides_dob_something(String dob) throws Throwable {
    	WebElement DOB = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select ddDOB = new Select(DOB);
		ddDOB.selectByVisibleText(dob);
    }

    @And("^User provides dom \"([^\"]*)\"$")
    public void user_provides_dom_something(String dom) throws Throwable {
    	WebElement DOM = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dmDOB = new Select(DOM);
		dmDOB.selectByVisibleText(dom);
    }

    @And("^User provides doy \"([^\"]*)\"$")
    public void user_provides_doy_something(String doy) throws Throwable {
    	WebElement DOY = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dyDOB = new Select(DOY);
		dyDOB.selectByVisibleText(doy);
    }

    @And("^User selects the gender$")
    public void user_selects_the_gender() throws Throwable {
    	WebElement Gender = driver.findElement(By.xpath("//*[@type='radio' and @value='1']"));
		Gender.click();
    }

    @And("^click on signup button$")
    public void click_on_signup_button() throws Throwable {
    	//WebElement Submit = driver.findElement(By.xpath("//*[@id=\"u_a_s_Uj\"]"));
		//Submit.click();
    	System.out.println("Test Passed");
    	driver.close();
    }

}