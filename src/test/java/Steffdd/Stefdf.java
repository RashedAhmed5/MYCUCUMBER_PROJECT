package Steffdd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stefdf {
	WebDriver driver;
	@Given("^Open Application URL$")
	public void open_Application_URL() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");   
		   ChromeOptions ops = new ChromeOptions();
		   ops.addArguments("--remote-allow-origins=*");
		   driver = new ChromeDriver();
		   driver.get("https://www.demoblaze.com/");
		   driver.manage().window().maximize();	 
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		   driver.manage().deleteAllCookies();   
	}

	@When("^Click Login link$")
	public void click_Login_link() throws Throwable {
	WebElement login =driver.findElement(By.id("login2")); 
	login.click();
	}

	@Then("^Verify Login page display$")
	public void verify_Login_page_display() throws Throwable {
    //String tom= driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/h5")).getText();
	//System.out.println(tom);
	Thread.sleep(3000);
	boolean loginpage =driver.findElement(By.id("logInModalLabel")).isDisplayed();
	Assert.assertTrue(loginpage);
	driver.close();
	
	}
	@When("^Click cart link$")
	public void click_cart_link() throws Throwable {
	WebElement cart=driver.findElement(By.id("cartur"));
	cart.click();
	}

	@Then("^Verify cart page display$")
	public void verify_cart_page_display() throws Throwable {
   boolean result= driver.findElement(By.xpath("//h2[text()='Products']")).isDisplayed(); 
    Assert.assertTrue(result);
    driver.close();
	}
}
