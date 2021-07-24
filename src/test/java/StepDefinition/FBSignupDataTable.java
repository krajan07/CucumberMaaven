package StepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBSignupDataTable {

	WebDriver driver = BaseClass.driver;

    @Given("^Facebook english web url is open$")
    public void facebook_english_web_url_is_open() throws Throwable {
    	driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
    }

    @When("^User clicks create new account button$")
    public void user_clicks_create_new_account_button() throws Throwable {
    	WebElement CreateAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreateAcc.click();
    }

    @Then("^Account creation must be successful$")
    public void account_creation_must_be_successful() throws Throwable {
    	System.out.println("Account Creations Steps Completed");
        
    }
    
    @And("^User creates the new account$")
    public void user_creates_the_new_account(DataTable table) throws Throwable {
    	
    	String firstname = table.cell(1,1);
    	String surname = table.cell(2,1);
    	String mobile = table.cell(3,1);
    	String password = table.cell(4,1);
    	String dob = table.cell(5,1);
    	String dom = table.cell(6,1);
    	String doy = table.cell(7,1);
    	
    	
    	WebElement FName = driver.findElement(By.xpath("//input[@name='firstname']"));
    	WebElement LName = driver.findElement(By.xpath("//input[@name='lastname']"));
    	WebElement RegEmail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement Passwd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		WebElement DOB = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement DOM = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement DOY = driver.findElement(By.xpath("//select[@name='birthday_year']"));

    	FName.sendKeys(firstname);
		LName.sendKeys(surname);
		RegEmail.sendKeys(mobile);
		Passwd.sendKeys(password);   
		Select ddDOB = new Select(DOB);
		ddDOB.selectByVisibleText(dob);
		Select dmDOB = new Select(DOM);
		dmDOB.selectByVisibleText(dom);
		Select dyDOB = new Select(DOY);
		dyDOB.selectByVisibleText(doy);
    }
        
    @And("^Select gender$")
    public void select_gender() throws Throwable {
    	WebElement Gender = driver.findElement(By.xpath("//*[@type='radio' and @value='2']"));
		Gender.click();
    }

    @And("^Click signup button$")
    public void click_signup_button() throws Throwable {
    	//WebElement Submit = driver.findElement(By.xpath("//*[@id=\"u_a_s_Uj\"]"));
		//Submit.click();
    	System.out.println("Test Passed");
    	driver.close();
    }
	
	
}
