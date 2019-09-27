package casestudy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case2 {
	
WebDriver driver=null;
@Given("^the login page is open$")
public void the_login_page_is_opened(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\BrowerDrivers\\chromedriver.exe");
driver= new ChromeDriver();
driver.get("http://10.232.237.143:443/TestMeApp");
driver.manage().window().maximize();
}


@When("^user click on signin$") 
public void user_click_on_signin_link(){
driver.findElement(By.linkText("SignIn")).click();
}
 
@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String username, String password){
driver.findElement(By.name("userName")).sendKeys(username);
driver.findElement(By.id("password")).sendKeys(password);
driver.findElement(By.name("Login")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

 
@Then("^message displayed Login successfully$")
public void message_displayed_Login_Successfully(){
System.out.println("login success ");
}
} 