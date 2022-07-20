package StepDefintions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepLogin {
	String ProjectLocation = System.getProperty("user.dir");
	WebDriver driver;
	String baseUrl = "http://demo.guru99.com/test/newtours/";
	
	@Given("^je suis sur la page autho$")
	public void je_suis_sur_la_page_autho() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
System.setProperty("webdriver.chrome.driver", ProjectLocation + "\\lib\\chromedriver\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(baseUrl);
	}

	@When("^je me conecte$")
	public void je_me_conecte() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^je suis connecte$")
	public void je_suis_connecte() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
		
	}
}
