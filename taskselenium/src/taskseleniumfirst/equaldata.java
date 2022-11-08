package taskseleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class equaldata {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "logindata")
	public void login(String user, String pwd) {
		driver.get("https://demos.equal-online.com/login");
		WebElement txtmail = driver.findElement(By.xpath("//input[@id=\"u_email\"]"));
		txtmail.sendKeys(user);
		txtmail.clear();

		WebElement txtpass = driver.findElement(By.xpath("//input[@id=\"u_password\"]"));
		txtpass.sendKeys(pwd);
		txtpass.clear();
	}

	@DataProvider(name = "logindata")
	public String[][] getData() {
		String logindata[][] = { { "ankita@gmail.com", "admin" }, { "afshan@gmail.com", "admin" },
				{ "anku@gmail.com", "admin" }, { "Hardik@gmail.com", "admin" }, };
		return logindata;
	}

	@AfterClass
	public void setdown() {
		driver.close();
	}
}
