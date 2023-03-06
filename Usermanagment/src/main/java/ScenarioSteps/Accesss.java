package ScenarioSteps;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Accesss extends Bassclass {

	@Given("Basic browser configuration")

	public void basic_browser_configuration() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // remove "WebDriver" type to initialize class level "driver" object
		driver.get("https://krsstage.azurewebsites.net/Account/Logout");
		maximize();
	}

	@When("KRS Login {string} and {string}")
	public void krs_Login_and(String string, String string2) {

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(string);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(string2);

		driver.findElement(By.xpath("//a[@id='btnlogin']")).click();
		
		

	}

	@When("Enter the Job Roles access{string}")
	public void enter_the_Job_Roles_access(String string) {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  

		driver.findElement(By.xpath("(//a[@class='dropdown-toggle nav-btn'])[3]")).click(); // Job drop-down

		driver.findElement(By.xpath("//li[@id=\"navJobs\"]")).click();

		boolean Addbtn_job = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).isEnabled();
		
		if (string.equals("View Only")) {
			if (Addbtn_job == true) {
				System.out.println("Add button is enabled");
			} else {
				System.out.println("Add button is disabled");
			}
		}
		else if (string.equals("Limited Access")) {
			if (Addbtn_job == true) {
				
			}
		}	else {
			System.out.println();
		}

	}
}
