package casestudy;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case4 {
	WebDriver driver;
	
	@Given("^User register with the app$")
	public void user_register_with_the_app()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\BrowerDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		
	}

	@When("^user search for a particular product$")
	public void user_search_for_a_particular_product() throws InterruptedException  {
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.name("Login")).click();
		WebElement search=driver.findElement(By.name("products"));
		Actions act=new Actions(driver);
		act.sendKeys(search,"carp");
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
	}

	@Then("^doesn't display the cart icon$")
	public void doesn_t_display_the_cart_icon()  {
		try {
		driver.findElement(By.linkText("Cart"));
		}
		catch(NoSuchElementException e) {
			System.out.println("cart icon not there");
		}
	}

}
