package ScenarioSteps;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bassclass {

    protected static WebDriver driver;
    
    public static void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    
    public void maximize() {
        if (driver != null) {
            driver.manage().window().maximize();
        }
    }

	
	// Value insert from text box
	public void sendKey(String location, String value) {
		WebElement insert_Value = driver.findElement(By.xpath(location));
		insert_Value.sendKeys(value);
	}
	
	
	// button click
	public void btn_Click(String location) {
		WebElement btn_location = driver.findElement(By.xpath(location));
		btn_location.click();
	}

	
	// click on alert
	public void alert() {
		Alert alert = new Alert() {

			public void sendKeys(String keysToSend) {
				// TODO Auto-generated method stub
			}

			public String getText() {
				// TODO Auto-generated method stub
				return null;
			}

			public void dismiss() {
				// TODO Auto-generated method stub
			}

			public void accept() {
				// TODO Auto-generated method stub
			}
		};

	}
	
	
	
	
	// get text from webpage
	public String get_Text(String location) {
		String text_value = driver.findElement(By.xpath(location)).getText();
		return text_value;
	}
	
	
	// close all tabs
	public void close() {
		driver.close();
	}
	
	
	// select value from drop-down
	public WebElement select_value_from_dropdown(String location, WebElement text, Integer index_value) {
		WebElement dropdown_Location = driver.findElement(By.xpath(location));
		Select select = new Select(text);
		List<WebElement> options = select.getOptions();
		WebElement dropdown_value = options.get(index_value);
		return dropdown_value;

	}

}
