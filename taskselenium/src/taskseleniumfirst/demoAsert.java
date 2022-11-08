package taskseleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demoAsert {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

	}

	@Test
	public void search() {

		WebElement searchbutton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		WebElement searchtext = driver.findElement(By.id("small-searchterms"));
		Assert.assertTrue(searchtext.isDisplayed());
		searchtext.sendKeys("mobile");

		Assert.assertTrue(searchbutton.isDisplayed());
		searchbutton.click();

	}

	@AfterMethod
	public void close() {
		driver.close();
	}

}
