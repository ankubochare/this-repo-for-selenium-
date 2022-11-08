package taskseleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoData {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "logindata")
	public void login(String user, String pwd) {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		WebElement txtemail = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		txtemail.sendKeys(user);
		txtemail.clear();

		WebElement txtpass = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		txtpass.sendKeys(pwd);
		txtpass.clear();
	}

	@DataProvider(name = "logindata")
	public String[][] getdata() {
		String logindata[][] = { { "admin1stroe@gamil.com", "admin" }, { "admin2stroe@gamil.com", "admin" },
				{ "admin3stroe@gamil.com", "admin" }, { "admin4stroe@gamil.com", "admin" }, };
		return logindata;
	}

	@AfterTest
	public void setdown() {
		driver.close();
	}
}
