package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case1 {
	WebDriver driver=null;
	
	@Given("^the login page is opened$")
	public void the_login_page_is_opened()  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\BrowerDrivers\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("SignUp")).click();

	}
	 
	@Given("^the registration page is opened$")	 
	public void the_registration_page_is_opened()  {
	
	
	}
	
	
	@When("^enter user name as \"([^\"]*)\"$")
	public void enter_user_name_as(String arg1)  {
	driver.findElement(By.id("userName")).sendKeys(arg1);

	}	 
	@When("^enter first anme as \"([^\"]*)\"and enter last name as \"([^\"]*)\"$")
	public void enter_first_anme_as_and_enter_last_name_as(String arg1, String arg2)  {
	driver.findElement(By.id("userName")).sendKeys("rakshitha");
	driver.findElement(By.id("firstName")).sendKeys(arg1); 
	driver.findElement(By.id("lastName")).sendKeys(arg2);
	}

	@When("^enter password as \"([^\"]*)\" and enter confirm password as \"([^\"]*)\"$")	 
	public void enter_password_as_and_enter_confirm_password_as(String pass, String cpass)  {
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.name("confirmPassword")).sendKeys(cpass);
	}
	 
	@When("^enter gender as Female$")
	public void enter_gender_as_Female()  {
	WebElement radio=driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label"));
	radio.click();
	}

	@When("^enter email as \"([^\"]*)\" and enter mobile number as \"([^\"]*)\" and DOB as \"([^\"]*)\"$")	 
	public void enter_email_as_and_enter_mobile_number_as_and_DOB_as(String email, String mob, String dob)  {
	driver.findElement(By.id("emailAddress")).sendKeys(email); 
	driver.findElement(By.id("mobileNumber")).sendKeys(mob);
	driver.findElement(By.id("dob")).sendKeys(dob);
	}

	@When("^enter address \"([^\"]*)\"$")
	public void enter_address(String add)  {
	driver.findElement(By.id("address")).sendKeys(add);
	}
	@When("^enter sercurity question as (\\d+) and answer as \"([^\"]*)\"$")
	public void enter_sercurity_question_as_and_answer_as(int arg1, String arg2)  {
	Select pc=new Select(driver.findElement(By.name("securityQuestion")));
	pc.selectByIndex(0);
	driver.findElement(By.name("answer")).sendKeys(arg2);

	}

	@Then("^click on register$")
	public void click_on_register()  {
	driver.findElement(By.name("Submit")).click();
	}

	@Then("^user click on signout to exit the app$")
	public void user_click_on_signout_to_exit_the_app() {
		driver.findElement(By.name("logout"));
	}

	}
