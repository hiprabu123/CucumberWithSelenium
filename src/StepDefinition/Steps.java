package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps { 
	
	private WebDriver driver;	
	
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	       System.setProperty("webdriver.chrome.driver", "C://Selenium//Driver//chromedriver.exe");					
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();			
	       driver.get("http://demo.guru99.com/v4");	
	       System.out.println("This Step open the Firefox and launch the application.");	        
	    //throw new PendingException();
	}
	
	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	       driver.findElement(By.name("uid")).sendKeys("username12");							
	       driver.findElement(By.name("password")).sendKeys("password12");		
	       System.out.println("This step enter the Username and Password on the login page.");	
	   //throw new PendingException();
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.name("btnReset")).click();			
		  System.out.println("This step click on the Reset button.");		
	    //throw new PendingException();
	}

}