package casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case3 {
	WebDriver driver;
	@Given("^User enters the url$")
	public void user_enters_the_url() {
	// Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\BrowerDrivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.manage().window().maximize();
	}

	 
	@When("^user logs in$")
	public void user_logs_in() {
	// Write code here that turns the phrase above into concrete actions
	driver.findElement(By.linkText("SignIn")).click();
	driver.findElement(By.name("userName")).sendKeys("Lalitha");
	driver.findElement(By.name("password")).sendKeys("Password123");
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.findElement(By.name("Login")).click();
	}

	 
	@When("^user searches for a product by typing four chars and adds to cart$")
	public void user_searches_for_a_product_by_typing_four_chars_and_adds_to_cart() throws InterruptedException {
	// Write code here that turns the phrase above into concrete actions
	WebElement search=driver.findElement(By.id("myInput"));
	Actions act=new Actions(driver);
	act.sendKeys(search,"carp").perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	//Thread.sleep(2000);
	//driver.findElement(By.name("val")).click();
	driver.findElement(By.xpath("//a[@href='#' and @class='btn btn-success btn-product']")).click();
	driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
	driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	Thread.sleep(1000);
	}

	 
	@Then("^user makes the payment$")
	public void user_makes_the_payment() {
	// Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div")).click();
	driver.findElement(By.id("btn")).click();
	driver.findElement(By.name("username")).sendKeys("123456");
	driver.findElement(By.name("password")).sendKeys("Pass@456");
	driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	driver.findElement(By.linkText("SignOut")).click();
	driver.close();
	}
	}
